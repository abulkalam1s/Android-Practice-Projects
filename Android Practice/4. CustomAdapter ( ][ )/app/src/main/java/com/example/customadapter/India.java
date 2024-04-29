package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class India extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_india);

        //ArrayList<String> list_data = new ArrayList<String>();

        String [] english_words = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.data_list, R.id.list, english_words);

        ListView listView = findViewById(R.id.list_india);

        listView.setAdapter(adapter);

    }
}