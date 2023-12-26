package com.example.myapplication.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.test_module.navigation.RegistrationNavigator
import com.example.test_module.screens.insta.Header
import com.example.test_module.screens.insta.MainContent
import com.example.test_module.screens.insta.ProfileBubbles
import com.example.test_module.screens.oto.TestScreen
import com.example.test_module.vm.RegistrationViewModel
import com.ramcosta.composedestinations.annotation.Destination

@Composable
internal fun NavigationScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        var selectedIcon by remember { mutableStateOf(0) }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            TestScreen(selectedIcon = selectedIcon, 60.dp)
        }
        Button(onClick = { if (selectedIcon < 2) selectedIcon++ }) {
            Text("Next")
        }
    }
}


