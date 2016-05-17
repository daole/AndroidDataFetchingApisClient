package com.dreamdigitizers.androiddatafetchingapisclient.models.zing;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ZingSearchResult extends ModelBase {
    @SerializedName("result")
    @Expose
    private boolean mResult;

    @SerializedName("data")
    @Expose
    private List<Data> mData;

    public boolean isResult() {
        return this.mResult;
    }

    public void setResult(boolean pResult) {
        this.mResult = pResult;
    }

    public List<Data> getData() {
        return this.mData;
    }

    public void setData(List<Data> pData) {
        this.mData = pData;
    }
}
