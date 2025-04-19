package com.example.dagger_hilt

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.dagger_hilt.viewmodels.WelcomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private val welcomeViewModel : WelcomeViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val showButton = findViewById<Button>(R.id.show_button)

        showButton.setOnClickListener {
            val message = welcomeViewModel.getWelcomeMessage()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}