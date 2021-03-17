package com.example.gradiendletter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)

        showData("SIRINITY".gradientLine())
    }

    private fun showData(data: MutableList<String>) {
        CoroutineScope(Dispatchers.Main).launch {
            data.forEach {
                textView.text = it
                delay(50)
            }
        }
    }
}