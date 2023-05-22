package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class MamaMbogaActivity : AppCompatActivity() {
    lateinit var btnAddProducts:Button
    lateinit var btnManageOrders:Button
    lateinit var btnAddCategory:Button
    lateinit var btnFeedback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mama_mboga)

        btnAddProducts=findViewById(R.id.btnAddProducts)
        btnAddProducts.setOnClickListener {
            val intent=Intent(this,AddProductActivity::class.java)
            startActivity(intent)
        }
        btnManageOrders=findViewById(R.id.btnManageOrders)
        btnManageOrders.setOnClickListener {
            val intent=Intent(this,OrderActivity::class.java)
            startActivity(intent)
        }
        btnAddCategory=findViewById(R.id.btnAddCategory)
        btnAddCategory.setOnClickListener {
            val intent=Intent(this,CategoryActivity::class.java)
            startActivity(intent)
        }
        btnFeedback=findViewById(R.id.btnFeedback)
        btnAddProducts.setOnClickListener {
            val intent=Intent(this,AddProductActivity::class.java)
            startActivity(intent)
        }
    }

}