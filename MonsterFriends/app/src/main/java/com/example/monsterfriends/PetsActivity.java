package com.example.monsterfriends;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class PetsActivity extends AppCompatActivity {
    ImageView pet;
    ImageButton play_btn_pets;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pets);
        pet = findViewById(R.id.pet);
        play_btn_pets= findViewById(R.id.play_btn_pets);

        //instantiating pets class creating objects

         Pets petOne = new Pets(100,100,100,"lilD@ddy",1);
         Pets petTwo = new Pets(100,100,100,"b33f c@k3", 2);


    }



}
