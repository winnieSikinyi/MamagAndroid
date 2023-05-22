package com.mama.mama
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CustomerHomeActivity : AppCompatActivity() {
    lateinit var btNextHome: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_home)
    btNextHome=findViewById(R.id.btNextHome)
    btNextHome.setOnClickListener {
        val intent= Intent(this,ProductCatalogActivity::class.java)
        startActivity(intent)
    }


}
}

