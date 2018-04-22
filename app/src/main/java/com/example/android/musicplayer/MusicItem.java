package com.example.android.musicplayer;

public class MusicItem {
    private String mMusicName;
    private String mMusicSinger;
    private String mMusicAlbum;
    private int mResourceId;

    public MusicItem(String name, String singer, String album, int imageId){
        this.mMusicName = name;
        this.mMusicSinger = singer;
        this.mMusicAlbum = album;
        this.mResourceId = imageId;
    }

    public String getMusicName(){return this.mMusicName;}
    public String getSinger(){return this.mMusicSinger;}
    public String getAlbum(){return this.mMusicAlbum;}
    public int getResourceId(){return this.mResourceId;}
}
