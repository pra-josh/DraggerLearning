package com.pra.dragger.repository

import android.util.Log
import com.pra.dragger.Constants
import javax.inject.Inject

class UserRepository @Inject constructor() {

    fun saveUser(email: String, password: String) {
        Log.d(Constants.TAG, "User Saved in DB")
    }


}