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

        val bacBtn = findViewById<Button>(R.id.btnGoBack)

        val message = intent.getStringExtra("EXTRA_MESSAGE")
        val txtResult = findViewById<TextView>(R.id.txtResult).apply {

            text = message
        }

        bacBtn.setOnClickListener {

           callMainActivity()

        }
    }

    private fun callMainActivity() {
        val intent = Intent(this, MainActivity::class.java).also {
            it.putExtra("Extra_Message", "234")
            startActivity(it)
        }





}}