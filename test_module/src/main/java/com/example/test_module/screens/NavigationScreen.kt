package com.example.test_module.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.test_module.navigation.RegistrationNavigator
import com.example.test_module.screens.insta.Header
import com.example.test_module.screens.insta.MainContent
import com.example.test_module.screens.insta.ProfileBubbles
import com.example.test_module.screens.oto.TestScreen
import com.example.test_module.vm.RegistrationViewModel
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
internal fun NavigationScreen(
    navigator: RegistrationNavigator,
) {
    val myViewModel: RegistrationViewModel = hiltViewModel()
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Header()
//        TestScreen()
        ProfileBubbles()
        MainContent()
//        BottomBar()
    }
}


