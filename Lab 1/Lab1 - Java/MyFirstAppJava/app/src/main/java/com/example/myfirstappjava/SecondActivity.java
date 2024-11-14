package com.example.myfirstappjava;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);

        String message = getIntent().getStringExtra("EXTRA_MESSAGE");
        TextView sectextView = findViewById(R.id.textViewSecond);
        sectextView.setText(message);

        TextView textViewGreet = findViewById(R.id.secTextView);
        textViewGreet.setText("Welcome to the Second Activity!");

        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(v -> finish());

    }
}