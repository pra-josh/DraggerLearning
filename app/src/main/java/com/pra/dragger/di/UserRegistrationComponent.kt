package com.pra.dragger.di

import com.pra.dragger.MainActivity
import dagger.Component

@Component(modules = [UserRepositoryServiceModule::class,NotificationServiceModule::class])
interface UserRegistrationComponent {

   // fun getUserRegistrationService(): UserRegistrationService

  //  fun getEmailService(): EmailService

    fun inject(mainActivity: MainActivity)

}