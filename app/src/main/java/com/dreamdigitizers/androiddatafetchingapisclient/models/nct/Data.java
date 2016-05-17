package com.dreamdigitizers.androiddatafetchingapisclient.models.nct;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Data extends ModelBase {
    @SerializedName("song")
    @Expose
    private List<Song> mSongs;

    @SerializedName("singer")
    @Expose
    private List<Singer> mSingers;

    @SerializedName("playlist")
    @Expose
    private List<Playlist> mPlaylists;

    @SerializedName("video")
    @Expose
    private List<Video> mVideos;

    public List<Song> getSongs() {
        return this.mSongs;
    }

    public void setSongs(List<Song> pSongs) {
        this.mSongs = pSongs;
    }

    public List<Singer> getSingers() {
        return this.mSingers;
    }

    public void setSingers(List<Singer> pSingers) {
        this.mSingers = pSingers;
    }

    public List<Playlist> getPlaylists() {
        return this.mPlaylists;
    }

    public void setPlaylists(List<Playlist> pPlaylists) {
        this.mPlaylists = pPlaylists;
    }

    public List<Video> getVideos() {
        return this.mVideos;
    }

    public void setVideos(List<Video> pVideos) {
        this.mVideos = pVideos;
    }
}
