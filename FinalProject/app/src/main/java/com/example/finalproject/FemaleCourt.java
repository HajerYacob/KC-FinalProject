package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class FemaleCourt extends AppCompatActivity {
ArrayList<Female> femaleslist = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_court);

// data source
        Female imagecourt = new Female( R.drawable.academy, " Play Padel Academy ", "location: kaifan ","price: 60 kd ");
        Female courtname = new Female ( R.drawable.vamos, "Vamos Indoor", "location: Shuwaikh ","price: 55 kd ");
        Female courtloca = new Female( R.drawable.district, " Padel District ", "location: Farwaniya  ","price: 60 kd  ");
        Female courtprice = new Female( R.drawable.lets, " Let’s padel ", "location: kaifan ","price: 40 kd  ");


            femaleslist.add(imagecourt);
            femaleslist.add(courtname);
            femaleslist.add(courtloca);
            femaleslist.add(courtprice);

    }
}