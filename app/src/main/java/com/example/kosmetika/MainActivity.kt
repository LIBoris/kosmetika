package com.example.kosmetika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lip = findViewById<TextView>(R.id.lipstick)
        val brush = findViewById<TextView>(R.id.brushes)

        lip.setOnClickListener {
            startActivity(Intent(this, Lipstick::class.java ))
        }

        brush.setOnClickListener {
            startActivity(Intent(this, Brush::class.java ))
        }
    }
}