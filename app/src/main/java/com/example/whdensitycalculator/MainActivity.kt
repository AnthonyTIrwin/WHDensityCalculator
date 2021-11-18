package com.example.whdensitycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val calcButton = findViewById<Button>(R.id.btnCalc)
        val numOne = findViewById<EditText>(R.id.numOne)
        val numTwo = findViewById<EditText>(R.id.numTwo)

        //handle calculate button click
        calcButton.setOnClickListener {
            val numbOneEt = numOne.text.toString()
            val numTwoEt = numTwo.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NUM_ONE", numbOneEt)
            intent.putExtra("NUM_TWO", numTwoEt)
            startActivity(intent)
        }
    }}




