package com.maverick.dagger_hilt.module

import com.maverick.dagger_hilt.FirebaseRepository
import com.maverick.dagger_hilt.SQLRepository
import com.maverick.dagger_hilt.UserRepository
import com.maverick.dagger_hilt.utils.FirebaseQualifier
import com.maverick.dagger_hilt.utils.SQLQualifier
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

@Module
@InstallIn(ActivityComponent::class)
class UserModule {

    @Provides
    @FirebaseQualifier
    fun providesUserRepository(firebaseRepository: FirebaseRepository): UserRepository = firebaseRepository

    /**
     * Upper and Lower Both are SAME
     */

    @Provides
    @SQLQualifier
    fun providesSQLRepository(): UserRepository = SQLRepository()

}