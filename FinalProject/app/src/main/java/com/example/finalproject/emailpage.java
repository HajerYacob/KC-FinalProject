package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.se.omapi.Session;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Properties;

public class emailpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emailpage);



// find view
        EditText msg = findViewById(R.id.editTextTextSMS);
        TextView phone = findViewById(R.id.edittextphoneno);
        Button send = findViewById(R.id.buttonsend);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneno=phone.getText().toString();
                String message=msg.getText().toString();

                SmsManager smsmanager = SmsManager.getDefault();
                Intent intent = new Intent(getApplicationContext(),emailpage.class);
                PendingIntent pi =PendingIntent.getActivity(getApplicationContext(),0,intent,0);

                smsmanager.sendTextMessage (phoneno,null,message,pi,null);
                 Toast.makeText(getApplicationContext(), "Message Send Successfully !! ", Toast.LENGTH_SHORT).show();


            }
        });


// bundel detalis
        Bundle bun = getIntent().getExtras();

    }
}