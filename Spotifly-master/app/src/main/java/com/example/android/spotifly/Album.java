package com.example.android.spotifly;

public class Album {
    private String artistName;
    private String albumName;
    private int albumCover;

    public Album(int albumCover, String artistName, String albumName) {
        this.albumName = albumName;
        this.artistName = artistName;
        this.albumCover = albumCover;
    }

    public int getAlbumCover() {
        return albumCover;
    }

    public void setAlbumCover(int albumCover) {
        this.albumCover = albumCover;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

}
