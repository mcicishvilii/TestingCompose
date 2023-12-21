package com.example.test_module.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.test_module.navigation.RegistrationNavigator
import com.example.test_module.vm.RegistrationViewModel
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
internal fun NavigationScreen(
    navigator: RegistrationNavigator,
) {
    val myViewModel: RegistrationViewModel = hiltViewModel()
    Column {
        Button(
            modifier = Modifier.padding(20.dp),
            onClick = {
                navigator.navigateToTest()
            }) {
            Text(text = "Submit")
        }

        Button(
            modifier = Modifier.padding(20.dp),
            onClick = {
                navigator.navigateToLogin()
            }) {
            Text(text = "Login")
        }
    }
}
