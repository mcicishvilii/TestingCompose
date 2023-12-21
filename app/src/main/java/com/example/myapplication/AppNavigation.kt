package com.example.myapplication

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.myapplication.di.NavGraphs
import com.example.test_module.navigation.RegistrationNavigator
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.navigation.dependency

@ExperimentalAnimationApi
@Composable
fun AppNavigation(
    navController: NavHostController,
    registrationNavigator: RegistrationNavigator
) {
    DestinationsNavHost(
        modifier = Modifier,
        navController = navController,
        navGraph = NavGraphs.root,
        dependenciesContainerBuilder = {
            dependency(registrationNavigator)
        }
    )
}