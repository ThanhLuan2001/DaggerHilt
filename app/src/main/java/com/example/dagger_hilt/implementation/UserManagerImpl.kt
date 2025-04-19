package com.example.dagger_hilt.implementation

import com.example.dagger_hilt._interface.UserManager
import javax.inject.Inject

// UserManagerImpl.kt
class UserManagerImpl @Inject constructor() : UserManager {
    override fun getUserName(): String = "Nguyễn Văn A"
}