package com.example.myapplication

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.navigation.dependency

@ExperimentalAnimationApi
@Composable
internal fun AppNavigation(
    navController: NavHostController,
) {
    DestinationsNavHost(
        modifier = Modifier,
        navController = navController,
        navGraph = NavGraphs.root,
        dependenciesContainerBuilder = {
            dependency(currentNavigator())
        }
    )
}