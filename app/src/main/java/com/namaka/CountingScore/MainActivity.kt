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
        val intentVolley = Intent(this, volleyBallCounter::class.java)
        startActivity(intentVolley)
    }

    fun basketBallMain(view : View){
        val intentBasket = Intent(this, basketBallCounter::class.java)
        startActivity(intentBasket)
    }

    fun soccerBallMain(view : View){
        val intentSoccer = Intent(this, soccerCounter::class.java)
        startActivity(intentSoccer)
    }

    fun badmintonMain(view : View){
        val intentBatminton = Intent(this, batmintonCounter::class.java)
        startActivity(intentBatminton)
    }
}