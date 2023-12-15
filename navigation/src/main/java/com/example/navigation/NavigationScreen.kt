package com.example.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.ramcosta.composedestinations.annotation.Destination

@OptIn(ExperimentalMaterial3Api::class)
@Destination
@Composable
internal fun NavigationScreen(
    navigator: HomeScreenNavigator,
) {
    val myViewModel: NavigationViewModel = hiltViewModel()
    var textFieldValue by rememberSaveable { mutableStateOf("") }
    val sampleState by myViewModel.sampleState.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            value = textFieldValue,
            onValueChange = { textFieldValue = it },
            label = { Text("Enter text") }
        )
        Button(
            modifier = Modifier.padding(20.dp),
            onClick = {
                myViewModel.setSampleState(textFieldValue)
            }) {
            Text(text = "Submit")
        }
        Text(
            modifier = Modifier.padding(20.dp),
            text = "Current state is $sampleState"
        )
    }
}

interface HomeScreenNavigator {
    fun navigateToTest()
}