package com.example.callapp;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.Manifest;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private static final int REQUEST_CALL_PERMISSION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText phoneNumberEditText = findViewById(R.id.phone_number);
        Button callButton = findViewById(R.id.call_button);

        callButton.setOnClickListener(v -> {
            String phoneNumber = phoneNumberEditText.getText().toString();
            if (!phoneNumber.isEmpty()){
                makePhoneCall(phoneNumber);
            }
            else {
                Toast.makeText(this, "Please enter a phone number", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void makePhoneCall(String phoneNumber){
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)!= PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_CALL_PERMISSION);
        } else{
            Intent callIntent =  new Intent(Intent.ACTION_CALL);
            callIntent.setData(Uri.parse("tel:" + phoneNumber));
            startActivity(callIntent);
        }
    }

    public void setRequestCallPermission(int requestCode, @NonNull String[] Permission, @NonNull int[] grantResult){
        if (requestCode == REQUEST_CALL_PERMISSION){
            if (grantResult.length > 0 && grantResult[0] == PackageManager.PERMISSION_GRANTED){
                Toast.makeText(this, "Permission granted. Try again.", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(this, " Permission denied", Toast.LENGTH_SHORT).show();
            }
        }
    }
}