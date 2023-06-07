package com.mama.mama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.TextView
import com.mama.mama.databinding.ActivityBothLogInBinding
import com.mama.mama.databinding.ActivityCategoryBinding

class CategoryActivity : AppCompatActivity() {
    lateinit var binding: ActivityCategoryBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btHome.setOnClickListener {
            val intent= Intent(this,MamaMbogaActivity::class.java)
            startActivity(intent)
        }
    }
}