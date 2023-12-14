package com.example.test_module

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.core.NavigationItem

@Composable
fun TestScreen(navController: NavController) {
    Button(onClick = {
        navController.navigate(NavigationItem.NavigationModule.route)
    }) {
        Text(text = "to nav Screen")
    }
}