package com.dreamdigitizers.androiddatafetchingapisclient.models.nct;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NctSearchResult {
    @SerializedName("error_message")
    @Expose
    private String mErrorMessage;

    @SerializedName("data")
    @Expose
    private Data mData;

    @SerializedName("error_code")
    @Expose
    private int mErrorCode;

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public void setErrorMessage(String pErrorMessage) {
        this.mErrorMessage = pErrorMessage;
    }

    public Data getData() {
        return this.mData;
    }

    public void setData(Data pData) {
        this.mData = pData;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }

    public void setErrorCode(int pErrorCode) {
        this.mErrorCode = pErrorCode;
    }
}
