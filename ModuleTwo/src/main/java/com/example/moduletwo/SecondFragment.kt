package com.example.moduletwo

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.moduleone.destinations.FirstFragmentDestination
import com.example.moduletwo.destinations.SecondFragmentDestination
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Destination
@Composable
fun SecondFragment(
    navigator: DestinationsNavigator,
) {
    Button(
        onClick = { navigator.navigate(FirstFragmentDestination) }) {
        Text("Go to Mishos Fragment")
    }
}
