package com.pra.dragger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pra.dragger.repository.EmailService
import com.pra.dragger.repository.UserRepository
import com.pra.dragger.service.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var emailService: EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val dragger = DaggerUserRegistrationComponent.create()
        dragger.inject(this)
        userRegistrationService.registerUser("jshprakash7@gmail.com",
            "Prakash")

    //    val emailservice = dragger.getEmailService()
         emailService.send("sssdsds", "sss", "sdsds")

    }
}