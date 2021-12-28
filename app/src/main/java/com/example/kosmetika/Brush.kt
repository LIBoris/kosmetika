package com.example.kosmetika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Brush : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_brush)

        val back2 = findViewById<ImageView>(R.id.back)

        back2.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java ))
        }
    }
}