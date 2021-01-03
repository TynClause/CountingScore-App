package com.namaka.CountingScore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.math.max

class basketBallCounter : AppCompatActivity() {
    private var scoreA = 0
    private var scoreB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_basket_ball_counter)
    }

    private fun displayABasketBall(number: Int) {
        val scoreTeamA: TextView = findViewById(R.id.DisplayABasketBall)
        scoreTeamA.text = "" + scoreA
    }

    private fun displayBBasketBall(number: Int) {
        val scoreTeamA: TextView = findViewById(R.id.DisplayBBasketBall)
        scoreTeamA.text = "" + scoreB
    }

    fun addTeamA3Basket(view: View) {
        scoreA += 3
        displayABasketBall(scoreA)
    }

    fun addTeamA2Basket(view: View) {
        scoreA += 2
        displayABasketBall(scoreA)
    }

    fun addTeamA1Basket(view: View) {
        scoreA += 1
        displayABasketBall(scoreA)
    }

    fun minusTeamA3Basket(view: View) {
        if(scoreA > 0){
            scoreA -= 3
            scoreA = max(scoreA,0)
            displayABasketBall(scoreA)
        }
    }

    fun minusTeamA2Basket(view: View) {
        if(scoreA > 0){
            scoreA -= 2
            scoreA = max(scoreA,0)
            displayABasketBall(scoreA)
        }
    }

    fun minusTeamA1Basket(view: View) {
        if(scoreA > 0){
            scoreA -= 1
            scoreA = max(scoreA,0)
            displayABasketBall(scoreA)
        }
    }

    fun addTeamB3Basket(view: View) {
        scoreB += 3
        displayBBasketBall(scoreB)
    }

    fun addTeamB2Basket(view: View) {
        scoreB += 2
        displayBBasketBall(scoreB)
    }

    fun addTeamB1Basket(view: View) {
        scoreB += 1
        displayBBasketBall(scoreB)
    }

    fun minusTeamB3Basket(view: View) {
        if(scoreB > 0){
            scoreB -= 3
            scoreB = max(scoreB,0)
            displayBBasketBall(scoreB)
        }
    }

    fun minusTeamB2Basket(view: View) {
        if(scoreB > 0){
            scoreB -= 2
            scoreB = max(scoreB,0)
            displayBBasketBall(scoreB)
        }
    }

    fun minusTeamB1Basket(view: View) {
        if(scoreB > 0){
            scoreB -= 1
            scoreB = max(scoreB,0)
            displayBBasketBall(scoreB)
        }
    }

    fun resetScoreBasketBall(view: View){
        scoreB = 0
        scoreA = 0
        displayABasketBall(scoreA)
        displayBBasketBall(scoreB)
    }
}