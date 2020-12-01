package com.example.mycalculator

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var lastNumeric = false
    var lastDecimal = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onDigit(view:View){
        tvInput.append((view as Button).text)
        lastNumeric = true
    }
    fun onClear(view: View){
        tvInput.text = ""
        lastNumeric = false
        lastDecimal = false
    }
    fun onDecimalPoint(view: View){
        if(lastNumeric && !lastDecimal){
            tvInput.append(".")
            lastNumeric = false
            lastDecimal = true
        }

    }
}