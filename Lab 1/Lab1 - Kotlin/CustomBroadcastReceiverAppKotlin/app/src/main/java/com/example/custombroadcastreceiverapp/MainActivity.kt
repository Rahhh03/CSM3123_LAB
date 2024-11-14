package com.example.custombroadcastreceiverapp

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager

class MainActivity : AppCompatActivity() {

    private lateinit var myReceiver: MyCustomBroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        myReceiver = MyCustomBroadcastReceiver()

        var sendBroadcastButton:Button = findViewById(R.id.sendBroadcastButton)
        sendBroadcastButton.setOnClickListener{
            val intent = Intent("com.example.CUSTOM_ACTION")
            LocalBroadcastManager.getInstance(this).sendBroadcast(intent)
        }
    }

    override fun onStart(){
        super.onStart()
        LocalBroadcastManager.getInstance(this).registerReceiver(myReceiver, IntentFilter("com.example.CUSTOM_ACTION"))
    }

    override fun onStop(){
        super.onStop()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(myReceiver)
    }
}