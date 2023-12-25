package com.example.myapplication.di

import com.example.di.NavControllerHolder
import com.example.login_module.ui.destinations.LoginScreenOneDestination
import com.example.test_module.navigation.RegistrationNavigator
import com.example.test_module.screens.destinations.TestScreenDestination
import com.ramcosta.composedestinations.navigation.navigate
import javax.inject.Inject

class RegistrationNavigatorImpl @Inject constructor(
    private val navControllerHolder: NavControllerHolder
):RegistrationNavigator {
    override fun navigateToTest() {
//        navControllerHolder.navController?.navigate(TestScreenDestination)
    }

    override fun navigateToLogin() {
        navControllerHolder.navController?.navigate(LoginScreenOneDestination)
    }
}