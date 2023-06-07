import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.mama.mama.BothLogInActivity
import com.mama.mama.databinding.ActivityAddProductBinding
import com.mama.mama.databinding.ActivityBothLogInBinding
import com.mama.mama.databinding.ActivityBothRegisterBinding

class BothRegisterActivity : AppCompatActivity() {
    lateinit var binding: ActivityBothRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBothRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btLogIn.setOnClickListener {
            val intent = Intent(this, BothLogInActivity::class.java)
            startActivity(intent)
        }

    }

    override fun onResume() {
        super.onResume()

        binding.btLogIn.setOnClickListener {
            val intent = Intent(this@BothRegisterActivity, BothLogInActivity::class.java)
            startActivity(intent)
            validateSignUp()
            clearErrors()
        }
    }

    private fun validateSignUp() {
        val fullname = binding.etfullName.text.toString()
        val email = binding.etEmail.text.toString()
        val password = binding.etPassword.text.toString()
        val confirmpassword = binding.etConfirmPassword.text.toString()
        var error = false

        if (fullname.isBlank()) {
            binding.tilfullName.error = "Full name is required"
            error = true
        }

        if (email.isBlank()) {
            binding.tilEmail.error = "Email is required"
            error = true
        }

        if (password.isBlank()) {
            binding.tilPassword.error = "Password is required"
            error = true
        }

        if (confirmpassword.isBlank()) {
            binding.tilConfirmPassword.error = "Confirm password is required"
            error = true
        }

        if (!error) {
            Toast.makeText(this, "$fullname $email", Toast.LENGTH_LONG).show()
            val intent = Intent(this, BothLogInActivity::class.java)
            startActivity(intent)
        }
    }

    private fun clearErrors() {
        binding.tilfullName.error = null
        binding.tilEmail.error = null
        binding.tilPassword.error = null
    }
}






////        etFullName = findViewById(R.id.et_fullName)
////        etEmail = findViewById(R.id.etEmail)
////        etUsername = findViewById(R.id.et_username)
////        etPassword = findViewById(R.id.etPassword)
////        etConfirmPassword = findViewById(R.id.et_confirm_password)
////        btnRegister = findViewById(R.id.etRegister)
////
////        btnRegister.setOnClickListener {
////            val fullName = etFullName.text.toString()
////            val email = etEmail.text.toString()
////            val username = etUsername.text.toString()
////            val password = etPassword.text.toString()
////            val confirmPassword = etConfirmPassword.text.toString()
////
////            if (fullName.isNotEmpty() && email.isNotEmpty() && username.isNotEmpty() &&
////                password.isNotEmpty() && confirmPassword.isNotEmpty()) {
////                if (password == confirmPassword) {
////
////                    Toast.makeText(this, "Registration successful!", Toast.LENGTH_SHORT).show()
////
////                    navigateToHomePage()
////                } else {
////                    Toast.makeText(this, "Passwords do not match", Toast.LENGTH_SHORT).show()
////                }
////            } else {
////                Toast.makeText(this, "Please fill in all the fields", Toast.LENGTH_SHORT).show()
////            }
////        }
////    }
//
//    private fun navigateToHomePage() {
//        startActivity(intent)
//        finish()
//    }
//}
