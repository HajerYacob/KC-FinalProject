package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread thread=new Thread(){
            @Override
            public void run(){
                try {
                    sleep(2800);
                    Intent splash=new Intent(getApplicationContext(),OTPpage.class);
                    startActivities(new Intent[]{splash});
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }}};
        thread.start();



// intent to OTP page
/*
        Intent intent = new Intent(MainActivity.this,OTPpage.class);
        startActivity(intent);
*/
    }

}