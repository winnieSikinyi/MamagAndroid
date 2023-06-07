package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MpesaActivity : AppCompatActivity() {
    lateinit var btnConfirmPayment:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mpesa)
        btnConfirmPayment=findViewById(R.id.btnConfrimPayment)
        btnConfirmPayment.setOnClickListener {
            val intent=Intent(this,FinalActivity::class.java)
            startActivity(intent)
        }

    }
}