package com.example.keyplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //val input=findViewById<TextView>(R.id.input)
    }


    private fun display(){
        val a: Int =findViewById<EditText>(R.id.num1).text.toString().toInt()
        val b: Int =findViewById<EditText>(R.id.num2).text.toString().toInt()
        val input=findViewById<TextView>(R.id.input)
        input.text = "The Value of Number is ${a+b}"
    }

    fun add(view: View) {
        display()
    }
}