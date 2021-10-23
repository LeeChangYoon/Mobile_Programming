package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn0: Button = findViewById(R.id.button0)
        val btn1: Button = findViewById(R.id.button1)
        val btn2: Button = findViewById(R.id.button2)
        val btn3: Button = findViewById(R.id.button3)
        val btn4: Button = findViewById(R.id.button4)
        val btn5: Button = findViewById(R.id.button5)
        val btn6: Button = findViewById(R.id.button6)
        val btn7: Button = findViewById(R.id.button7)
        val btn8: Button = findViewById(R.id.button8)
        val btn9: Button = findViewById(R.id.button9)
        val btn_star: Button = findViewById(R.id.button_star)
        val btn_sharp: Button = findViewById(R.id.button_sharp)
        val result: TextView = findViewById(R.id.textView)
        var cur: String = ""

        btn0.setOnClickListener {
            cur = result.text.toString()
            cur += "0"
            result.setText(cur)
        }
        btn1.setOnClickListener {
            cur = result.text.toString()
            cur += "1"
            result.setText(cur)
        }
        btn2.setOnClickListener {
            cur = result.text.toString()
            cur += "2"
            result.setText(cur)
        }
        btn3.setOnClickListener {
            cur = result.text.toString()
            cur += "3"
            result.setText(cur)
        }
        btn4.setOnClickListener {
            cur = result.text.toString()
            cur += "4"
            result.setText(cur)
        }
        btn5.setOnClickListener {
            cur = result.text.toString()
            cur += "5"
            result.setText(cur)
        }
        btn6.setOnClickListener {
            cur = result.text.toString()
            cur += "6"
            result.setText(cur)
        }
        btn7.setOnClickListener {
            cur = result.text.toString()
            cur += "7"
            result.setText(cur)
        }
        btn8.setOnClickListener {
            cur = result.text.toString()
            cur += "8"
            result.setText(cur)
        }
        btn9.setOnClickListener {
            cur = result.text.toString()
            cur += "9"
            result.setText(cur)
        }
        btn_star.setOnClickListener {
            cur = result.text.toString()
            cur += "*"
            result.setText(cur)
        }
        btn_sharp.setOnClickListener {
            cur = result.text.toString()
            cur += "#"
            result.setText(cur)
        }
    }
}