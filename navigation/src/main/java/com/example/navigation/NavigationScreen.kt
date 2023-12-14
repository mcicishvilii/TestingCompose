package com.example.navigation

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.core.NavigationItem

@Composable
fun NavigationScreen(navController: NavController) {
    Button(onClick = {
        navController.navigate(NavigationItem.TestModule.route)
    }) {
        Text(text = "to test Screen")
    }
}