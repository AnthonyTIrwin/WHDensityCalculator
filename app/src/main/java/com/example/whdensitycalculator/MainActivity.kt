package com.example.whdensitycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcButton = findViewById<Button>(R.id.btnCalc)
        val clrButton = findViewById<Button>(R.id.btnClear)
        val numOne = findViewById<EditText>(R.id.numOne)
        val numTwo = findViewById<EditText>(R.id.numTwo)

        //clear editTexts of data with btnClear
        clrButton.setOnClickListener{
            numOne.setText(" ")
            numTwo.setText(" ")

        }

        //handle calculate button click
        calcButton.setOnClickListener {
            val numbOneEt = numOne.text.toString().toInt()
            val numTwoEt = numTwo.text.toString().toInt()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NUM_ONE", numbOneEt)
            intent.putExtra("NUM_TWO", numTwoEt)
            startActivity(intent)
        }
    }}




