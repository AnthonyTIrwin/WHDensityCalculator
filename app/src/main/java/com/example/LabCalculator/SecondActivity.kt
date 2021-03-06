package com.example.LabCalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //  variables
        val bacBtn = findViewById<Button>(R.id.btnGoBack)
        val numOne = intent.getIntExtra("NUM_ONE", 0)
        val numTwo = intent.getIntExtra("NUM_TWO", 0)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        //compute answer
        val added = numOne + numTwo
        //display answer
        txtResult.text = added.toString()
        //Button to go back to main activity
        bacBtn.setOnClickListener {
           callMainActivity()
        }

    }
    //method for main activity
    private fun callMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }


}
