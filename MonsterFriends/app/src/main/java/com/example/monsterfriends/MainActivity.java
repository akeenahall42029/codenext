package com.example.monsterfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ImageButton pet2;
    ImageButton pet1;
    ImageButton playroom;
    TextView user_name_pet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       pet1 = findViewById(R.id.petOneBtn);
       pet2 = findViewById(R.id.petTwoBtn);
       playroom = findViewById(R.id.playroomBtn);
       user_name_pet= findViewById(R.id.user_name_pet);

       pet1.setImageResource(R.drawable.egg);
       pet2.setImageResource(R.drawable.eggy);
       playroom.setImageResource(R.drawable.playroom);
    }


}
