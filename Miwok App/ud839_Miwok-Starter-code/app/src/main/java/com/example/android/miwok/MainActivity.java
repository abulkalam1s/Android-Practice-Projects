/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
// import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        ArrayList<String> miwok_words = new ArrayList<>();
        miwok_words.add("lutti");
        miwok_words.add("ottiku");
        miwok_words.add("tolookosu");
        miwok_words.add("oyyisa");
        miwok_words.add("massokka");
        miwok_words.add("temmoka");
        miwok_words.add("kenekaku");
        miwok_words.add("kawinta");
        miwok_words.add("wo'e");
        miwok_words.add("na'aacha");



        //Log.v("NumbersActivity", "Word at Oth index: "+words.get(0));



        //Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);


        //Finds the view that will show the numbers category text.
        TextView numbers = findViewById(R.id.numbers);
        //set onClickListener on that View.
        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), NumbersActivity.class);
                startActivity(intent);
            }
        });

        TextView family = findViewById(R.id.family);
        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), FamilyActivity.class));
            }
        });

        //TextView colors = findViewById(R.id.colors);
        //USING TEXT OBJECT DIRECTLY
        findViewById(R.id.colors).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), ColorsActivity.class));
            }
        });

        TextView phrases = findViewById(R.id.phrases);
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), PhrasesActivity.class));
            }
        });




    }//onCreate Ends

}
