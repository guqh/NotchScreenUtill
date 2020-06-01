package com.john.demo.notchscreen

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.fullscreen_usenotch).setOnClickListener {
            startActivity(Intent(this, FullScreenUseNotchNotchScreenActivity::class.java))
        }
        findViewById<Button>(R.id.fullscreen_nousenotch).setOnClickListener {
            startActivity(Intent(this, FullScreenNoUseNotchNotchScreenActivity::class.java))
        }
    }
}
