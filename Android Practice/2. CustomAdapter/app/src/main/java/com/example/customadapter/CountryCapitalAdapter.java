package com.example.customadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CountryCapitalAdapter extends ArrayAdapter<CountryCapitalList> {


    // invoke the suitable constructor of the ArrayAdapter class
    public CountryCapitalAdapter(@NonNull Context context, ArrayList<CountryCapitalList> arrayList) {

        // pass the context and arrayList for the super
        // constructor of the ArrayAdapter class
        super(context, 0, arrayList);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View currentItemView = convertView;
        if (currentItemView == null){
            currentItemView = LayoutInflater.from(getContext()).inflate(R.layout.custom_view, parent, false);
        }

        CountryCapitalList  currentPosition = getItem(position);

        TextView country = currentItemView.findViewById(R.id.tvCountry);
        country.setText(currentPosition.getmCountry());

        TextView capital = currentItemView.findViewById(R.id.tvCapital);
        country.setText(currentPosition.getmCapital());

        return currentItemView;
    }
}
