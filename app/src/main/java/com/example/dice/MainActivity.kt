package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var diceResult : Int = 0
    var sides = 6

    lateinit var resultNumber : TextView

// prints new sequence every time


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.rollButton)
        resultNumber = findViewById(R.id.showDice)


        button.setOnClickListener {



            roll()
            Log.d("###", "hallo $diceResult")
            resultNumber.text =diceResult.toString()

        }
    }

    fun roll(): Int{


       this.diceResult =  (1..sides).random()


        return diceResult

    }


}