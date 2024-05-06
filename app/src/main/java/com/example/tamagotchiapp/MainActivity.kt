package com.example.tamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val getStarted = findViewById<Button>(R.id.btnStart)

        getStarted.setOnClickListener {
            val next = Intent(this, MainActivity2::class.java)
            startActivity(next)
        }
    }
}