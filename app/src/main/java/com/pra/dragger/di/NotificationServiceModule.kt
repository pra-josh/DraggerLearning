package com.pra.dragger.di

import com.pra.dragger.repository.AnalyticsService
import com.pra.dragger.repository.EmailService
import com.pra.dragger.repository.MessageService
import com.pra.dragger.repository.NotificationService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule {

    @ActivityScope
    @MessageQualifier
    @Provides
    fun getMessageService(
        retryCount: Int, @TCount
        totalcount: Int,
        analyticsService: AnalyticsService
    ): NotificationService {
        return MessageService(retryCount, totalcount, analyticsService)
    }

    @ActivityScope
    @Named("EmailService")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}