package com.pra.dragger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pra.dragger.repository.EmailService
import com.pra.dragger.repository.UserRepository
import com.pra.dragger.service.UserRegistrationService

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailService = EmailService()
        val userRepository = UserRepository()
        val userRegistrationService = UserRegistrationService(emailService, userRepository)
        userRegistrationService.registerUser("jshprakash7@gmail.com", "Prakash")

    }
}