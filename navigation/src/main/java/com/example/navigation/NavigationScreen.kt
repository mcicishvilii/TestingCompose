package com.example.navigation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.test_module.destinations.SecondScreenDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun NavigationScreen(
    navigator: DestinationsNavigator
) {
    Button(onClick = {
        navigator.navigate(SecondScreenDestination)
    }) {
        Text(text = "Main Screen")
    }
}