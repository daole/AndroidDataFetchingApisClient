package com.dreamdigitizers.androiddatafetchingapisclient.core;

import android.content.Context;
import android.util.Base64;
import android.util.Log;

import com.dreamdigitizers.androiddatafetchingapisclient.R;
import com.dreamdigitizers.androiddatafetchingapisclient.models.MusicNct;
import com.dreamdigitizers.androiddatafetchingapisclient.models.MusicZing;
import com.dreamdigitizers.androiddatafetchingapisclient.models.nct.NctSearchResult;
import com.dreamdigitizers.androiddatafetchingapisclient.models.zing.ZingSearchResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Query;
import rx.Observable;

public class Api implements IApi {
    private static final String TAG = Api.class.getSimpleName();

    private static final String ERROR_MESSAGE__NOT_YET_INITIALIZED = "Api has not yet been initialized. Please call Api.initialize(pContext) first.";

    private static final String API_USER_NAME = "androiddatafetchingapisclient";
    private static final String API_USER_PASSWORD = "androiddatafetchingapisclient";
    private static final String API_AUTHENTICATION = Api.API_USER_NAME + ":" + Api.API_USER_PASSWORD;

    private static Api instance;

    private IApi mApi;
    private Retrofit mRetrofit;

    public static void initialize(Context pContext) {
        if (Api.instance == null) {
            Api.instance = new Api(pContext);
        }
    }

    public static IApi getInstance() {
        if(Api.instance == null) {
            throw new IllegalStateException(Api.ERROR_MESSAGE__NOT_YET_INITIALIZED);
        }
        return Api.instance;
    }

    public static void dispose() {
        if (Api.instance != null) {
            Api.instance = null;
        }
    }

    private Api(Context pContext) {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain pChain) throws IOException {
                        Request request = pChain.request();
                        Request.Builder requestBuilder = request.newBuilder()
                                .header("Authorization", "Basic " + Base64.encodeToString(Api.API_AUTHENTICATION.getBytes(), Base64.NO_WRAP))
                                .method(request.method(), request.body());
                        request = requestBuilder.build();
                        return pChain.proceed(request);
                    }
                }).addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain pChain) throws IOException {
                        Request request = pChain.request();
                        HttpUrl.Builder builder = request.url().newBuilder();
                        HttpUrl httpUrl = builder.build();
                        Log.d(Api.TAG, request.method() + " " + httpUrl.url().toString());
                        request = request.newBuilder().url(httpUrl).build();
                        Response response = pChain.proceed(request);
                        String bodyString = response.body().string();
                        response = response.newBuilder()
                                .body(ResponseBody.create(response.body().contentType(), bodyString))
                                .build();
                        Log.d(Api.TAG, bodyString);
                        return response;
                    }
                }).build();

        Gson gson = new GsonBuilder()
                .excludeFieldsWithoutExposeAnnotation()
                .create();

        this.mRetrofit = new Retrofit.Builder()
                .baseUrl(pContext.getString(R.string.api_base_url))
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        this.mApi = this.mRetrofit.create(IApi.class);
    }

    @Override
    public Observable<NctSearchResult> nctSearch(@Query("q") String pQ) {
        return this.mApi.nctSearch(pQ);
    }

    @Override
    public Observable<ZingSearchResult> zingSearch(@Query("type") String pType, @Query("num") int pNum, @Query("query") String pQuery) {
        return this.mApi.zingSearch(pType, pNum, pQuery);
    }

    @Override
    public Observable<MusicNct> nctFetch(@Query("url") String pUrl, @Query("keyword") String pKeyword) {
        return this.mApi.nctFetch(pUrl, pKeyword);
    }

    @Override
    public Observable<MusicZing> zingFetch(@Query("name") String pName, @Query("artist") String pArtist, @Query("id") String pId) {
        return this.mApi.zingFetch(pName, pArtist, pId);
    }

    /*
    @Override
    public Errors convertError(Throwable pError) {
        Errors errors = null;
        if (pError instanceof HttpException) {
            ResponseBody body = ((HttpException) pError).response().errorBody();
            Converter<ResponseBody, Errors> converter = this.mRetrofit.responseBodyConverter(Errors.class, Errors.class.getAnnotations());
            try {
                errors = converter.convert(body);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return errors;
    }
    */
}
