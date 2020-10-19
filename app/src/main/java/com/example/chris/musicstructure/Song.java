package com.example.chris.musicstructure;

public class Song {
    private String mSongTitle;
    private String mSongYear;

    public Song(String songTitle, String songYear) {
        mSongTitle = songTitle;
        mSongYear = songYear;
    }

    public String getSongTitle() {
        return mSongTitle;
    }

    public String getSongYear() {
        return mSongYear;
    }
}
