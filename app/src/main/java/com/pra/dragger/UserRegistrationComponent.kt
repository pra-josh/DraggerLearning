package com.pra.dragger

import com.pra.dragger.repository.EmailService
import com.pra.dragger.service.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {

    fun getUserRegistrationService(): UserRegistrationService

    fun getEmailService(): EmailService
}