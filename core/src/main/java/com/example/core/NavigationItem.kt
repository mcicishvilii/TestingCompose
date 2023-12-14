package com.example.core

sealed class NavigationItem(val route: String) {
    object TestModule : NavigationItem("test")
    object NavigationModule : NavigationItem("navigation")
    object First : NavigationItem("first")
    object Second : NavigationItem("second")
}