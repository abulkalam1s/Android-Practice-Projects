package com.example.healthchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int health_level=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Health Check App
    public void yes(View view){
        TextView textView = findViewById(R.id.tvMessage);
        health_level += 1;
        textView.setText("Your health level increases to "+health_level);
    }
    public void sometimes(View view){
        TextView textView = findViewById(R.id.tvMessage);
        textView.setText("Your health level remains same "+health_level);
    }
    public void no(View view){
        health_level -= 1;
        TextView textView = findViewById(R.id.tvMessage);
        textView.setText("Your health level decreases to "+health_level);
    }
}