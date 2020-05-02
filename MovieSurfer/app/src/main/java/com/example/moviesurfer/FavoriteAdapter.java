package com.example.moviesurfer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.squareup.picasso.Picasso;


public class FavoriteAdapter extends ArrayAdapter<String> {
    public FavoriteAdapter(Context context, String [] favoritesArray){
        super(context, 0, favoritesArray);
    }
    @Nullable
    @Override

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.favorite_list_item, parent, false);
        String currentMoviePosterUrl = getItem(position);
        ImageView moviePosterImageView = convertView.findViewById(R.id.fav_movie_iv);
        Picasso.get().load(currentMoviePosterUrl).into(moviePosterImageView);
        return convertView;

    }
}


