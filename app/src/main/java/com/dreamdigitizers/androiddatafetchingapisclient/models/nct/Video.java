package com.dreamdigitizers.androiddatafetchingapisclient.models.nct;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Video extends ModelBase {
    @SerializedName("name")
    @Expose
    private String mName;

    @SerializedName("img")
    @Expose
    private String mImg;

    @SerializedName("singer")
    @Expose
    private List<Singer> mSingers;

    @SerializedName("url")
    @Expose
    private String mUrl;

    public String getName() {
        return this.mName;
    }

    public void setName(String pName) {
        this.mName = pName;
    }

    public String getImg() {
        return this.mImg;
    }

    public void setImg(String pImg) {
        this.mImg = pImg;
    }

    public List<Singer> getSingers() {
        return this.mSingers;
    }

    public void setSingers(List<Singer> pSingers) {
        this.mSingers = pSingers;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void setUrl(String pUrl) {
        this.mUrl = pUrl;
    }
}
