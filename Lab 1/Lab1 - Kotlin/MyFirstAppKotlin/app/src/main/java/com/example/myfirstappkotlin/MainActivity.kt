package com.example.myfirstappkotlin
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var button:Button
        var textView:TextView

        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        button.setOnClickListener{
            textView.setTextColor(Color.RED)
            textView.text = "Button Clicked!"
            val toast = Toast.makeText(this,"Button was clicked!",Toast.LENGTH_SHORT)
            toast.show()
        }
        var buttonNav:Button
        buttonNav = findViewById(R.id.buttonNavigate)
        buttonNav.setOnClickListener{
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("EXTRA_MESSAGE", "Hello from MainActivity!");
            startActivity(intent)
        }
    }
}