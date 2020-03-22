package com.example.android.spotifly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class AlbumAdapter extends ArrayAdapter<Album> {
    public  AlbumAdapter(Context context, ArrayList list){
        super(context, 0, list);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_item_album, parent, false);
        Album currentAlbum = getItem(position);
        ImageView currentAlbumImageView = convertView.findViewById(R.id.albumCover);
        TextView albumArtistName = convertView.findViewById(R.id.artistName);
        TextView albumName = convertView.findViewById(R.id.albumName);
        currentAlbumImageView.setImageResource(currentAlbum.getAlbumCover());
        albumArtistName.setText(currentAlbum.getArtistName());
        albumName.setText(currentAlbum.getAlbumName());

        return convertView;


    }
}

