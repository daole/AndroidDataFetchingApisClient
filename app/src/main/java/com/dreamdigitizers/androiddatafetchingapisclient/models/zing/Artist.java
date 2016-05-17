package com.dreamdigitizers.androiddatafetchingapisclient.models.zing;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Artist extends ModelBase {
    @SerializedName("thumb")
    @Expose
    private String mThumb;

    @SerializedName("name")
    @Expose
    private String mName;

    @SerializedName("id")
    @Expose
    private String mId;

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
