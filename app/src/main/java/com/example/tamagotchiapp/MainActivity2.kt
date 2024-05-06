package com.example.tamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    private lateinit var feed:Button
    private lateinit var clean:Button
    private lateinit var play:Button
    private lateinit var petView: ImageView
    private lateinit var hunger:TextView
    private lateinit var wash:TextView
    private lateinit var happy:TextView

    private var hungerValue = 0
    private var cleanValue = 0
    private var happyValue = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        feed = findViewById(R.id.btnFeed)
        clean = findViewById(R.id.btnClean)
        play = findViewById(R.id.btnPlay)
        petView = findViewById(R.id.imgFeedCleanPlay)
        hunger = findViewById(R.id.txtHunger)
        wash = findViewById(R.id.txtClean)
        happy= findViewById(R.id.txtHappy)

        feed.setOnClickListener {
            // set image for button btnFeed and increment integer for hunger status by 1
            petView.setImageResource(R.drawable.cdeating)
            hungerValue++
            hunger.text = "$hungerValue"
        }
        clean.setOnClickListener {
            // set image for button btnClean and increment integer for wash status by 1
            petView.setImageResource(R.drawable.cdcleaning)
            cleanValue++
            wash.text = "$cleanValue"
        }
        play.setOnClickListener {
            // set image for button btnPlay and increment integer for happy status by 1
            petView.setImageResource(R.drawable.cdplaying)
            happyValue++
            happy.text = "$happyValue"
        }
    }
}