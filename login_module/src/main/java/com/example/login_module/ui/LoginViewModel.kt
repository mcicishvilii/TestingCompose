package com.example.login_module.ui

import androidx.lifecycle.ViewModel
import com.example.di.NavControllerHolder
import com.example.test_module.navigation.RegistrationNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    var navControllerHolder: NavControllerHolder,
    var registrationNavigator: RegistrationNavigator
) : ViewModel()