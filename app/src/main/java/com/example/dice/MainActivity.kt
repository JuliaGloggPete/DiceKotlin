package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.WindowInsets.Side
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var diceResult : Int = 0
    var sides = 6

    lateinit var editTextNumber : TextView

// prints new sequence every time


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.rollButton)

  editTextNumber= findViewById(R.id.editTextNumber)


        button.setOnClickListener {



            roll()
            Log.d("###", "hallo $diceResult")
            editTextNumber.text =diceResult.toString()

        }
    }

    fun roll(): Int{


       this.diceResult =  (1..sides).random()


        return diceResult

    }


}