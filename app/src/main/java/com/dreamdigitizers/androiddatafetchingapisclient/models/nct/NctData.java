package com.dreamdigitizers.androiddatafetchingapisclient.models.nct;

import com.dreamdigitizers.androiddatafetchingapisclient.models.ModelBase;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NctData extends ModelBase {
    @SerializedName("song")
    @Expose
    private List<NctSong> mNctSongs;

    @SerializedName("singer")
    @Expose
    private List<NctSinger> mNctSingers;

    @SerializedName("playlist")
    @Expose
    private List<NctPlaylist> mNctPlaylists;

    @SerializedName("video")
    @Expose
    private List<NctVideo> mNctVideos;

    public List<NctSong> getSongs() {
        return this.mNctSongs;
    }

    public void setSongs(List<NctSong> pNctSongs) {
        this.mNctSongs = pNctSongs;
    }

    public List<NctSinger> getSingers() {
        return this.mNctSingers;
    }

    public void setSingers(List<NctSinger> pNctSingers) {
        this.mNctSingers = pNctSingers;
    }

    public List<NctPlaylist> getPlaylists() {
        return this.mNctPlaylists;
    }

    public void setPlaylists(List<NctPlaylist> pNctPlaylists) {
        this.mNctPlaylists = pNctPlaylists;
    }

    public List<NctVideo> getVideos() {
        return this.mNctVideos;
    }

    public void setVideos(List<NctVideo> pNctVideos) {
        this.mNctVideos = pNctVideos;
    }
}
