package com.pra.dragger.di

import com.pra.dragger.repository.AnalyticsService
import com.pra.dragger.repository.MixPanel
import dagger.Module
import dagger.Provides

@Module
class AnalyticsServiceModule {

    @ApplicationScope
    @Provides
    fun getAnalyticsService(): AnalyticsService {
        return MixPanel();
    }
}