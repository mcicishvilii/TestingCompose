package com.example.myapplication

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay

@Composable
fun MainScreen(
    modifier: Modifier = Modifier
) {

    var currentStep by rememberSaveable { mutableStateOf(0) }

    LaunchedEffect(key1 = currentStep) {
        delay(2000L)
        currentStep++
    }

    Column(
        modifier
            .fillMaxSize()
            .padding(horizontal = 36.dp, vertical = 16.dp)
    ) {
        LazyColumn(
            modifier
                .fillMaxSize()
        ) {
            items(steps) { step ->
                val circleBackground by animateColorAsState(
                    targetValue = if (step.stepNumber <= currentStep) Color.Blue else Color.Transparent,
                    animationSpec = tween(durationMillis = 500, easing = LinearOutSlowInEasing)
                )

                val textNumberBackground by animateColorAsState(
                    targetValue = if (step.stepNumber <= currentStep) Color.White else Color.LightGray,
                    animationSpec = tween(durationMillis = 500, easing = LinearOutSlowInEasing)
                )

                val textBackground by animateColorAsState(
                    targetValue = if (step.stepNumber <= currentStep) Color.Blue else Color.LightGray,
                    animationSpec = tween(durationMillis = 500, easing = LinearOutSlowInEasing)
                )

                val borderColor by animateColorAsState(
                    targetValue = if (step.stepNumber <= currentStep) Color.Blue else Color.LightGray,
                    animationSpec = tween(durationMillis = 500, easing = LinearOutSlowInEasing)
                )

                Row(
                    modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.Start,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier
                                .size(64.dp)
                                .padding(4.dp)
                                .background(circleBackground, shape = CircleShape)
                                .border(
                                    width = 1.dp,
                                    color = borderColor,
                                    shape = CircleShape
                                ),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                modifier = modifier
                                    .padding(4.dp),
                                text = step.stepNumber.toString(),
                                color = textNumberBackground,
                            )
                        }
                        if (step.stepNumber != 4) {
                            Divider(
                                modifier
                                    .size(width = 1.dp, height = 32.dp)
                                    .background(textBackground)
                            )
                        }
                    }
                    Box(
                        modifier.align(Alignment.Top)
                    ) {
                        Text(
                            modifier = modifier
                                .padding(16.dp),
                            text = step.stepText,
                            color = textBackground
                        )
                    }
                }
            }
        }
    }
}

data class Steps(
    val stepNumber: Int,
    val stepText: String,
    val checked: Boolean
)

val steps = listOf(
    Steps(1, "Register your hospital", false),
    Steps(2, "Register yourself as a head doctor", false),
    Steps(3, "Choose a subscription", false),
    Steps(4, "Start using our service", false)
)