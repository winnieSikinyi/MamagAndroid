package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class PaymentActivity: AppCompatActivity() {
    lateinit var btn1:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        btn1=findViewById(R.id.btn1)
        btn1.setOnClickListener {
            val intent=Intent(this,CustomerHomeActivity::class.java)
            startActivity(intent)
        }
    }
}