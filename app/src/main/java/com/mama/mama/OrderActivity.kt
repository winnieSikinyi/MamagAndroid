package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OrderActivity : AppCompatActivity() {
    lateinit var btnCustomer1:Button
    lateinit var btnCustomer2:Button
    lateinit var btnCustomer3:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        btnCustomer1=findViewById(R.id.btnCustomer1)
        btnCustomer1.setOnClickListener {
            val intent=Intent(this,ConfirmOrderActivity::class.java)
            startActivity(intent)
        }
        btnCustomer2=findViewById(R.id.btnCustomer2)
        btnCustomer2.setOnClickListener {
            val intent=Intent(this,ConfirmOrderActivity::class.java)
            startActivity(intent)
        }
        btnCustomer3=findViewById(R.id.btnCustomer3)
        btnCustomer3.setOnClickListener {
            val intent=Intent(this,ConfirmOrderActivity::class.java)
            startActivity(intent)
        }
    }
}