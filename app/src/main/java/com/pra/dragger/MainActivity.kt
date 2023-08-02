package com.pra.dragger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pra.dragger.di.UserRegistrationComponent
import com.pra.dragger.repository.EmailService
import com.pra.dragger.repository.NotificationService
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


    lateinit var userRegistrationComponent: UserRegistrationComponent


    @Inject
    lateinit var emailService: EmailService


    @Inject
    lateinit var emailService1: EmailService


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        //   val dragger = DaggerUserRegistrationComponent.factory().create(10,2)
        val appComponent = (application as UserApplication).appComponent
         userRegistrationComponent =
            appComponent.getUserRegistrationFactory().getRetryCount(2).getTCount(10).build()
        userRegistrationComponent.inject(this)
        userRegistrationService.registerUser("jshprakash7@gmail.com", "Prakash")

        //   userRepository.saveUser("gggg","sfsfs")
        //    notificationService.send("dsgddh","dgfdh","yrthr")
        //  userRepository.saveUser("pooja","hjh")
        //   notificationService.send("pooja","hhjhj","kkjj")
        //    val emailservice = dragger.getEmailService()
        // emailService.send("sssdsds", "sss", "sdsds")

    }
}