package com.pra.dragger.repository

import android.util.Log
import com.pra.dragger.Constants
import javax.inject.Inject

class EmailService @Inject constructor() {

    fun send(to: String, from: String, body: String?) {
        Log.d(Constants.TAG, "Email Sent $to")
    }

}