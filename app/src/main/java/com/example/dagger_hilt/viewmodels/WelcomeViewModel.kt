package com.example.dagger_hilt.viewmodels

// WelcomeViewModel.kt
import androidx.lifecycle.ViewModel
import com.example.dagger_hilt._interface.TimeManager
import com.example.dagger_hilt._interface.UserManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class WelcomeViewModel @Inject constructor (
    private val userManager: UserManager,
    private val timeManager: TimeManager
) : ViewModel() {

    fun getWelcomeMessage(): String {
        val userName = userManager.getUserName()
        val currentTime = timeManager.getCurrentTime()
        return "Chào mừng : $userName - Bây giờ là : $currentTime"
    }
}