package com.dreamdigitizers.androiddatafetchingapisclient.models.zing;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ZingData extends ModelBase {
    @SerializedName("artist")
    @Expose
    private List<ZingArtist> mZingArtists;

    @SerializedName("album")
    @Expose
    private List<ZingAlbum> mZingAlba;

    @SerializedName("video")
    @Expose
    private List<ZingVideo> mZingVideos;

    @SerializedName("song")
    @Expose
    private List<ZingSong> mZingSongs;

    public List<ZingArtist> getArtists() {
        return this.mZingArtists;
    }

    public void setArtists(List<ZingArtist> pZingArtists) {
        this.mZingArtists = pZingArtists;
    }

    public List<ZingAlbum> getAlbums() {
        return this.mZingAlba;
    }

    public void setAlbums(List<ZingAlbum> pZingAlba) {
        this.mZingAlba = pZingAlba;
    }

    public List<ZingVideo> getVideos() {
        return this.mZingVideos;
    }

    public void setVideos(List<ZingVideo> pZingVideos) {
        this.mZingVideos = pZingVideos;
    }

    public List<ZingSong> getSongs() {
        return this.mZingSongs;
    }

    public void setSongs(List<ZingSong> pZingSongs) {
        this.mZingSongs = pZingSongs;
    }
}
