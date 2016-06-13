package com.dreamdigitizers.androiddatafetchingapisclient.models.nct;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MusicNct extends ModelBase {
    @SerializedName("id")
    @Expose
    private String mId;

    @SerializedName("title")
    @Expose
    private String mTitle;

    @SerializedName("time")
    @Expose
    private String mTime;

    @SerializedName("creator")
    @Expose
    private String mCreator;

    @SerializedName("location")
    @Expose
    private String mLocation;

    @SerializedName("location_hq")
    @Expose
    private String mLocationHq;

    @SerializedName("has_hq")
    @Expose
    private String mHasHq;

    @SerializedName("info")
    @Expose
    private String mInfo;

    @SerializedName("lyric")
    @Expose
    private String mLyric;

    @SerializedName("bg_image")
    @Expose
    private String mBgImage;

    @SerializedName("avatar")
    @Expose
    private String mAvatar;

    @SerializedName("new_tab")
    @Expose
    private String mNewTab;

    @SerializedName("kbit")
    @Expose
    private String mKbit;

    public String getId() {
        return mId;
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

    public String getTime() {
        return this.mTime;
    }

    public void setTime(String pTime) {
        this.mTime = pTime;
    }

    public String getCreator() {
        return this.mCreator;
    }

    public void setCreator(String pCreator) {
        this.mCreator = pCreator;
    }

    public String getLocation() {
        return this.mLocation;
    }

    public void setLocation(String pLocation) {
        this.mLocation = pLocation;
    }

    public String getLocationHq() {
        return this.mLocationHq;
    }

    public void setLocationHq(String pLocationHq) {
        this.mLocationHq = pLocationHq;
    }

    public String getHasHq() {
        return this.mHasHq;
    }

    public void setHasHq(String pHasHq) {
        this.mHasHq = pHasHq;
    }

    public String getInfo() {
        return this.mInfo;
    }

    public void setInfo(String pInfo) {
        this.mInfo = pInfo;
    }

    public String getLyric() {
        return this.mLyric;
    }

    public void setLyric(String pLyric) {
        this.mLyric = pLyric;
    }

    public String getBgImage() {
        return this.mBgImage;
    }

    public void setBgImage(String pBgImage) {
        this.mBgImage = pBgImage;
    }

    public String getAvatar() {
        return this.mAvatar;
    }

    public void setAvatar(String pAvatar) {
        this.mAvatar = pAvatar;
    }

    public String getNewTab() {
        return this.mNewTab;
    }

    public void setNewTab(String pNewTab) {
        this.mNewTab = pNewTab;
    }

    public String getKbit() {
        return this.mKbit;
    }

    public void setKbit(String pKbit) {
        this.mKbit = pKbit;
    }
}
