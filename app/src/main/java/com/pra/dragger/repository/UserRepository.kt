package com.pra.dragger.repository

import android.util.Log
import com.pra.dragger.Constants
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}


class SqlRepository @Inject constructor(val analyticsService: AnalyticsService) :UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(Constants.TAG, "User Saved in SQL DB")
        analyticsService.trackEvent("Add user", "SQL")
    }
}

class FireBaseRepository(val analyticsService: AnalyticsService) : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(Constants.TAG, "User Saved in FireBase")
        analyticsService.trackEvent("Add user", "FireBase")
    }
}