package com.example.generalknowledge;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Data> {
    public MyAdapter(@NonNull Context context, ArrayList<Data> data) {
        super(context,0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.data_item_layout, parent, false);
        }

        Data current_item = getItem(position);

        TextView state = convertView.findViewById(R.id.tv_State);
        TextView capital = convertView.findViewById(R.id.tv_Capital);

        state.setText(current_item.getStates());
        capital.setText(current_item.getCapital());


        return convertView;
    }
}
