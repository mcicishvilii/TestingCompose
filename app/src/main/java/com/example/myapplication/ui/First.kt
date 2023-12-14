package com.example.myapplication.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.core.NavigationItem

@Composable
fun First(navController: NavController) {
    Button(onClick = {
        navController.navigate(NavigationItem.Second.route)
    }) {
        Text(text = "tosecond Screen")
    }
}