package com.mama.mama


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProductActivity : AppCompatActivity() {
    lateinit var btBackProduct: Button
    lateinit var btCheckout: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        btBackProduct = findViewById(R.id.btBackProduct)
        btBackProduct.setOnClickListener {
            val intent = Intent(this, ProductCatalogActivity::class.java)
            startActivity(intent)
        }
        btCheckout = findViewById(R.id.btCheckout)
        btCheckout.setOnClickListener {
            val intent = Intent(this, ConfirmActivity::class.java)
            startActivity(intent)
        }
    }

}


