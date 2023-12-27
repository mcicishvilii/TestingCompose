package com.example.test_module.screens.oto

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.test_module.R
import com.ramcosta.composedestinations.annotation.Destination

@Destination
@Composable
fun TestScreen(selectedIcon: Int,dotsHeight: Dp) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            DotIcon(selected = selectedIcon >= 0, dotsHeight = dotsHeight, iconType = 1)
            DashSpacer(selected = selectedIcon >= 1, dotsHeight = dotsHeight)
            DashSpacer(selected = selectedIcon >= 1, dotsHeight = dotsHeight)
            DotIcon(selected = selectedIcon >= 1, dotsHeight = dotsHeight, iconType = 2)
            DashSpacer(selected = selectedIcon >= 2, dotsHeight = dotsHeight)
            DashSpacer(selected = selectedIcon >= 2, dotsHeight = dotsHeight)
            DotIcon(selected = selectedIcon >= 2, dotsHeight = dotsHeight, iconType = 3)
        }
    }
}


@Composable
fun DashSpacer(selected: Boolean, dotsHeight: Dp) {
    Spacer(
        modifier = Modifier
            .height(dotsHeight)
            .width(dotsHeight)
            .drawWithContent {
                drawContent()
                val dashLength = 2.5.dp.toPx()
                val spaceLength = 1.dp.toPx()
                val color = if (selected) Color.Blue else Color.Gray
                val totalLength = size.width
                var currentLength = 0f
                while (currentLength < totalLength) {
                    drawLine(
                        color = color,
                        start = Offset(x = currentLength, y = size.height / 2),
                        end = Offset(x = minOf(currentLength + dashLength, totalLength), y = size.height / 2),
                        strokeWidth = 2.dp.toPx()
                    )
                    currentLength += dashLength + spaceLength
                }
            }
    )
}


@Composable
fun DotIcon(selected: Boolean, dotsHeight: Dp, iconType: Int) {
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val imageVector = when(iconType) {
            1 -> R.drawable.first_step
            2 -> R.drawable.second_step
            3 -> R.drawable.third_step
            else -> R.drawable.first_step
        }
        Icon(
            painterResource(id = imageVector),
            contentDescription = null,
            tint = if (selected) Color.Blue else Color.Gray,
            modifier = Modifier
                .size(dotsHeight)
        )
    }
}
