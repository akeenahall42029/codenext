package com.example.android.spotifly;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

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
        return convertView;


    }
}

