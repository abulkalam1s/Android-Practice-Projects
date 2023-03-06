package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // create a arraylist of the type CountryCapitalList
        final ArrayList<CountryCapitalList> arrayList = new ArrayList<CountryCapitalList>();

        // add all the values from 1 to 15 to the arrayList
        // the items are of the type CountryCapitalList
        arrayList.add(new CountryCapitalList( "1", "One"));


        // Now create the instance of the NumebrsViewAdapter and pass 
        // the context and arrayList created above
        CountryCapitalAdapter numbersArrayAdapter = new CountryCapitalAdapter(this, arrayList);

        // create the instance of the ListView to set the CountryCapitalListAdapter
        ListView numbersListView = (ListView) findViewById(R.id.listView);

        // set the CountryCapitalListAdapter for ListView
        numbersListView.setAdapter(numbersArrayAdapter);

    }
}