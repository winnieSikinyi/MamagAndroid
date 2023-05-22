package com.mama.mama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView

class CategoryActivity : AppCompatActivity() {
    lateinit var myCategoryActivity: TextView
    lateinit var tvFruits: TextView
    lateinit var tvvegies: TextView
    lateinit var tvcereals: TextView
    lateinit var tvcanned: TextView
    lateinit var tvHerbs: TextView
    lateinit var tvDairy: TextView
    lateinit var btnAddCategory: Button
    lateinit var btnRemoveCategory: Button
    lateinit var btnHome:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
        btnHome=findViewById(R.id.btnHome)
        btnHome.setOnClickListener {
            val intent= Intent(this,MamaMbogaActivity::class.java)
            startActivity(intent)
        }
    }
}