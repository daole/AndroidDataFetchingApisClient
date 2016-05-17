package com.dreamdigitizers.androiddatafetchingapisclient.core;

import com.dreamdigitizers.androiddatafetchingapisclient.models.MusicNct;
import com.dreamdigitizers.androiddatafetchingapisclient.models.MusicZing;
import com.dreamdigitizers.androiddatafetchingapisclient.models.nct.NctSearchResult;
import com.dreamdigitizers.androiddatafetchingapisclient.models.zing.ZingSearchResult;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface IApi {
    String ZING_TYPE_ARTIST = "artist";
    String ZING_TYPE_ALBUM = "album";
    String ZING_TYPE_VIDEO = "video";
    String ZING_TYPE_SONG = "song";

    @GET("http://www.nhaccuatui.com/ajax/search")
    Observable<NctSearchResult> nctSearch(@Query("q") String pQ);

    @GET("http://ac.mp3.zing.vn/complete")
    Observable<ZingSearchResult> zingSearch(@Query("type") String pType, @Query("num") int pNum, @Query("query") String pQuery);

    @GET("/nct/fetch")
    Observable<MusicNct> nctFetch(@Query("url") String pUrl, @Query("keyword") String pKeyword);

    @GET("/zing/fetch")
    Observable<MusicZing> zingFetch(@Query("name") String pName, @Query("artist") String pArtist, @Query("id") String pId);
}
