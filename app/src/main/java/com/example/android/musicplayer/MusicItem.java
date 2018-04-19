package com.example.android.musicplayer;

public class MusicItem {
    private String mMusicName;
    private String mMusicSinger;
    private String mMusicAlbum;

    public MusicItem(String name, String singer, String album){
        this.mMusicName = name;
        this.mMusicSinger = singer;
        this.mMusicAlbum = album;
    }

    public String getMusicName(){return this.mMusicName;}
    public String getSinger(){return this.mMusicSinger;}
    public String getAlbum(){return this.mMusicAlbum;}
}
