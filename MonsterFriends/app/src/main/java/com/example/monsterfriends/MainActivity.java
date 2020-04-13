package com.example.monsterfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
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
       //where I'm trying to access the variable
        //get the current intent
        Intent userIntent = getIntent();

        //getting the attached extras from the intent
        String user_name = userIntent.getStringExtra("userNamePassed");

       user_name_pet.setText(user_name+"'s pets!" );

    }


    public void uploadInfo(View view) {
        Intent petInfo = new Intent(this, Pets.class);
        startActivity(petInfo);
        if(view.getId() == pet1.getId()){



        }else{
            petInfo.putExtra("pet", "kejnrjne");
        }

    }
}
