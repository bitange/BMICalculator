package com.example.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weightText = findViewById<EditText>(R.id.etWeight)
        val heightText = findViewById<EditText>(R.id.etHeight)
        val calcButton = findViewById<Button>(R.id.btnCalculate)

        calcButton.setOnClickListener{
            val weight= weightText.text.toString()
            val height=heightText.text.toString()

             val bmi =weight.toFloat()/(height.toFloat()/100)*(height.toFloat()/100)
            val bmi2d =String.format("%.2f",bmi).toFloat()
            displayResult(bmi2d)

        }
    }
    private fun displayResult(bmi:Float){

    }
}