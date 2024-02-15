package com.example.kotlin_dz2

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SquareActivity : AppCompatActivity() {

    private val tag: String = "Lifecycle"
    private val COUNT_DATA = "COUNTER"
    private lateinit var view: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.square_activity)

        val counter = getIntent().getStringExtra(COUNT_DATA)?.toIntOrNull() ?: 0
        val square = counter * counter

        view = findViewById(R.id.square_value)
        view.text = square.toString()
        Log.d(tag, "Create square activity")
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "Start square activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "Resume square activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "Pause square activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "Stop square activity")

    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "Restart square activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "Destroy square activity")
    }
}