package com.example.musicplayerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var startMusicButton:Button = findViewById(R.id.startMusicButton)
        startMusicButton.setOnClickListener {
            val intent = Intent(this, MusicService::class.java)
            startService(intent)
        }

        var stopMusicButton:Button = findViewById(R.id.stopMusicButton)
        stopMusicButton.setOnClickListener {
            val intent = Intent(this, MusicService::class.java)
            stopService(intent)
        }
    }
}