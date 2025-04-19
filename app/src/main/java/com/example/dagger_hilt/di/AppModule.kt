package com.example.dagger_hilt.di

import com.example.dagger_hilt._interface.TimeManager
import com.example.dagger_hilt._interface.UserManager
import com.example.dagger_hilt.implementation.TimeManagerImpl
import com.example.dagger_hilt.implementation.UserManagerImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUserManager(): UserManager {
        return UserManagerImpl()
    }

    @Provides
    @Singleton
    fun provideTimeManager(): TimeManager {
        return TimeManagerImpl()
    }
}