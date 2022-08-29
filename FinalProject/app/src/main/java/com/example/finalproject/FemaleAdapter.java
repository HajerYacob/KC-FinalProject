package com.example.finalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class FemaleAdapter extends ArrayAdapter<Female> {
    List<Female> femaleList ;
    public FemaleAdapter(@NonNull Context context, int resource, @NonNull List<Female> objects) {
        super(context, resource, objects);
        femaleList = objects ;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from(getContext()).inflate(R.layout.list_items,parent,false);
        Female currentfemale = femaleList.get(position);


        TextView name = view.findViewById(R.id.courtname);
        ImageView picfruit = view.findViewById(R.id.imagecourt);
        TextView loca = view.findViewById(R.id.courtloca);
        TextView price = view.findViewById(R.id.courtprice);

        name.setText(currentfemale.getCourtname());
        loca.setText(currentfemale.getCourtloca());
        price.setText(currentfemale.getCourtprice());
        picfruit.setImageResource(currentfemale.getImagecourt());


        return view;
    }
}
