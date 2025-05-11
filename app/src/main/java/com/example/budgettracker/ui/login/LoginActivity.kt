package com.example.budgettracker.ui.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.budgettracker.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.loginButton.setOnClickListener {
            val username = binding.usernameEditText.text.toString().trim()
            val password = binding.passwordEditText.text.toString().trim()

            if (username.isEmpty()) {
                binding.usernameEditText.error = "Username is required"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                binding.passwordEditText.error = "Password is required"
                return@setOnClickListener
            }

            // TODO: Authenticate user (placeholder)
            if (username == "admin" && password == "password") {
                // Successful login - proceed to next screen
                // TODO: Implement navigation to main app screen
            } else {
                // Show error
                binding.passwordEditText.error = "Invalid username or password"
            }
        }
    }
}
