package com.example.monsterfriends;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class PetsActivity extends AppCompatActivity {
    ImageView pet;
    ImageButton play_btn_pets;
    Pets mainPet;
    EditText  user_pet;
    TextView pets_name;
    SharedPreferences.Editor edit;
    SharedPreferences dif_pet_names;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pets);
        pet = findViewById(R.id.pet);
        play_btn_pets= findViewById(R.id.play_btn_pets);
        user_pet = findViewById(R.id.users_pet);
        pets_name = findViewById(R.id.tv_name);
        dif_pet_names = getSharedPreferences("dif_pet_names",MODE_PRIVATE);

        Intent booleanIntent = getIntent();
        boolean flag = booleanIntent.getBooleanExtra("petflag",true);
        if(flag){
            mainPet = new Pets(100,100,100,"daddy",R.drawable.egg);

        }else{
            mainPet = new Pets(100,100,100,"bobby",R.drawable.eggy);

        }
        pet.setImageResource(mainPet.getPetImage());
        pets_name.setText(dif_pet_names.getString("dif_pet_names",mainPet.getPetName()+" ;click to img to renamee"));

    }


    public void backToHome(View view) {
        Intent backHome = new Intent(this, MainActivity.class);
        startActivity(backHome);
    }

    public void settingName(View view) {
        edit = dif_pet_names.edit();
        pets_name.setText(user_pet.getText().toString());
        edit.putString("users_pet",user_pet.getText().toString());
        edit.apply();

    }
}
