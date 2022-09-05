package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MaleCourt extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_court);

        Bundle bundle = getIntent().getExtras();


 // find view
     ImageButton a = findViewById(R.id.padelclub);
     ImageButton b = findViewById(R.id.nation);
     ImageButton c = findViewById(R.id.padelblu);
     ImageButton d = findViewById(R.id.padeldistrict);
     ImageButton f = findViewById(R.id.padelgar);
     ImageButton e = findViewById(R.id.lestpadel);



//
  a.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        Intent a = new Intent(MaleCourt.this,maleDetails.class);
        startActivity(a);
    }
});

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(MaleCourt.this,maleDetails.class);
                startActivity(a);
            }
        });

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(MaleCourt.this,maleDetails.class);
                startActivity(a);
            }
        });

        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(MaleCourt.this,maleDetails.class);
                startActivity(a);
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(MaleCourt.this,maleDetails.class);
                startActivity(a);
            }
        });

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent a = new Intent(MaleCourt.this,maleDetails.class);
                startActivity(a);
            }
        });







    }
}