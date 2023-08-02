package com.pra.dragger.di

import com.pra.dragger.repository.AnalyticsService
import dagger.Component

@ApplicationScope
@Component(modules = [AnalyticsServiceModule::class])
interface AppComponent {
 //   fun getMixAnalyticsService():AnalyticsService
    fun getUserRegistrationFactory():UserRegistrationComponent.Builder


}