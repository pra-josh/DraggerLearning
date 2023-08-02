package com.pra.dragger.di

import com.pra.dragger.MainActivity
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityScope
@Subcomponent(
    modules = [UserRepositoryServiceModule::class, NotificationServiceModule::class]
)
interface UserRegistrationComponent {

    fun inject(mainActivity: MainActivity)

    @Subcomponent.Builder
    interface Builder {
        fun build():UserRegistrationComponent

        fun getRetryCount(@BindsInstance retryCount:Int):Builder

        fun getTCount(@BindsInstance @TCount tCount:Int):Builder

    }
}