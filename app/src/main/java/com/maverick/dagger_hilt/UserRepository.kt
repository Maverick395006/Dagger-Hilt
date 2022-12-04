package com.maverick.dagger_hilt

import android.util.Log
import javax.inject.Inject

const val TAG = "MAVERICK2022"

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in DB \nE-mail:$email \nPassword:$password")
    }
}

class FirebaseRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.d(TAG, "User Saved in Firebase \nE-mail:$email \nPassword:$password")
    }
}









