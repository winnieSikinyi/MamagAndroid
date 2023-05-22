package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LogInActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var btnRegister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_log_in)
        btnLogin = findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            val intent = Intent(this, BothLogInActivity::class.java)
            startActivity(intent)
        }
        btnRegister = findViewById(R.id.btnRegister)
        btnRegister.setOnClickListener {
            val intent = Intent(this, BothRegisterActivity::class.java)
            startActivity(intent)
        }
    }
}



//buttonLogin.setOnClickListener {
//    val intent = Intent(this@LogInActivity, CustomerLogin::class.java)
//    startActivity(intent)
//}
//
//buttonRegister.setOnClickListener {
//    val intent = Intent(this@LogInActivity, VendorLogin::class.java)
//    startActivity(intent)


