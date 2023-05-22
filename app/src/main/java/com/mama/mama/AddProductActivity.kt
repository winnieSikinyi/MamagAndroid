package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddProductActivity : AppCompatActivity() {
    lateinit var btnAdd:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_product)
        btnAdd=findViewById(R.id.btnAdd)
        btnAdd.setOnClickListener {
            val intent= Intent(this,MamaMbogaActivity::class.java)
            startActivity(intent)
        }
    }
}
