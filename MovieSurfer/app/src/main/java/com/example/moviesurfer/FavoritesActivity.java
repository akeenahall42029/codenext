package com.example.moviesurfer;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class FavoritesActivity extends AppCompatActivity {
    ListView favoritesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorites);
        SharedPreferences sharedPrefs = getSharedPreferences("my prefs",MODE_PRIVATE);
        String favorites = sharedPrefs.getString("favorites","");
        String[] favzz = favorites.split(",");
        favoritesListView = findViewById(R.id.favs_list_view);
        FavoriteAdapter favoriteAdapter= new FavoriteAdapter(this,favzz);
        favoritesListView.setAdapter(favoriteAdapter);



    }


}
