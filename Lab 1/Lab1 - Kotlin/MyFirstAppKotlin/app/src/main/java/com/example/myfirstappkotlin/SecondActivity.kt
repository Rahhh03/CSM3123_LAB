package com.example.myfirstappkotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        val textView: TextView = findViewById(R.id.textViewSecond)
        textView.text = message

        val backButton: Button = findViewById(R.id.buttonBack)
        backButton.setOnClickListener{finish()}
    }
}