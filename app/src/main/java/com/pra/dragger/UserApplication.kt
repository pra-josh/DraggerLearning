package com.pra.dragger

import android.app.Application
import com.pra.dragger.di.DaggerUserRegistrationComponent
import com.pra.dragger.di.UserRegistrationComponent

class UserApplication : Application() {


    lateinit var dagger: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()

        dagger = DaggerUserRegistrationComponent.factory().create(100, 3)

    }
}