package com.example.navigation

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class NavigationViewModel:ViewModel() {

    private val _sampleState = MutableStateFlow("")
    val sampleState = _sampleState.asStateFlow()

    fun setSampleState(state:String){
        _sampleState.value = state
    }
}