package com.pra.dragger.di

import com.pra.dragger.repository.EmailService
import com.pra.dragger.repository.MessageService
import com.pra.dragger.repository.NotificationService
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NotificationServiceModule(private val retryCount :Int) {

    @MessageQualifier
    @Provides
    fun getMessageService(): NotificationService {
        return MessageService(retryCount)
    }

    @Named("EmailService")
    @Provides
    fun getEmailService(emailService: EmailService): NotificationService {
        return emailService
    }
}