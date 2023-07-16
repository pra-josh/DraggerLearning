package com.pra.dragger.repository

import android.util.Log
import com.pra.dragger.Constants
import javax.inject.Inject

interface UserRepository{
    fun saveUser(email: String, password: String)
}


class SqlRepository @Inject constructor() :UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(Constants.TAG, "User Saved in SQL DB")
    }
}

class FireBaseRepository : UserRepository{
    override fun saveUser(email: String, password: String) {
        Log.d(Constants.TAG, "User Saved in FireBase")
    }
}