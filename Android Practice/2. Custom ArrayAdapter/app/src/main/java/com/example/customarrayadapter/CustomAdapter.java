package com.example.customarrayadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Items> {

    public CustomAdapter(@NonNull Context context, ArrayList<Items> item) {
        super(context,0, item);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        // Get the data item for this position
        Items current_item = getItem(position);

        // Check if an existing view is being reused, otherwise inflate the view
        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.items_layout, parent, false);
        }

        // Lookup view for data population
        TextView country = convertView.findViewById(R.id.tv_country);
        TextView capital = convertView.findViewById(R.id.tv_capital);

        // Populate the data into the template view using the data object
        country.setText(current_item.mCountry);
        capital.setText(current_item.mCapital);

        // Return the completed view to render on screen
        return convertView;
    }
}
