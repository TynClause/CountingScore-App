package com.namaka.CountingScore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class soccerCounter : AppCompatActivity() {
    //deklarasi score A dan Score B
    private var scoreA = 0
    private var scoreB = 0

    //inisialisasi layout saat pemanggilan class
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soccer_counter)
    }

    private fun displayASoccer(number:Int){
        val scoreTeamA : TextView = findViewById(R.id.DisplayASoccer)
        scoreTeamA.setText(""+scoreA)
    }

    private fun displayBSoccer(number:Int){
        val scoreTeamA : TextView = findViewById(R.id.DisplayBSoccer)
        scoreTeamA.setText(""+scoreB)
    }

    //tambah score A
    fun addTeamASoccer(view: View){
        scoreA += 1
        displayASoccer(scoreA)
    }

    //tambah score B
    fun addTeamBSoccer(view: View){
        scoreB += 1
        displayBSoccer(scoreB)
    }

    //reset Score
    fun resetScoreSoccer(view: View){
        scoreB = 0
        scoreA = 0
        displayASoccer(scoreA)
        displayBSoccer(scoreB)
    }

    //minus score B
    fun minusTeamBSoccer(view: View){
        if(scoreB != 0){
            scoreB -= 1
            displayBSoccer(scoreB)
        }
    }

    //minus score A
    fun minusTeamASoccer(view: View){
        if(scoreA != 0){
            scoreA -= 1
            displayASoccer(scoreA)
        }

    }
}