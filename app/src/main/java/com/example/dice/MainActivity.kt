package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Switch
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var diceResult : Int = 0
    //var sidesByDefault = 6

    lateinit var resultNumber : TextView
    lateinit var inputDiceSides : EditText
    lateinit var Image : ImageView

// prints new sequence every time


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var button = findViewById<Button>(R.id.rollButton)
        resultNumber = findViewById(R.id.showDice)
        inputDiceSides = findViewById(R.id.editSide)
        Image = findViewById(R.id.imageView)



        button.setOnClickListener {



            roll()



        }
    }

    fun roll(){

        val sides =inputDiceSides.text.toString().toIntOrNull()

if (sides == null){return}

       this.diceResult =  (1..sides).random()


        resultNumber.text =diceResult.toString()
        if (diceResult.toString().toInt()==1){
            Image.setBackgroundResource(R.drawable.dice1)
        }
        else if (diceResult.toString().toInt()==2){
            Image.setBackgroundResource(R.drawable.dice2)
        }
       else if(diceResult.toString().toInt()==3){
            Image.setBackgroundResource(R.drawable.dice3)
        }
        else if(diceResult.toString().toInt()==4){
            Image.setBackgroundResource(R.drawable.dice4)
        }
        else if(diceResult.toString().toInt()==5){
            Image.setBackgroundResource(R.drawable.dice5)
        }
        else if(diceResult.toString().toInt()==6){
            Image.setBackgroundResource(R.drawable.dice6)
        }
        else{Image.setBackgroundResource(R.drawable.dicemore)}




    }


}