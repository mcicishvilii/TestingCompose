package com.example.myapplication.nav

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.core.NavigationItem
import com.example.myapplication.ui.First
import com.example.myapplication.ui.Second
import com.example.navigation.NavigationScreen
import com.example.test_module.TestScreen

@Composable
fun AppNavHost(

) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationItem.TestModule.route
    ) {
        composable(NavigationItem.First.route) {
            First(navController)
        }
        composable(NavigationItem.Second.route) {
            Second(navController)
        }

        composable(NavigationItem.NavigationModule.route) {
            NavigationScreen(navController)
        }
        composable(NavigationItem.TestModule.route) {
            TestScreen(navController)
        }
    }
}