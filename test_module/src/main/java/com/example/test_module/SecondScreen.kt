package com.example.test_module

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph

//@RootNavGraph(start = true)
@Destination
@Composable
fun SecondScreen() {
    Text(text = "Second Screen")
}