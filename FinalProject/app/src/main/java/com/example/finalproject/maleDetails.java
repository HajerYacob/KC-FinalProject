package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class maleDetails extends AppCompatActivity {

    ViewPager2 viewPager2;
    ArrayList<ViewPagerItem> viewpagerItemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_details);

        Bundle bundle = getIntent().getExtras();


        viewPager2 = findViewById(R.id.viewpager);
        int[] images = {R.drawable.blu, R.drawable.district, R.drawable.lets};
        String[] heading = {"NATION", "PADEL ACADEMAY ", "LET S PADEL "};
        String[] desc = {getString(R.string.a_desc),
                getString(R.string.b_desc),
                getString(R.string.c_desc)};

        viewpagerItemArrayList = new ArrayList<>();

        for (int i = 0; i < images.length ; i++) {
            ViewPagerItem viewpagerItem = new ViewPagerItem(images[i], heading[i], desc[i]);
            viewpagerItemArrayList.add(viewpagerItem);

        }



        VPadapter vPadapter = new VPadapter(viewpagerItemArrayList);

        viewPager2.setAdapter(vPadapter);

        viewPager2.setClipToPadding(false);

        viewPager2.setClipChildren(false);

        viewPager2.setOffscreenPageLimit(2);

        viewPager2.getChildAt(0).setOverScrollMode(View.OVER_SCROLL_NEVER);

    }
}