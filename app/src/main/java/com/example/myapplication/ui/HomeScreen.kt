package com.example.myapplication.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

//@RootNavGraph(start = true)
@Destination
@Composable
fun MainScreen(
    navigator: HomeScreenNavigator
) {
    Button(onClick = {
        navigator.navigateToTest()
    }) {
        Text(text = "Main Screen")
    }
}

interface HomeScreenNavigator {
    fun navigateToTest()
}