package com.dreamdigitizers.androiddatafetchingapisclient.models.nct;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NctSong extends ModelBase {
    @SerializedName("id")
    @Expose
    private String mId;

    @SerializedName("name")
    @Expose
    private String mName;

    @SerializedName("singer")
    @Expose
    private List<NctSinger> mNctSingers;

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

    public List<NctSinger> getSingers() {
        return this.mNctSingers;
    }

    public void setSingers(List<NctSinger> pNctSingers) {
        this.mNctSingers = pNctSingers;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void setUrl(String pUrl) {
        this.mUrl = pUrl;
    }
}
