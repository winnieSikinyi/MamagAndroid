
package com.mama.mama

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.mama.mama.databinding.ActivityBothLogInBinding

class BothLogInActivity: AppCompatActivity() {
    lateinit var binding: ActivityBothLogInBinding
     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBothLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogInCustomer.setOnClickListener{
            val intent = Intent(this, CustomerHomeActivity::class.java)
            startActivity(intent)
        }

        binding.btnLogInVendor.setOnClickListener {
            val intent: Intent =Intent(this,MamaMbogaActivity::class.java)
            startActivity(intent)

        }
    }
}
fun validate(){

}














//        editTextUsername = findViewById(R.id.et_email)
//        editTextPassword = findViewById(R.id.et_password)
////        buttonLogin = findViewById(R.id.LogIn)
//        textViewNoAccount = findViewById(R.id.tv_no_account)
//
//        buttonLogin.setOnClickListener {
//            val username = editTextUsername.text.toString()
//            val password = editTextPassword.text.toString()
//
//            val isLoginSuccessful = performLogin(username, password)
//
//            if (isLoginSuccessful) {
//                navigateToHomePage()
//            } else {
//                navigateToRegistration()
//            }
//        }
//
//        textViewNoAccount.setOnClickListener {
//            navigateToRegistration()
//        }
//    }
//
//
//    private fun performLogin(username: String, password: String): Boolean {
//
//        return username == "admin" && password == "password"
//    }
//
//    private fun navigateToHomePage() {
//        val intent = Intent(this ,BothLogInActivity::class.java)
//        startActivity(intent)
//        finish()
//    }
//
//    private fun navigateToRegistration() {
//        val intent = Intent(this,RegisterActivity::class.java)
//        startActivity(intent)
//    }
//}
