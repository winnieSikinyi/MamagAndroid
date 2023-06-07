package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
class PaymentActivity: AppCompatActivity() {
    lateinit var checkBoxMpesa:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        checkBoxMpesa=findViewById(R.id.checkboxMpesa)
        checkBoxMpesa.setOnClickListener {
            val intent=Intent(this,MpesaActivity::class.java)
            startActivity(intent)
        }
    }
}