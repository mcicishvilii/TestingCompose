package com.example.myapplication.di.nav_graphs

import com.example.test_module.screens.destinations.TestScreenDestination
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec

object RegistrationNavGraphs {
    //screens
    val register = object : NavGraphSpec {
        override val route = "test"
        override val startRoute = TestScreenDestination
        override val destinationsByRoute =
            listOf<DestinationSpec<*>>(TestScreenDestination)
                .associateBy { it.route }
    }

    val login = object : NavGraphSpec {
        override val route = "test"
        override val startRoute = TestScreenDestination
        override val destinationsByRoute =
            listOf<DestinationSpec<*>>(TestScreenDestination)
                .associateBy { it.route }
    }

    // navgraphs

    val root = object : NavGraphSpec {
        override val route = "root"
        override val startRoute = register
        override val destinationsByRoute = emptyMap<String, DestinationSpec<*>>()
        override val nestedNavGraphs = listOf(register, login)
    }
}