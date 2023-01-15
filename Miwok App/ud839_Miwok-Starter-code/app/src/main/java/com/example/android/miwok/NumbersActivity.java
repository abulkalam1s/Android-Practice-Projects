package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);


        //LinearLayout rootView = findViewById(R.id.rootView);

        //Using for loop
//        for(int i=0; i<words.size(); i++){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(i));
//            wordView.setTextSize(24);
//            wordView.setTextColor(getResources().getColor(R.color.red));
//            wordView.setBackgroundColor(getResources().getColor(R.color.yellow));
//            rootView.addView(wordView);
//        }

        //Using while loop
//        int index = 0;
//        while(index < words.size()){
//            TextView wordView = new TextView(this);
//            wordView.setText(words.get(index));
//            wordView.setTextSize(24);
//            wordView.setTextColor(getResources().getColor(R.color.red));
//            wordView.setBackgroundColor(getResources().getColor(R.color.yellow));
//            rootView.addView(wordView);
//            //Log.v("NumbersActivity", "Word at index is:"+words.get(index));
//            Log.v("NumbersActivity", "Index:" + index + " Value:" + words.get(index));
//            index++;
//        }
    }
}