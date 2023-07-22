package com.pra.dragger.repository

import android.util.Log
import com.pra.dragger.Constants
import javax.inject.Inject
import javax.inject.Singleton

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

@Singleton
class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(Constants.TAG, "Email Sent $to")
    }
}

class MessageService(val retryCount:Int,val totalcount:Int) : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(Constants.TAG, "Message Sent $to retry count $retryCount TCount ----< $totalcount")
    }
}