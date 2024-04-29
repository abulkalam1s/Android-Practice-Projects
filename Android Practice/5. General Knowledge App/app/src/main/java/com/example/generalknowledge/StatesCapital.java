package com.example.generalknowledge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class StatesCapital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_states_capital);

        ArrayList<Data> data = new ArrayList<Data>();

        data.add(new Data("Jharkhand", "Ranchi", 1));
        data.add(new Data("Bihar", "Patna", 2));
        data.add(new Data("West Bengal", "Kolkata", 3));
        data.add(new Data("Rajasthan", "Jaipur", 4));
        data.add(new Data("Maharastra", "Mumbai", 5));
        data.add(new Data("Haryana", "Chandigarh", 6));
        data.add(new Data("Punjab", "Chandigarh", 7));
        data.add(new Data("Madhya Pradesh", "Bhopal", 8));
        data.add(new Data("Assam", "Dispur", 9));
        data.add(new Data("Nagaland", "Ranchi", 10));
        data.add(new Data("Nagaland", "Ranchi", 11));
        data.add(new Data("Nagaland", "Ranchi", 12));
        data.add(new Data("Nagaland", "Ranchi", 13));
        data.add(new Data("Nagaland", "Ranchi", 14));
        data.add(new Data("Nagaland", "Ranchi", 15));
        data.add(new Data("Nagaland", "Ranchi", 16));
        data.add(new Data("Nagaland", "Ranchi", 17));
        data.add(new Data("Nagaland", "Ranchi", 18));
        data.add(new Data("Nagaland", "Ranchi", 19));
        data.add(new Data("Nagaland", "Ranchi", 20));
        data.add(new Data("Nagaland", "Ranchi", 21));
        data.add(new Data("Nagaland", "Ranchi", 22));
        data.add(new Data("Nagaland", "Ranchi", 23));
        data.add(new Data("Nagaland", "Ranchi", 24));
        data.add(new Data("Nagaland", "Ranchi", 25));
        data.add(new Data("Nagaland", "Ranchi", 26));
        data.add(new Data("Nagaland", "Ranchi", 27));
        data.add(new Data("Nagaland", "Ranchi", 28));


        MyAdapter adapter = new MyAdapter(this, data);

        ListView listView = findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}