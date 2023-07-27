package com.pra.dragger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pra.dragger.di.DaggerUserRegistrationComponent
import com.pra.dragger.di.FireBaseQualifier
import com.pra.dragger.di.MessageQualifier
import com.pra.dragger.di.NotificationServiceModule
import com.pra.dragger.di.SqlQualifier
import com.pra.dragger.repository.EmailService
import com.pra.dragger.repository.NotificationService
import com.pra.dragger.repository.UserRepository
import com.pra.dragger.service.UserRegistrationService
import javax.inject.Inject
import javax.inject.Named

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService


    @Named("EmailService")
    @Inject
   lateinit var notificationService: NotificationService


/*
    @SqlQualifier
    @Inject
    lateinit var  userRepository: UserRepository
*/


    @Inject
    lateinit var emailService: EmailService


    @Inject
    lateinit var emailService1: EmailService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

     //   val dragger = DaggerUserRegistrationComponent.factory().create(10,2)
        val dragger = (application as UserApplication).dagger
        dragger.inject(this)

         userRegistrationService.registerUser("jshprakash7@gmail.com", "Prakash")

     //   userRepository.saveUser("gggg","sfsfs")
     //    notificationService.send("dsgddh","dgfdh","yrthr")
      //  userRepository.saveUser("pooja","hjh")
     //   notificationService.send("pooja","hhjhj","kkjj")
        //    val emailservice = dragger.getEmailService()
        // emailService.send("sssdsds", "sss", "sdsds")

    }
}