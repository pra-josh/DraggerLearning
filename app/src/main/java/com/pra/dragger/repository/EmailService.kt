package com.pra.dragger.repository

import android.util.Log
import com.pra.dragger.Constants
import javax.inject.Inject

interface NotificationService {
    fun send(to: String, from: String, body: String?)
}

class EmailService @Inject constructor() : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(Constants.TAG, "Email Sent $to")
    }
}

class MessageService : NotificationService {
    override fun send(to: String, from: String, body: String?) {
        Log.d(Constants.TAG, "Meesage Sent $to")
    }
}