package com.example.practiceset;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Practice Set
    //Currency Converter
    public void convert(View view){
        EditText rupee = (EditText) findViewById(R.id.et_dollar);
        //dollar.setText();

        int rupee_value = Integer.parseInt(rupee.getText().toString());
        int dollar = rupee_value*80;
        displayCurrency(dollar);
    }
    public void displayCurrency(int d){
        TextView dollar = (TextView)findViewById(R.id.tv_rupee);
        dollar.setText("Rs "+d);
    }

}