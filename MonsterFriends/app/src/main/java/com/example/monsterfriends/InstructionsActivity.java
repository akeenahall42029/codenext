package com.example.monsterfriends;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InstructionsActivity extends AppCompatActivity {

    CountDownTimer instructions;
    private long instruction_time  = 40000;
    public String stored_userName;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions);
        //linking views
        final TextView user_messages = findViewById(R.id.instructions);
        final EditText userInput = findViewById(R.id.user_name_input);
        Button userBtn = findViewById(R.id.user);

        //storing the user's username and goes to the home page
        userBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //variable I'm tryong to access
                stored_userName = userInput.getText().toString();
                goToHome();

            }
        });


        //countDown Timer for instructions
        instructions = new CountDownTimer(instruction_time,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                //testing something for terminal and github

                if(millisUntilFinished <= 40000){
                    user_messages.setText("Welcome to Monster Friends");
                }if(millisUntilFinished <= 35000){
                    user_messages.setText("Take care of your monsters and keep them in good health");
                }if(millisUntilFinished <= 25000){
                    user_messages.setText("You can also play games with your monsters in the playroom!");
                }if(millisUntilFinished<= 15000){
                    user_messages.setText("Now insert a username below and get started!");
                }
            }

            @Override
            public void onFinish() {


            }
        }.start();



    }
    //function to go to the home page from the loading page
    public void  goToHome(){
        //intenting resources file, putting info to Intent
        Intent toHome= new Intent(this, MainActivity.class);
        toHome.putExtra("userNamePassed", stored_userName);
        startActivity(toHome);


    }

}
