package com.example.kosmetika

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Lipstick : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lipstick)

        val back1 = findViewById<ImageView>(R.id.back)

        back1.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java ))
        }
    }
}