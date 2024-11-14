package com.example.imageexperiment

import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var layout: RelativeLayout
    private var backgroundIndex = 0
    private val backgroundImages = listOf(
        R.drawable.background_image1,
        R.drawable.background_image2,
        R.drawable.background_image3,
        R.drawable.background_image4
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        layout = findViewById(R.id.layout)
        val switchBackgroundButton: Button = findViewById(R.id.switchBackgroundButton)

        switchBackgroundButton.setOnClickListener {
            backgroundIndex = (backgroundIndex + 1) % backgroundImages.size
            layout.setBackgroundResource(backgroundImages[backgroundIndex])
        }
    }
}
