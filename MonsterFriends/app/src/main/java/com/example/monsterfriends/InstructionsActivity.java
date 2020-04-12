package com.example.monsterfriends;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InstructionsActivity extends AppCompatActivity {

    CountDownTimer instructions;
    private long instruction_time  = 40000;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instructions);
        final TextView user_messages = findViewById(R.id.instructions);
        instructions = new CountDownTimer(instruction_time,1000) {
            @Override
            public void onTick(long millisUntilFinished) {

                if(millisUntilFinished <= 10000){
                    user_messages.setText("Welcome to Monster Friends");
                }if(millisUntilFinished <= 20000 && millisUntilFinished > 10000){
                    user_messages.setText("You will have two monsters to take care of. You have to feed, show affection, and play with your monsters to keep them health");
                }if(millisUntilFinished <= 30000 && millisUntilFinished > 20000){
                    user_messages.setText("Play games with both of your monsters in the playroom!");
                }if(millisUntilFinished<= 40000 && millisUntilFinished >30000){
                    user_messages.setText("Now insert a username below and get started!");
                }
            }

            @Override
            public void onFinish() {


            }
        }.start();




    }

}
