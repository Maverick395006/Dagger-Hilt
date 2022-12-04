package com.maverick.dagger_hilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.maverick.dagger_hilt.utils.FirebaseQualifier
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    @FirebaseQualifier
    lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userRepository.saveUser("abcd@gmail.com", "$this")

    }
}