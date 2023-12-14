package com.example.myapplication

import com.example.myapplication.ui.destinations.MainScreenDestination
import com.example.test_module.destinations.SecondScreenDestination
import com.ramcosta.composedestinations.spec.DestinationSpec
import com.ramcosta.composedestinations.spec.NavGraphSpec

object NavGraphsCustom {

    val test = object : NavGraphSpec {
        override val route = "second_screenasdasd"
        override val startRoute = SecondScreenDestination
        override val destinationsByRoute =
            listOf<DestinationSpec<*>>(SecondScreenDestination)
                .associateBy { it.route }
    }

    val app = object : NavGraphSpec {
        override val route = "main_screen"
        override val startRoute = MainScreenDestination
        override val destinationsByRoute = emptyMap<String, DestinationSpec<*>>()
        override val nestedNavGraphs = listOf(test)
    }
}