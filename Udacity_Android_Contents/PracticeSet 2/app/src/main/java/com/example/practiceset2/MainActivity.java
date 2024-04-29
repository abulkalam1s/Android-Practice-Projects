package com.example.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    int colaVote = 0;
    int spriteVote = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

      public void voteCola(View view) {
            colaVote = colaVote + 1;
        }

        public void voteSprite(View view) {
            spriteVote = spriteVote + 1;
        }

        public void showMeVotes(View view) {
           // display(spriteVote + " vs. " + colaVote);
        }


}