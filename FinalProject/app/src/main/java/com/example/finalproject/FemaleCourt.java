package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.io.Serializable;
import java.util.ArrayList;

public class FemaleCourt extends AppCompatActivity {
ArrayList<Female> femaleslist = new ArrayList<>();
SearchView searchView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_court);

// bundle
    Bundle bundle = getIntent().getExtras();




// data source
        Female imagecourt = new Female( R.drawable.academy, " Play Padel Academy ", "location: kaifan ","price: 60 kd ");
        Female courtname = new Female ( R.drawable.vamos, "Vamos Indoor", "location: Shuwaikh ","price: 55 kd ");
        Female courtloca = new Female( R.drawable.district, " Padel District ", "location: Farwaniya  ","price: 60 kd  ");
        Female courtprice = new Female( R.drawable.lets, " Let’s padel ", "location: kaifan ","price: 40 kd  ");


            femaleslist.add(imagecourt);
            femaleslist.add(courtname);
            femaleslist.add(courtloca);
            femaleslist.add(courtprice);

            FemaleAdapter femaleAdapter = new FemaleAdapter( this, 0,femaleslist);

        ListView listView ;
        listView = findViewById(R.id.listview);
        listView.setAdapter(femaleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Female currentfemale = femaleslist.get(position);

                Intent i = new Intent(FemaleCourt.this, FemaleDetails.class);
                i.putExtra(" female ",  currentfemale);

                startActivity(i);
            }
            });



// search View

          searchView = findViewById(R.id.searchview);

          searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
              @Override
              public boolean onQueryTextSubmit(String s) {
               //  femaleAdapter.getFilter().filter(s);
                  return false;
              }

              @Override
              public boolean onQueryTextChange(String s) {
              //  femaleAdapter.getFilter().filter(newtext);
                  ArrayList<Female> fillterfemale = new ArrayList<Female>();
                  for (Female female : femaleslist){
                      if(female.getCourtname().toLowerCase().contains(s.toLowerCase())){
                          fillterfemale.add(female);
                      }
                  }
                  FemaleAdapter femaleAdapter = new FemaleAdapter( getApplicationContext(), 0,fillterfemale);
                            listView.setAdapter(femaleAdapter);
                  return false;
              }
          });





    }
}