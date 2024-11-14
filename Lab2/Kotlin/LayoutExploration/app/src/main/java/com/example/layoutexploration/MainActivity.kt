package com.example.layoutexploration

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var linearLayoutButton : Button = findViewById(R.id.linearLayoutButton)
        var relativeLayoutButton : Button = findViewById(R.id.relativeLayoutButton)
        var constraintLayoutButton : Button = findViewById(R.id.constraintLayoutButton)
        var gridLayoutButton : Button = findViewById(R.id.gridLayoutButton)

        linearLayoutButton.setOnClickListener{
            val intent = Intent(this,LinearLayoutActivity::class.java)
            startActivity(intent)
        }

        relativeLayoutButton.setOnClickListener{
            val intent = Intent(this,RelativeLayoutActivity::class.java)
            startActivity(intent)
        }

        constraintLayoutButton.setOnClickListener{
            val intent = Intent(this,ConstraintLayoutActivity::class.java)
            startActivity(intent)
        }

        gridLayoutButton.setOnClickListener{
            val intent = Intent(this,GridLayoutActivity::class.java)
            startActivity(intent)
        }

    }
}