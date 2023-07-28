package com.pra.dragger.di

import com.pra.dragger.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@ApplicationScope
@Component(modules = [UserRepositoryServiceModule::class,
    NotificationServiceModule::class,AnalyticsServiceModule::class])
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