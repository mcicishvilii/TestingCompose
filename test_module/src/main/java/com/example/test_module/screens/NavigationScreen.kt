package com.example.test_module.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.test_module.R
import com.example.test_module.navigation.RegistrationNavigator
import com.example.test_module.screens.insta.Header
import com.example.test_module.screens.insta.MainContent
import com.example.test_module.screens.insta.ProfileBubbles
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
        // instagram logo, favorites and messages
        Header()
        ProfileBubbles()
        MainContent()
//        BottomBar()
    }
}


