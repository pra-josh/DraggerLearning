package com.pra.dragger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pra.dragger.repository.EmailService
import com.pra.dragger.repository.UserRepository
import com.pra.dragger.service.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

   // @Inject
     private lateinit var  emailService:EmailService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



      ///  val emailService = EmailService()
     //   val userRepository = UserRepository()

        val draggerComponent = DaggerUserRegistrationComponent.create();
            //  val userregi =dragger.getUserRegistrationService();
        //val userRegistrationService = UserRegistrationService(emailService, userRepository)
      //  draggeruserregistration.registerUser("jshprakash7@gmail.com", "Prakash")
        val emailservice = draggerComponent.getEmailService()
        emailservice.send("sssdsds","sss","sdsds")

    }
}