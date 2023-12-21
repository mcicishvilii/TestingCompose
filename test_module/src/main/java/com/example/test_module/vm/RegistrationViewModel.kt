package com.example.test_module.vm

import androidx.lifecycle.ViewModel
import com.example.test_module.navigation.RegistrationNavigator
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RegistrationViewModel @Inject constructor(
    private val navigator: RegistrationNavigator
) : ViewModel() {
    fun navigateToLogin() {
        navigator.navigateToLogin()
    }
}