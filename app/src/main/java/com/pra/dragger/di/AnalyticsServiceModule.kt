package com.pra.dragger.di

import com.pra.dragger.repository.AnalyticsService
import com.pra.dragger.repository.FireBaseAnalytics
import com.pra.dragger.repository.MixPanel
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class AnalyticsServiceModule {

    @ApplicationScope
    @Provides
    fun getMixAnalyticsService(): AnalyticsService {
        return MixPanel();
    }


    /*@ApplicationScope
    @Named("FireBase")
    @Provides
    fun getFireBaseAnalyticsService(): AnalyticsService {
        return FireBaseAnalytics();
    }*/
}