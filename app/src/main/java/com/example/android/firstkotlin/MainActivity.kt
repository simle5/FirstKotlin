package com.example.android.firstkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textViewId.text = "Goodbye world"

        button1.setOnClickListener{
            textViewId.text = "new"}

        button1.setOnLongClickListener{
            textViewId.text = "not null"
            return@setOnLongClickListener true
        }

    }
}
