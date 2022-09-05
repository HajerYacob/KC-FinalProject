package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class maleDetails extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewPagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_details);

        Bundle bundle = getIntent().getExtras();

        viewPager2 = findViewById(R.id.viewpager);
        int[] images = {R.drawable.clubpadel, R.drawable.garpadel, R.drawable.nat,R.drawable.blupadel,R.drawable.districtpad,R.drawable.lets};
        String[] heading = {"The Padel Club", "Padel Gar", "Padel Nation" , "padelblu","Padel District","Let’s padel"};
        String[] desc = {getString(R.string.a_desc),
                getString(R.string.b_desc),
                getString(R.string.c_desc),
                getString(R.string.d_desc),
                getString(R.string.e_desc),
                getString(R.string.f_desc)};

        viewPagerItemArrayList = new ArrayList<>();

        for (int i = 0; i < images.length ; i++) {
            ViewPagerItem viewPagerItem = new ViewPagerItem(images[i], heading[i], desc[i]);
            viewPagerItemArrayList.add(viewPagerItem);

        }

        VPadapter vPadapter = new VPadapter(viewPagerItemArrayList);

        viewPager2.setAdapter(vPadapter);

        viewPager2.setClipToPadding(false);

        viewPager2.setClipChildren(false);

        viewPager2.setOffscreenPageLimit(2);

        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);


        Button a = findViewById(R.id.button);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(maleDetails.this,emailpage.class);
                startActivity(i);
            }
        });

    }
}