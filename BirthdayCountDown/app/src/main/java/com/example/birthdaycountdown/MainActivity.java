package com.example.birthdaycountdown;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import java.util.Date;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {
    TextView count_down_text;
    VideoView birthdayVideo;
    GifImageView birthdayChange;
    MediaPlayer song;



    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         birthdayChange = findViewById(R.id.gifImageView);
         count_down_text = findViewById(R.id.count_down_text);
         startTimer();
         birthdayVideo = findViewById(R.id.videoView);
         String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.birthdayvideo;
         //parse takes in video string
        Uri uri = Uri.parse(videoPath);
        birthdayVideo.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        birthdayVideo.setMediaController(mediaController);
        mediaController.setAnchorView(birthdayVideo);
        song = MediaPlayer.create(MainActivity.this,R.raw.birthdaysong);

    }

    private void startTimer() {
        long difference = getRemDays();
        new CountDownTimer(difference,1000){
            public void onTick(long millisUntilFinished){
                int days = (int)(millisUntilFinished/(1000*60*60*24));
                int hours = (int)(millisUntilFinished/(1000*60*60)%24);
                int mins = (int)(millisUntilFinished/(1000*60)%60);
                int sec  = (int)(millisUntilFinished/(1000)%60);
                count_down_text.setText(String.format("%d       %d       %d      %d ",days,hours,mins,sec));
            }

            @Override
            public void onFinish() {
                birthdayChange.setImageResource(R.drawable.pearl);
                song.start();

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
