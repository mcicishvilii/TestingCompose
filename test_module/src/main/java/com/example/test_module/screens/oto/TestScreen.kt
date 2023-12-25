package com.example.test_module.screens.oto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun TestScreen(selectedIcon: Int) {
    val iconSize = 80.dp
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            DotIcon(selected = selectedIcon >= 0)
            DotSpacer(iconSize = iconSize)
            DotIcon(selected = selectedIcon >= 1)
            DotSpacer(iconSize = iconSize)
            DotIcon(selected = selectedIcon >= 2)
        }
    }
}

@Composable
fun DotSpacer(iconSize: Dp) {
    Spacer(
        modifier = Modifier
            .size(iconSize)
            .drawWithContent {
                drawContent()
                val dotRadius = 2.dp.toPx()
                val dotDiameter = dotRadius * 2
                val dotCount = size.width / dotDiameter
                for (i in 0 until dotCount.toInt()) {
                    drawCircle(
                        color = Color.Gray,
                        radius = dotRadius,
                        center = Offset(x = i * dotDiameter + dotRadius, y = size.height / 2)
                    )
                }
            }
    )
}

@Composable
fun DotIcon(selected: Boolean) {
    Icon(
        imageVector = Icons.Default.AccountCircle,
        contentDescription = null,
        tint = if (selected) Color.Blue else Color.Gray,
        modifier = Modifier
            .size(70.dp)
    )
}
