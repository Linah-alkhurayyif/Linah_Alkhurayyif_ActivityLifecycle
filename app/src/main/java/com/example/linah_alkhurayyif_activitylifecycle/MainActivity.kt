package com.example.linah_alkhurayyif_activitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
     var state=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        state += "\nI am online\n"
        textView.text = state
    }

    override fun onStop() {
        super.onStop()
        val currentDate = SimpleDateFormat("dd/M/yyyy hh:mm:ss").format(Date())
        state += "\nLast seen at (${currentDate})\n"
        textView.text = state
    }
}