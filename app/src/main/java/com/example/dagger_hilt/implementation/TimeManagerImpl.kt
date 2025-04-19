package com.example.dagger_hilt.implementation

// TimeManagerImpl.kt
import com.example.dagger_hilt._interface.TimeManager
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import javax.inject.Inject

class TimeManagerImpl @Inject constructor() : TimeManager {

    override fun getCurrentTime(): String
    = SimpleDateFormat("HH:mm", Locale.getDefault()).format(Date())
}