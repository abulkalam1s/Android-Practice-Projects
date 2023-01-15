package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Creating object of TextView class
        TextView textView = new TextView(this);

        //Attributes of textView objects
        textView.setText("Hi Abul!");
        textView.setTextSize(48);
        textView.setTextColor(Color.RED);

        setContentView(textView);
        //setContentView(R.layout.activity_main);

    }
}