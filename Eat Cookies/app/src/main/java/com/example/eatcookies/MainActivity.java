package com.example.eatcookies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eatCookies(View view){
        ImageView imageView = findViewById(R.id.image_view);
        TextView textView = findViewById(R.id.text_view);

        //setting the after_cookie image into the ImageView object.
        imageView.setImageResource(R.drawable.after_cookie);
        //setting the message after button(Eat Cookie) click
        textView.setText("I am full now.");
    }

}