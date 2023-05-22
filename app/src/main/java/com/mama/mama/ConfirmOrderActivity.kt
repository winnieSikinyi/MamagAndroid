package com.mama.mama
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ConfirmOrderActivity : AppCompatActivity() {
    lateinit var btConfirm: Button
    lateinit var btnBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm_order)
        btConfirm = findViewById(R.id.btConfirm)
        btConfirm.setOnClickListener {
            val intent = Intent(this, MamaMbogaActivity::class.java)
            startActivity(intent)
        }
            btnBack = findViewById(R.id.btnBack)
            btnBack.setOnClickListener {
                val intent= Intent(this, OrderActivity::class.java)
                startActivity(intent)
            }
        }
    }




