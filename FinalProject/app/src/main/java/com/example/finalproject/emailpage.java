package com.example.finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.se.omapi.Session;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.BreakIterator;
import java.util.Properties;

public class emailpage extends AppCompatActivity {

    EditText editTextphone , editTextmessage ;
    Button send ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emailpage);

// bundel detalis
        Bundle bun = getIntent().getExtras();


        EditText editTextphone = findViewById(R.id.edittextphoneno);
        EditText editTextmessage = findViewById(R.id.editTextTextSMS);
        Button send = findViewById(R.id.buttonsend);

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ContextCompat.checkSelfPermission(emailpage.this, Manifest.permission.SEND_SMS)
                ==PackageManager.PERMISSION_GRANTED){
                    SendSMS ();
                }else {
                    ActivityCompat.requestPermissions( emailpage.this,new String[]{Manifest.permission.SEND_SMS},
                    100);
                }
            }
        });

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 100 && grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
            SendSMS();
        } else {
            Toast.makeText(this, " Permission Denied!", Toast.LENGTH_SHORT).show();
        }

    }

    private void SendSMS() {
        String phone = editTextphone.getText().toString();
        String message = editTextmessage.getText().toString();

        if(! phone.isEmpty() && ! message.isEmpty()){
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(phone,null,message,null,null);
            Toast.makeText(this, "SMS Send Successfully ", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, " Pleas Enter Your Phone and Message ", Toast.LENGTH_SHORT).show();
        }
    }
    }
