package com.example.basic_array_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] data = {"Jamtara","Dhanbad","Asansol","Ranchi","Jamshedpur"};

        ListView listView =(ListView) findViewById(R.id.list);

        ArrayAdapter<String> item_adapter = new ArrayAdapter<String>(this, R.layout.items_layout, data);

        listView.setAdapter(item_adapter);

    }
}