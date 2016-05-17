package com.dreamdigitizers.androiddatafetchingapisclient.models.nct;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Song extends ModelBase {
    @SerializedName("id")
    @Expose
    private String mId;

    @SerializedName("name")
    @Expose
    private String mName;

    @SerializedName("singer")
    @Expose
    private List<Singer> mSingers;

    @SerializedName("url")
    @Expose
    private String mUrl;

    public String getId() {
        return this.mId;
    }

    public void setId(String pId) {
        this.mId = pId;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String pName) {
        this.mName = pName;
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
