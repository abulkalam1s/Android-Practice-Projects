package com.example.listview_with_adapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Data to be inflated in ListView
        String[] country = {"India","Pakistan","Bangladesh","Nepal","Bhutan","Sri Lanka","China","Myanmar","Afghanistan"};

        //Referencing the ListView created in the MainActivity.xml
        ListView listView = (ListView) findViewById(R.id.listView);

        //Creating object of ArrayAdapter of String type(as data is in String)
        //And passing the layout resource in which data will be inflated
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item_layout, R.id.textView, country);

        //after ArrayAdapter sets all the data in the view, it is now set to listView
        listView.setAdapter(adapter);
    }
}