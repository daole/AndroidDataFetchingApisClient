package com.dreamdigitizers.androiddatafetchingapisclient.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MusicZing extends ModelBase {
    @SerializedName("id")
    @Expose
    private String mId;

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("performer")
    @Expose
    private String mPerformer;

    @SerializedName("link")
    @Expose
    private String mLink;

    @SerializedName("source")
    @Expose
    private String mSource;

    @SerializedName("hq")
    @Expose
    private String mHq;

    @SerializedName("duration")
    @Expose
    private String mDuration;

    @SerializedName("lyric")
    @Expose
    private String mLyric;

    @SerializedName("mv_link")
    @Expose
    private String mMvLink;

    @SerializedName("ad_param")
    @Expose
    private String mAdParam;

    @SerializedName("back_image")
    @Expose
    private String mBackImage;

    @SerializedName("error_code")
    @Expose
    private String mErrorCode;

    @SerializedName("error_message")
    @Expose
    private String mErrorMessage;

    public String getId() {
        return this.mId;
    }

    public void setId(String pId) {
        this.mId = pId;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String pTitle) {
        this.mTitle = pTitle;
    }

    public String getPerformer() {
        return this.mPerformer;
    }

    public void setPerformer(String pPerformer) {
        this.mPerformer = pPerformer;
    }

    public String getLink() {
        return this.mLink;
    }

    public void setLink(String pLink) {
        this.mLink = pLink;
    }

    public String getSource() {
        return this.mSource;
    }

    public void setSource(String pSource) {
        this.mSource = pSource;
    }

    public String getHq() {
        return this.mHq;
    }

    public void setHq(String pHq) {
        this.mHq = pHq;
    }

    public String getDuration() {
        return this.mDuration;
    }

    public void setDuration(String pDuration) {
        this.mDuration = pDuration;
    }

    public String getLyric() {
        return this.mLyric;
    }

    public void setLyric(String pLyric) {
        this.mLyric = pLyric;
    }

    public String getMvLink() {
        return this.mMvLink;
    }

    public void setMvLink(String pValue) {
        this.mMvLink = pValue;
    }

    public String getAdParam() {
        return this.mAdParam;
    }

    public void setAdParam(String pAdParam) {
        this.mAdParam = pAdParam;
    }

    public String getBackImage() {
        return this.mBackImage;
    }

    public void setBackImage(String pBackImage) {
        this.mBackImage = pBackImage;
    }

    public String getErrorCode() {
        return this.mErrorCode;
    }

    public void setErrorCode(String pErrorCode) {
        this.mErrorCode = pErrorCode;
    }

    public String getErrorMessage() {
        return this.mErrorMessage;
    }

    public void setErrorMessage(String pErrorMessage) {
        this.mErrorMessage = pErrorMessage;
    }
}
