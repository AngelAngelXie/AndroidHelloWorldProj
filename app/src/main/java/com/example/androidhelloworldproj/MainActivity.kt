package com.example.androidhelloworldproj

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Log.v("SAY HI", "Button Clicked!")
            Toast.makeText(this, "Thank you for looking at my profile. I hope to talk to you soon.", Toast.LENGTH_SHORT).show()
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            Log.v("SUBMIT", "Name is submitted!")

            val inputName = findViewById<EditText>(R.id.editTextTextPersonName)
            val textDisplayedG = findViewById<TextView>(R.id.textView)
            val textDisplayedP = findViewById<TextView>(R.id.textView3)
            val greetingMsg = findViewById<TextView>(R.id.textView2)

            textDisplayedG.text = "Hi, ${inputName.text}!"
            textDisplayedP.text ="My name is Angel Xie. I am a first year student at Stony Brook University. I am aspired to work on projects that can create social impacts!"
            inputName.text.clear()
        }

    }
}