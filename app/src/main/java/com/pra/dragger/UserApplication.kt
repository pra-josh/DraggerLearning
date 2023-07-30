package com.pra.dragger

import android.app.Application
import com.pra.dragger.di.AppComponent
import com.pra.dragger.di.DaggerAppComponent
import com.pra.dragger.di.UserRegistrationComponent

class UserApplication : Application() {


    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.builder().build()

    }
}