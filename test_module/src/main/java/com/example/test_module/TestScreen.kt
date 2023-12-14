package com.example.test_module

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
@Destination
@Composable
internal fun TestScreen() {
    Text(text = "Second Screen")
}