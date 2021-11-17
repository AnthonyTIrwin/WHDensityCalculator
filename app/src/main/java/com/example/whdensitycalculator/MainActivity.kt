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

        calcButton.setOnClickListener()


            val intent = Intent(this@MainActivity, SecondActivity)
            )

    }












