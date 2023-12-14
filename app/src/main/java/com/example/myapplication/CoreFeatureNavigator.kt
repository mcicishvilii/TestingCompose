package com.example.myapplication

import androidx.navigation.NavController
import com.example.myapplication.ui.HomeScreenNavigator
import com.example.test_module.destinations.SecondScreenDestination
import com.ramcosta.composedestinations.navigation.navigate

class CoreFeatureNavigator(
    private val navController: NavController
) : HomeScreenNavigator {
    override fun navigateToTest() {
        navController.navigate(SecondScreenDestination)
    }
}