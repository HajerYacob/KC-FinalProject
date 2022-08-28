package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class gender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);



        Thread thread=new Thread(){
            @Override
            public void run(){
                try {
                    sleep(2000);
                    Intent splash=new Intent(getApplicationContext(),courtType.class);
                    startActivities(new Intent[]{splash});
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}};
        thread.start();

    }
}