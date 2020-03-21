package com.example.android.spotifly;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        //album and artist have similar charicteristics; reusing template
        ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album(R.drawable.ic_launcher_background, "Pop Smoke", "Meet the Woo 2"));
    }
}
