package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickmebutton = findViewById<Button>(R.id.clickme)
        val firstTxt = findViewById<TextView>(R.id.text1)
        val secondTxt = findViewById<TextView>(R.id.text2)

        clickmebutton.setOnClickListener {
            firstTxt.text = "Hello"
        }
    }
}
