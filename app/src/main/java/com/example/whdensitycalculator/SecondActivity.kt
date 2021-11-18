package com.example.whdensitycalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


        //  variables
        val bacBtn = findViewById<Button>(R.id.btnGoBack)
        val numOne = intent.getStringExtra("NUM_ONE")
        val numTwo = intent.getStringExtra("NUM_TWO")
        val jkjl = intent.getIntExtra("NUM_ONE")
        val asd = intent.getIntExtra("NUM_TWO")
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val lk = jkjl + asd


        txtResult.text = lk.toString()





        bacBtn.setOnClickListener {
           callMainActivity()
        }



    }





    private fun callMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }





}
