package com.example.myapplication

import com.example.navigation.destinations.NavigationScreenDestination
import com.example.test_module.destinations.TestScreenDestination
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec

object NavGraphs {

    val test = object : NavGraphSpec {
        override val route = "test"
        override val startRoute = TestScreenDestination
        override val destinationsByRoute =
            listOf<DestinationSpec<*>>(TestScreenDestination)
                .associateBy { it.route }
    }

    val navigation = object : NavGraphSpec {
        override val route = "navigation"
        override val startRoute = NavigationScreenDestination
        override val destinationsByRoute =
            listOf<DestinationSpec<*>>(NavigationScreenDestination)
                .associateBy { it.route }
    }

    val root = object : NavGraphSpec {
        override val route = "root"
        override val startRoute = navigation
        override val destinationsByRoute = emptyMap<String, DestinationSpec<*>>()
        override val nestedNavGraphs = listOf(test, navigation)
    }
}