package com.pra.dragger.service

import android.util.Log
import com.pra.dragger.di.FireBaseQualifier
import com.pra.dragger.di.MessageQualifier
import com.pra.dragger.di.SqlQualifier
import com.pra.dragger.repository.EmailService
import com.pra.dragger.repository.NotificationService
import com.pra.dragger.repository.UserRepository
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    @MessageQualifier private val notificationService: NotificationService,
    @FireBaseQualifier private val userRepository: UserRepository
) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.send(email, "prakash.joshi.android@gmail.com", "User Registered");
    }
}