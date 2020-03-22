package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        //album and artist have similar charicteristics; reusing template
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album(R.drawable.popalbum, "Pop Smoke", "Meet the Woo 2"));
        albums.add(new Album(R.drawable.ririalbum, "Rihanna", "ANTI"));
        albums.add(new Album(R.drawable.beyoncealbum, "Beyonce", "Lemonade"));
        //linking listview inside of album activty
        ListView albumListView = findViewById(R.id.album_listview);
        AlbumAdapter albumAdapter = new AlbumAdapter(this,albums);
        albumListView.setAdapter(albumAdapter);

    }
}
