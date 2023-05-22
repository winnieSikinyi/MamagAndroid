package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btGetStart:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btGetStart=findViewById(R.id.btGetStart)
        btGetStart.setOnClickListener {
            val intent= Intent(this,LogInActivity::class.java)
            startActivity(intent)
        }
    }
}


