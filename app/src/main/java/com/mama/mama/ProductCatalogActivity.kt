package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProductCatalogActivity : AppCompatActivity() {
    lateinit var btAddToCart: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_catalog)
        btAddToCart = findViewById(R.id.btAddToCart)
        btAddToCart.setOnClickListener {
            val intent =Intent(this,ProductActivity::class.java)
            startActivity(intent)
      }

        }
    }




