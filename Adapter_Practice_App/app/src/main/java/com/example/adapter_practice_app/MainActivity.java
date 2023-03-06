package com.example.adapter_practice_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView country = findViewById(R.id.tvCountry);

        TextView states = findViewById(R.id.tvStates);

        country.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                //Click an Intent to open the NumbersActivity
                Intent numbersIntent = new Intent(MainActivity.this, Country.class);

                //Start the new Activity
                startActivity(numbersIntent);
            }

        });
    }
}