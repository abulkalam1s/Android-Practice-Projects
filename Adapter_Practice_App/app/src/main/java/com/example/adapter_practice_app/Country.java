package com.example.adapter_practice_app;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class Country extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();

        //words.add("one");
        words.add(new Word("one","lutti"));
        words.add(new Word("two","ottiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oy yisa"));
        words.add(new Word("five","massoka"));
        words.add(new Word("six","temmoka"));
        words.add(new Word("seven","kenekakku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo e"));
        words.add(new Word("ten","na aacha"));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(this, words);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // activity_numbers.xml layout file.
        ListView listView =(ListView) findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);


    }
}
