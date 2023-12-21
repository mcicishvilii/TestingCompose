package com.example.myapplication.di

import com.example.login_module.ui.destinations.LoginScreenOneDestination
import com.example.test_module.screens.destinations.NavigationScreenDestination
import com.example.test_module.screens.destinations.TestScreenDestination
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec

object NavGraphs {
    //screens
    val testScreen = object : NavGraphSpec {
        override val route = "test"
        override val startRoute = TestScreenDestination
        override val destinationsByRoute =
            listOf<DestinationSpec<*>>(TestScreenDestination)
                .associateBy { it.route }
    }

    val navigationScreen = object : NavGraphSpec {
        override val route = "navigation"
        override val startRoute = NavigationScreenDestination
        override val destinationsByRoute =
            listOf<DestinationSpec<*>>(NavigationScreenDestination)
                .associateBy { it.route }
    }

    val loginScreen = object : NavGraphSpec {
        override val route = "login_one"
        override val startRoute = LoginScreenOneDestination
        override val destinationsByRoute =
            listOf<DestinationSpec<*>>(LoginScreenOneDestination)
                .associateBy { it.route }
    }
    // navgraphs

    val root = object : NavGraphSpec {
        override val route = "root"
        override val startRoute = navigationScreen
        override val destinationsByRoute = emptyMap<String, DestinationSpec<*>>()
        override val nestedNavGraphs = listOf(testScreen, navigationScreen, loginScreen)
    }
}