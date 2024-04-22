package com.example.firstgo

import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.coroutines.Delay
import kotlinx.coroutines.delay

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.myButton)
        val welcomeMessage = findViewById<TextView>(R.id.textView2)



        btnClickMe.setOnClickListener{
            btnClickMe.text = "HAHA you clicked me!!"
            welcomeMessage.text = "Hello, Welcome to the Jungle we got fun and games"




        }


}}