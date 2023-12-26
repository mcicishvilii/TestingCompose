package com.example.myapplication.navigation

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.myapplication.di.nav_graphs.RegistrationNavGraphs
import com.example.test_module.navigation.MainNavigator
import com.example.test_module.vm.RegistrationViewModel
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.navigation.dependency

@ExperimentalAnimationApi
@Composable
fun RegistrationNavigation(
    navController: NavHostController,
    mainNavigator: MainNavigator
) {
    val myViewModel: RegistrationViewModel = hiltViewModel()
    DestinationsNavHost(
        modifier = Modifier,
        navController = navController,
        navGraph = RegistrationNavGraphs.root,
        dependenciesContainerBuilder = {
            dependency(mainNavigator)
        }
    )
}
