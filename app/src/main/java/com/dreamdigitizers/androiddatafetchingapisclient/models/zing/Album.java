package com.dreamdigitizers.androiddatafetchingapisclient.models.zing;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Album extends ModelBase {
    @SerializedName("artist")
    @Expose
    private String mArtist;

    @SerializedName("thumb")
    @Expose
    private String mThumb;

    @SerializedName("name")
    @Expose
    private String mName;

    @SerializedName("id")
    @Expose
    private String mId;

    public String getArtist() {
        return this.mArtist;
    }

    public void setArtist(String pArtist) {
        this.mArtist = pArtist;
    }

    public String getThumb() {
        return this.mThumb;
    }

    public void setThumb(String pThumb) {
        this.mThumb = pThumb;
    }

    public String getName() {
        return this.mName;
    }

    public void setName(String pName) {
        this.mName = pName;
    }

    public String getId() {
        return this.mId;
    }

    public void setId(String pId) {
        this.mId = pId;
    }
}
