package com.example.navigation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
internal fun NavigationScreen(
    navigator: HomeScreenNavigator
) {
    Button(onClick = {
        navigator.navigateToTest()
    }) {
        Text(text = "Main Screen")
    }
}

interface HomeScreenNavigator {
    fun navigateToTest()
}