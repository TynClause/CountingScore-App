package com.namaka.CountingScore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class soccerCounter : AppCompatActivity() {
    //deklarasi score A dan Score B
    var scoreA = 0
    var scoreB = 0

    //inisialisasi layout saat pemanggilan class
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_soccer_counter)
    }

    private fun displayA(number:Int){
        val scoreTeamA : TextView = findViewById(R.id.ScoreTeamA)
        scoreTeamA.setText(""+scoreA)
    }

    private fun displayB(number:Int){
        val scoreTeamA : TextView = findViewById(R.id.ScoreTeamB)
        scoreTeamA.setText(""+scoreB)
    }

    //tambah score A
    fun addTeamA(view: View){
        scoreA += 1
        displayA(scoreA)
    }

    //tambah score B
    fun addTeamB(view: View){
        scoreB += 1
        displayB(scoreB)
    }

    //reset Score
    fun resetScore(view: View){
        scoreB = 0
        scoreA = 0
        displayA(scoreA)
        displayB(scoreB)
    }

    //minus score B
    fun minusTeamB(view: View){
        if(scoreB != 0){
            scoreB -= 1
            displayB(scoreB)
        }
    }

    //minus score A
    fun minusTeamA(view: View){
        if(scoreA != 0){
            scoreA -= 1
            displayA(scoreA)
        }

    }
}