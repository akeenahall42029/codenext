package com.example.birthdaycountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

import java.util.Date;
public class MainActivity extends AppCompatActivity {
    TextView count_down_text;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         count_down_text = findViewById(R.id.count_down_text);
         startTimer();
    }

    private void startTimer() {
        long difference = getRemDays();
        new CountDownTimer(difference,1000){
            public void onTick(long millisUntilFinished){
                int days = (int)(millisUntilFinished/(1000*60*60*24));
                int hours = (int)(millisUntilFinished/(1000*60*60)%24);
                int mins = (int)(millisUntilFinished/(1000*60)%60);
                int sec  = (int)(millisUntilFinished/(1000)%60);
                count_down_text.setText(String.format("%d Days: %d Hours:%d Minutes:%d Seconds",days,hours,mins,sec));


            }

            @Override
            public void onFinish() {

            }
        }.start();

    }

    private long getRemDays() {
        Date currentDate = new Date();
        Date endDate;
        if (currentDate.getMonth() <= 3) {
            endDate = new Date(currentDate.getYear(), 3, 29);

        } else {
            endDate = new Date(currentDate.getYear()+1,3,29);

        }
        return endDate.getTime()-currentDate.getTime();
    }
}
