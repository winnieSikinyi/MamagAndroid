package com.mama.mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.mama.mama.databinding.ActivityBothLogInBinding

class BothRegisterActivity : AppCompatActivity() {
        lateinit var binding: BothRegisterActivityBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding=BothRegisterActivityBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.btLogIn.setOnClickListener {
                val intent=Intent(this,BothLogInActivity::class.java)
                startActivity(intent)
            }
        }

    }















//        etFullName = findViewById(R.id.et_fullName)
//        etEmail = findViewById(R.id.etEmail)
//        etUsername = findViewById(R.id.et_username)
//        etPassword = findViewById(R.id.etPassword)
//        etConfirmPassword = findViewById(R.id.et_confirm_password)
//        btnRegister = findViewById(R.id.etRegister)
//
//        btnRegister.setOnClickListener {
//            val fullName = etFullName.text.toString()
//            val email = etEmail.text.toString()
//            val username = etUsername.text.toString()
//            val password = etPassword.text.toString()
//            val confirmPassword = etConfirmPassword.text.toString()
//
//            if (fullName.isNotEmpty() && email.isNotEmpty() && username.isNotEmpty() &&
//                password.isNotEmpty() && confirmPassword.isNotEmpty()) {
//                if (password == confirmPassword) {
//
//                    Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()
//
//                    navigateToHomePage()
//                } else {
//                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
//                }
//            } else {
//                Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }
//
//    private fun navigateToHomePage() {
//        startActivity(intent)
//        finish()
//    }
//}
