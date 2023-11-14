package com.example.nutriscore

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.nutriscore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set click listeners for the buttons
        binding.loginButton.setOnClickListener(this)
        binding.subscribeButton.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.loginButton -> {
                // Handle the login button click
                startActivity(Intent(this, LoginActivity::class.java))
            }
            R.id.signupButton -> {
                // Handle the signup button click
                startActivity(Intent(this, SignupActivity::class.java))
            }
        }
    }
}
