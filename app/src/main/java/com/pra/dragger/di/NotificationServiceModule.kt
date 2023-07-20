package com.pra.dragger.di

import com.pra.dragger.repository.MessageService
import com.pra.dragger.repository.NotificationService
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun getMessageService(): NotificationService {
        return MessageService()
    }
}