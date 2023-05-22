package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConfirmActivity : AppCompatActivity() {
    lateinit var btnDelivery:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)
        btnDelivery=findViewById(R.id.btnDelivery)
        btnDelivery.setOnClickListener {
            val intent=Intent(this,PaymentActivity::class.java)
            startActivity(intent)
        }
    }
}