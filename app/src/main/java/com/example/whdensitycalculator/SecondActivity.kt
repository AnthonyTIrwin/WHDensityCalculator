package com.example.whdensitycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        val txtResult = findViewById<TextView>(R.id.txtResult).apply {

            text = message
        }
    }





}