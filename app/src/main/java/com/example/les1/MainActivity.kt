package com.example.les1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var buttonClickMe : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClickMe = findViewById(R.id.btn_clickme)
        val txtHello : TextView = findViewById(R.id.txt_hello)

        txtHello.text = getString(R.string.hello_kotlin)

        buttonClickMe.setOnClickListener {
            txtHello.text = getString(R.string.you_clicked_me)


        }
    }

    private fun changeButtonText()
    {
        buttonClickMe.text = "hallo"
    }
}