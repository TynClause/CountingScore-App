package com.namaka.CountingScore

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.max

class volleyBallCounter : AppCompatActivity() {
    //deklarasi score A dan Score B
    private var scoreA = 0
    private var scoreB = 0
    private var checkpoint = 1
    private var batas = 21

    //inisialisasi layout saat pemanggilan class
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_volley_ball_counter)
    }

    private fun displayAVoleyball(number: Int) {
        val scoreTeamA: TextView = findViewById(R.id.DisplayAVoleyball)
        scoreTeamA.text = "" + scoreA
    }

    private fun displayBVoleyball(number: Int) {
        val scoreTeamA: TextView = findViewById(R.id.DisplayBVoleyball)
        scoreTeamA.text = "" + scoreB
    }


    fun checkJus(numberA: Int, numberB: Int) {
        val viewRonde1AVoleyball: ImageView = findViewById(R.id.Ronde1AVoleyball)
        val viewRonde2AVoleyball: ImageView = findViewById(R.id.Ronde2AVoleyball)
        val viewRonde3AVoleyball: ImageView = findViewById(R.id.Ronde3AVoleyball)
        val viewRonde1BVoleyball: ImageView = findViewById(R.id.Ronde1BVoleyball)
        val viewRonde2BVoleyball: ImageView = findViewById(R.id.Ronde2BVoleyball)
        val viewRonde3BVoleyball: ImageView = findViewById(R.id.Ronde3BVoleyball)
        val selisih = numberA - numberB
        val maximum = max(numberA, numberB)

        if (checkpoint == 1) {
            if ((maximum == batas) && ((selisih > 1) || (selisih < -1) )) {
                if (maximum == numberA) {
                    viewRonde1AVoleyball.setBackgroundColor(Color.parseColor("#4CAF50"))
                    viewRonde1BVoleyball.setBackgroundColor(Color.parseColor("#E91E63"))
                    scoreA = 0
                    scoreB = 0
                    batas= 21
                }
                else {
                    viewRonde1AVoleyball.setBackgroundColor(Color.parseColor("#E91E63"))
                    viewRonde1BVoleyball.setBackgroundColor(Color.parseColor("#4CAF50"))
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
        if (checkpoint == 2) {
            if ((maximum == batas) && ((selisih > 1) || (selisih < -1) )) {
                if (maximum == numberA) {
                    viewRonde2AVoleyball.setBackgroundColor(Color.parseColor("#4CAF50"))
                    viewRonde2BVoleyball.setBackgroundColor(Color.parseColor("#E91E63"))
                    scoreA = 0
                    scoreB = 0
                    batas = 21
                }
                else {
                    viewRonde2AVoleyball.setBackgroundColor(Color.parseColor("#E91E63"))
                    viewRonde2BVoleyball.setBackgroundColor(Color.parseColor("#4CAF50"))
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
                    viewRonde3AVoleyball.setBackgroundColor(Color.parseColor("#4CAF50"))
                    viewRonde3BVoleyball.setBackgroundColor(Color.parseColor("#E91E63"))
                    scoreA = 0
                    scoreB = 0
                    batas = 21
                } else {
                    viewRonde3AVoleyball.setBackgroundColor(Color.parseColor("#E91E63"))
                    viewRonde3BVoleyball.setBackgroundColor(Color.parseColor("#4CAF50"))
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
    fun addTeamAVoleyball(view: View) {
        scoreA += 1
        displayAVoleyball(scoreA)
        if(scoreA >= 21){
            checkJus(scoreA,scoreB)
            displayAVoleyball(scoreA)
            displayBVoleyball(scoreB)
        }

    }

    //tambah score B
    fun addTeamBVoleyball(view: View) {
        scoreB += 1
        displayBVoleyball(scoreB)
        if(scoreB >= 21){
            checkJus(scoreA,scoreB)
            displayAVoleyball(scoreA)
            displayBVoleyball(scoreB)
        }
    }

    //reset Score disini
    fun resetScoreVoleyball(view: View) {
        scoreB = 0
        scoreA = 0
        displayAVoleyball(scoreA)
        displayBVoleyball(scoreB)
    }

    //minus score B disini
    fun minusTeamBVoleyball(view: View) {
        if (scoreB != 0) {
            scoreB -= 1
            displayBVoleyball(scoreB)
        }
    }

    //minus score A disini
    fun minusTeamAVoleyball(view: View) {
        if (scoreA != 0) {
            scoreA -= 1
            displayAVoleyball(scoreA)
        }
    }
}