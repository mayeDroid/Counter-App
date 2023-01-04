package com.example.counterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val buttonClickMe = findViewById<Button>(R.id.button)


        var sum = 0
        buttonClickMe.setOnClickListener {
            buttonClickMe.text = getString(R.string.buttonClickMe)
            sum += 1
            textView.text = sum.toString()


            resetButton.setOnClickListener {
                buttonClickMe.text = getString(R.string.resetButton)
                textView.text = "0"
                sum = 0
            }

        }
    }
}