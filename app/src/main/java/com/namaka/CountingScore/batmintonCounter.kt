package com.namaka.CountingScore

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.max

class batmintonCounter : AppCompatActivity() {
    //deklarasi score A dan Score B
    private var scoreA = 0
    private var scoreB = 0
    private var checkpoint = 1
    private var batas = 21

    //inisialisasi layout saat pemanggilan class
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batminton_counter)
    }

    private fun displayABatminton(number: Int) {
        val scoreTeamA: TextView = findViewById(R.id.DisplayABatminton)
        scoreTeamA.setText("" + scoreA)
    }

    private fun displayBBatminton(number: Int) {
        val scoreTeamA: TextView = findViewById(R.id.DisplayBBatminton)
        scoreTeamA.setText("" + scoreB)
    }


    fun checkJus(numberA: Int, numberB: Int) {
        val viewRonde1ABatminton: ImageView = findViewById(R.id.Ronde1ABatminton)
        val viewRonde2ABatminton: ImageView = findViewById(R.id.Ronde2ABatminton)
        val viewRonde3ABatminton: ImageView = findViewById(R.id.Ronde3ABatminton)
        val viewRonde1BBatminton: ImageView = findViewById(R.id.Ronde1BBatminton)
        val viewRonde2BBatminton: ImageView = findViewById(R.id.Ronde2BBatminton)
        val viewRonde3BBatminton: ImageView = findViewById(R.id.Ronde3BBatminton)
        val selisih = numberA - numberB
        val maximum = max(numberA, numberB)

        if (checkpoint == 1) {
            if ((maximum == batas) && ((selisih > 1) || (selisih < -1) )) {
                if (maximum == numberA) {
                    viewRonde1ABatminton.setBackgroundColor(Color.parseColor("#4CAF50"))
                    viewRonde1BBatminton.setBackgroundColor(Color.parseColor("#E91E63"))
                    scoreA = 0
                    scoreB = 0
                    batas= 21
                }
                else {
                    viewRonde1ABatminton.setBackgroundColor(Color.parseColor("#E91E63"))
                    viewRonde1BBatminton.setBackgroundColor(Color.parseColor("#4CAF50"))
                    scoreA = 0
                    scoreB = 0
                    batas = 21
                }
                checkpoint = 2
            }
            else if ((maximum == batas) && ((selisih == 1) || (selisih == -1))){
                batas += 1
            }
        }
        else if (checkpoint == 2) {
            if ((maximum == batas) && ((selisih > 1) || (selisih < -1) )) {
                if (maximum == numberA) {
                    viewRonde2ABatminton.setBackgroundColor(Color.parseColor("#4CAF50"))
                    viewRonde2BBatminton.setBackgroundColor(Color.parseColor("#E91E63"))
                    scoreA = 0
                    scoreB = 0
                    batas = 21
                }
                else {
                    viewRonde2ABatminton.setBackgroundColor(Color.parseColor("#E91E63"))
                    viewRonde2BBatminton.setBackgroundColor(Color.parseColor("#4CAF50"))
                    scoreA = 0
                    scoreB = 0
                    batas = 21
                }
                checkpoint = 3
            }
            else if ((maximum == batas) && ((selisih == 1) || (selisih == -1))){
                batas += 1
            }
        }
        else {
            if ((maximum == batas) && ((selisih > 1) || (selisih < -1) )) {
                if (maximum == numberA) {
                    viewRonde3ABatminton.setBackgroundColor(Color.parseColor("#4CAF50"))
                    viewRonde3BBatminton.setBackgroundColor(Color.parseColor("#E91E63"))
                    scoreA = 0
                    scoreB = 0
                    batas = 21
                } else {
                    viewRonde3ABatminton.setBackgroundColor(Color.parseColor("#E91E63"))
                    viewRonde3BBatminton.setBackgroundColor(Color.parseColor("#4CAF50"))
                    scoreA = 0
                    scoreB = 0
                    batas = 21
                }
            }
            else if ((maximum == batas) && ((selisih == 1) || (selisih == -1))){
                batas += 1
            }
        }

    }


    //tambah score A
    fun addTeamABatminton(view: View) {
        scoreA += 1
        displayABatminton(scoreA)
        if(scoreA >= 21){
            checkJus(scoreA,scoreB)
            displayABatminton(scoreA)
            displayBBatminton(scoreB)
        }

    }

    //tambah score B
    fun addTeamBBatminton(view: View) {
        scoreB += 1
        displayBBatminton(scoreB)
        if(scoreB >= 21){
            checkJus(scoreA,scoreB)
            displayABatminton(scoreA)
            displayBBatminton(scoreB)
        }
    }

    //reset Score disini
    fun resetScoreBatminton(view: View) {
        scoreB = 0
        scoreA = 0
        displayABatminton(scoreA)
        displayBBatminton(scoreB)
    }

    //minus score B disini
    fun minusTeamBBatminton(view: View) {
        if (scoreB != 0) {
            scoreB -= 1
            displayBBatminton(scoreB)
        }
    }

    //minus score A disini
    fun minusTeamABatminton(view: View) {
        if (scoreA != 0) {
            scoreA -= 1
            displayABatminton(scoreA)
        }
    }
}