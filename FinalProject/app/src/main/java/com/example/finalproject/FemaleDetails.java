package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class FemaleDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_female_details);

//intent data source
        Bundle bundle = getIntent().getExtras();
         Female deliveryfruit = (Female) bundle.getSerializable(" Female ");

        ImageView brandimage = findViewById(R.id.brandimmage);
        TextView brand  = findViewById(R.id.brand);
        TextView pricedel = findViewById(R.id.pricedel);


        brandimage.setImageResource(deliveryfruit.getImagecourt());
        brand.setText(deliveryfruit.getCourtname());
        pricedel.setText(deliveryfruit.getCourtprice());



// phone hyperlink
        Button b1 = findViewById(R.id.phonebutton);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel: 97770597"));
            startActivity(intent);
        }
    });


 // intent to SMS page
         Button b2 = findViewById(R.id.smspagebutton);
         b2.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 Intent i = new Intent(FemaleDetails.this,emailpage.class);
                 startActivity(i);

             }
         });

    }
}
