package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private Button btnStart, btnPause, btnForward, btnBackward;
    private ImageView imageView;

    //Initializing the starting time of the audio to 0.
    private double startTime = 0;
    private double finalTime = 0;

    //Setting the forward and backward time to 5 sec.
    private int forwardTime = 5000, backwardTime = 5000;

    //TextViews for Songs and Playback details
    private TextView currentPlayingTime, songTimeLength, songTitle;

    private Handler myHandler = new Handler();
    private SeekBar seekBar;

    public static int oneTimeOnly = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this, R.raw.game_show_suspense_waiting);


    }
}