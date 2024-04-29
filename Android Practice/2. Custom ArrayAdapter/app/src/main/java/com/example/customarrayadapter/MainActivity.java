package com.example.customarrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Constructing the data source
        ArrayList<Items> items = new ArrayList<Items>();

        items.add(new Items("India", "Delhi"));
        items.add(new Items("England", "London"));
        items.add(new Items("France", "Paris"));
        items.add(new Items("Germany", "Berlin"));
        items.add(new Items("Italy", "Rome"));


        // Create the adapter to convert the array to views
        CustomAdapter adapter = new CustomAdapter(this,items);

        ListView listView = findViewById(R.id.list);

        // Attach the adapter to a ListView
        listView.setAdapter(adapter);

    }
}