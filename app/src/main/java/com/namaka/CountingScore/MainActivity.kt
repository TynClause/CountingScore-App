package com.namaka.CountingScore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun volleyBallMain(view : View){
        val intent_volley = Intent(this, volleyBallCounter::class.java)
        startActivity(intent_volley)
    }

    fun basketBallMain(view : View){
        val intent_basket = Intent(this, basketBallCounter::class.java)
        startActivity(intent_basket)
    }

    fun soccerBallMain(view : View){
        val intent_soccer = Intent(this, soccerCounter::class.java)
        startActivity(intent_soccer)
    }

    fun badmintonMain(view : View){
        val intent_batminton = Intent(this, batmintonCounter::class.java)
        startActivity(intent_batminton)
    }
}