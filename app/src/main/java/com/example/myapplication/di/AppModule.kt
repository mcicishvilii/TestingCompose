package com.example.myapplication.di

import com.example.di.NavControllerHolder
import com.example.test_module.navigation.RegistrationNavigator
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RegistrationNavigatorModule {
    @Singleton
    @Provides
    fun provideRegistrationNavigator(navController: NavControllerHolder): RegistrationNavigator {
        return RegistrationNavigatorImpl(navController)
    }

    @Singleton
    @Provides
    fun provideNavControllerHolder() = NavControllerHolder()

}