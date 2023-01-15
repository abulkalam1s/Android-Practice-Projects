package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int currentScoreTeamA=0;
    int currentScoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScoreTeamA(0);
        displayScoreTeamB(0);
    }
    //For Team-A
    public void oneTeamA(View view){
        TextView score = findViewById(R.id.tvScoreTeamA);
        currentScoreTeamA += 1;
        score.setText(""+currentScoreTeamA);
    }
    public void twoTeamA(View view){
        TextView score = findViewById(R.id.tvScoreTeamA);
        currentScoreTeamA += 2;
        score.setText(""+currentScoreTeamA);
    }
    public void threeTeamA(View view){
        TextView score = findViewById(R.id.tvScoreTeamA);
        currentScoreTeamA += 3;
        score.setText(""+currentScoreTeamA);
    }
    public void fourTeamA(View view){
        TextView score = findViewById(R.id.tvScoreTeamA);
        currentScoreTeamA += 4;
        score.setText(""+currentScoreTeamA);
    }
    public void sixTeamA(View view){
        TextView score = findViewById(R.id.tvScoreTeamA);
        currentScoreTeamA += 6;
        score.setText(""+currentScoreTeamA);
    }

    //For Team-B
    public void oneTeamB(View view){
        TextView score = findViewById(R.id.tvScoreTeamB);
        currentScoreTeamB += 1;
        score.setText(""+currentScoreTeamB);
    }
    public void twoTeamB(View view){
        TextView score = findViewById(R.id.tvScoreTeamB);
        currentScoreTeamB += 2;
        score.setText(""+currentScoreTeamB);
    }
    public void threeTeamB(View view){
        TextView score = findViewById(R.id.tvScoreTeamB);
        currentScoreTeamB += 3;
        score.setText(""+currentScoreTeamB);
    }
    public void fourTeamB(View view){
        TextView score = findViewById(R.id.tvScoreTeamB);
        currentScoreTeamB += 4;
        score.setText(""+currentScoreTeamB);
    }
    public void sixTeamB(View view){
        TextView score = findViewById(R.id.tvScoreTeamB);
        currentScoreTeamB += 6;
        score.setText(""+currentScoreTeamB);
    }
   // Display score Team-A
    public void displayScoreTeamA(int n){
        TextView score = findViewById(R.id.tvScoreTeamA);
        score.setText(String.valueOf(n));
    }
    //Display score Team-B
    public void displayScoreTeamB(int n){
        TextView score = findViewById(R.id.tvScoreTeamB);
        score.setText(String.valueOf(n));
    }

    //Reset Method
    public void reset(View view){
        currentScoreTeamA=0;
        currentScoreTeamB=0;
        displayScoreTeamA(currentScoreTeamA);
        displayScoreTeamB(currentScoreTeamB);

    }


}