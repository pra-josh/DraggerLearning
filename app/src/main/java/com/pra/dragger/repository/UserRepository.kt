package com.pra.dragger.repository

import android.util.Log
import com.pra.dragger.Constants
import javax.inject.Inject
import javax.inject.Named

interface UserRepository{
    fun saveUser(email: String, password: String)
}


class SqlRepository @Inject constructor(@Named("mixPanel") val
                                        analyticsService: AnalyticsService) :UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(Constants.TAG, "User Saved in SQL DB")
        analyticsService.trackEvent("Add user", "SQL db")
    }
}

class FireBaseRepository(val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(Constants.TAG, "User Saved in FireBase")
        analyticsService.trackEvent("Add user", "FireBase db")
    }
}