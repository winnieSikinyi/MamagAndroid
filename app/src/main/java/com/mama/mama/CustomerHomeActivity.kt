package com.mama.mama
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CustomerHomeActivity : AppCompatActivity() {
    lateinit var imgFruity: ImageView
    lateinit var tvFruitss: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_home)
        imgFruity = findViewById(R.id.imgFruity)
        imgFruity.setOnClickListener {
            val intent = Intent(this, ProductCatalogActivity::class.java)
            startActivity(intent)
        }
        tvFruitss = findViewById(R.id.tvFruitss)
        tvFruitss.setOnClickListener {
            val intent = Intent(this, ProductCatalogActivity::class.java)
            startActivity(intent)


        }
    }
}

