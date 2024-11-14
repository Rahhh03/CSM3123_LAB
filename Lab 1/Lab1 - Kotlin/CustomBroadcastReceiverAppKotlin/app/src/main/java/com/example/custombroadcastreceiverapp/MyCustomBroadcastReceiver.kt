package com.example.custombroadcastreceiverapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

public class MyCustomBroadcastReceiver : BroadcastReceiver() {
    private val TAG = "MyBroadcastReceiver"

    override fun onReceive(context: Context?, intent: Intent?) {
        intent?.let {
            if (it.action == "com.example.CUSTOM_ACTION") {
                Log.d(TAG, "Custom Broadcast Received!")
                Toast.makeText(context, "Custom Broadcast Received!", Toast.LENGTH_SHORT).show()
            }
        }
    }

}