package com.example.login_module.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.test_module.vm.RegistrationViewModel
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun LoginScreenOne() {
    val myViewModel: RegistrationViewModel = hiltViewModel()
    Button(
        modifier = Modifier.padding(20.dp),
        onClick = {
            myViewModel.navigateToLogin()
        }) {
        Text(text = "goto Login two")
    }
}