package com.example.kotlin_dz2

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class IncrementActivity : AppCompatActivity() {

    private var counter: Int = 1
    private val COUNT_DATA = "COUNTER"
    private lateinit var view: TextView
    private val tag: String = "Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        view = findViewById(R.id.value)
        view.text = counter.toString()
        setContentView(R.layout.increment_activity)
        Log.d(tag, "Create increment activity")
    }

    fun buttonClick(): Unit {
        val sendIntent = Intent(this, SquareActivity::class.java)
            .apply {
                val bundle = Bundle().apply { putString(COUNT_DATA, counter.toString()) }
                putExtras(bundle)
            }
        startActivity(sendIntent)
    }

    override fun onStart() {
        super.onStart()
        Log.d(tag, "Start increment activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(tag, "Resume increment activity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(tag, "Pause increment activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(tag, "Stop increment activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "Restart increment activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(tag, "Destroy increment activity")
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        counter++
        view = findViewById(R.id.value)
        view.text = counter.toString()
    }
}