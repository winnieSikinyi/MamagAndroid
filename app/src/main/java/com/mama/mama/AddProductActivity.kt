package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.mama.mama.databinding.ActivityAddProductBinding
import com.mama.mama.databinding.ActivityBothLogInBinding
import com.mama.mama.databinding.ActivityCategoryBinding

class AddProductActivity : AppCompatActivity() {
    lateinit var binding: ActivityAddProductBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAddProductBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btAdd.setOnClickListener {
            val intent= Intent(this,MamaMbogaActivity::class.java)
            startActivity(intent)
        }
    }
}
