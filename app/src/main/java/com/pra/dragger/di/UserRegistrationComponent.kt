package com.pra.dragger.di

import com.pra.dragger.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [UserRepositoryServiceModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {

    // fun getUserRegistrationService(): UserRegistrationService

    //  fun getEmailService(): EmailService

    fun inject(mainActivity: MainActivity)

    @Component.Factory
   public interface factory {
        fun create(@BindsInstance count: Int,
                    @TCount
                   @BindsInstance tcount: Int): UserRegistrationComponent
    }

}