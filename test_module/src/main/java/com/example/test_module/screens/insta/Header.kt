package com.example.test_module.screens.insta

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_module.R

@Composable
fun Header() {
    Row(
        modifier = Modifier
            .padding(10.dp)
            .padding(10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            fontSize = 20.sp,
            text = "instagram"
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.baseline_favorite_border_24),
                contentDescription = "favorite icon",
            )
            Image(
                painter = painterResource(id = R.drawable.baseline_chat_24),
                contentDescription = "favorite icon",
            )

        }
    }
}

@Preview
@Composable
fun HeaderPreview() {
    Column(Modifier.background(Color.White)) {
        Header()
    }
}