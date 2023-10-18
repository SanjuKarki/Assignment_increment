package com.example.assignment_increment

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private var count = 0
    private lateinit var countTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.countTextView)

        val addButton: Button = findViewById(R.id.addButton)
        addButton.setOnClickListener { addCounter() }

        val subButton: Button = findViewById(R.id.subButton)
        subButton.setOnClickListener { subCounter() }
    }

    private fun addCounter() {
        count++
        updateCounter()
    }

    private fun subCounter() {
        if (count > 0) {
            count--
            updateCounter()
        }
    }

    private fun updateCounter() {
        countTextView.text = count.toString()
    }
}