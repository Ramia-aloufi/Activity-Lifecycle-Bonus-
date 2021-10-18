package com.example.activitylifecyclebonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var tv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.tt)
    }

    override fun onStart() {
        super.onStart()
        val tt = "${tv.text.toString()}i'm online\n"
        tv.text = tt
    }

    override fun onPause() {
        val timeform = SimpleDateFormat("dd/M/yyyy hh:mm:ss")
        val currenttime = timeform.format(Date())
        val rr = "Last seen at :$currenttime"
        val aa = "${tv.text.toString()}$rr\n"
        tv.text = aa
        super.onPause()
    }
}