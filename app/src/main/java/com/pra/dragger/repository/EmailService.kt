package com.pra.dragger.repository

import android.util.Log
import com.pra.dragger.Constants
import com.pra.dragger.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Named
import javax.inject.Singleton

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

@ApplicationScope
class EmailService @Inject constructor(@Named("mixPanel") val analyticsService: AnalyticsService) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(Constants.TAG, "Email Sent $to")
        analyticsService.trackEvent("send Email", "EMail")
    }
}

class MessageService(val retryCount:Int,val totalcount:Int, val analyticsService: AnalyticsService) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(Constants.TAG, "Message Sent $to retry count $retryCount TCount ----< $totalcount")
        analyticsService.trackEvent("send Message", "message")
    }
}