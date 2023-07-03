package com.pra.dragger.service

import android.util.Log
import com.pra.dragger.repository.EmailService
import com.pra.dragger.repository.UserRepository

class UserRegistrationService(
    private val emailService: EmailService,
    private val userRepository: UserRepository
) {


    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.send(email, "prakash.joshi.android@gmail.com", "User Registered");
    }

}