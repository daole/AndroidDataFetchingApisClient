package com.dreamdigitizers.androiddatafetchingapisclient.models.zing;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data extends ModelBase {
    @SerializedName("artist")
    @Expose
    private List<Artist> mArtists;

    @SerializedName("album")
    @Expose
    private List<Album> mAlbums;

    @SerializedName("video")
    @Expose
    private List<Video> mVideos;

    @SerializedName("song")
    @Expose
    private List<Song> mSongs;

    public List<Artist> getArtists() {
        return this.mArtists;
    }

    public void setArtists(List<Artist> pArtists) {
        this.mArtists = pArtists;
    }

    public List<Album> getAlbums() {
        return this.mAlbums;
    }

    public void setAlbums(List<Album> pAlbums) {
        this.mAlbums = pAlbums;
    }

    public List<Video> getVideos() {
        return this.mVideos;
    }

    public void setVideos(List<Video> pVideos) {
        this.mVideos = pVideos;
    }

    public List<Song> getSongs() {
        return this.mSongs;
    }

    public void setSongs(List<Song> pSongs) {
        this.mSongs = pSongs;
    }
}
