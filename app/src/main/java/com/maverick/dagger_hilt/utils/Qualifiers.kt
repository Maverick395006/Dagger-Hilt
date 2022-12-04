package com.maverick.dagger_hilt.utils

import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import javax.inject.Qualifier

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
annotation class FirebaseQualifier

@Qualifier
@Retention(RetentionPolicy.RUNTIME)
annotation class SQLQualifier