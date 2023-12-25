package com.example.test_module.screens.insta

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_module.R

@Composable
fun ProfileBubbles() {
    LazyRow(content = {
        items(profiles) { profile ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .size(130.dp)
                        .padding(10.dp)
                        .clip(RoundedCornerShape(100.dp))
                        .background(Color.Blue),
                    painter = painterResource(profile.image),
                    contentDescription = profile.userName
                )
                Text(
                    text = profile.userName,
                    fontSize = 15.sp
                )
            }
        }
    })
}

@Preview
@Composable
fun ProfileBubblesPreview() {
    Column(
        Modifier.background(Color.White)
    ) {
        ProfileBubbles()
    }
}

data class Profiles(
    val id: Int,
    val userName: String,
    val image: Int
)

val profiles = mutableListOf(
    Profiles(1, "user1", R.drawable.baseline_favorite_border_24),
    Profiles(2, "user2", R.drawable.baseline_favorite_border_24),
    Profiles(3, "user3", R.drawable.baseline_favorite_border_24),
    Profiles(4, "user4", R.drawable.baseline_favorite_border_24),
    Profiles(5, "user5", R.drawable.baseline_favorite_border_24),
    Profiles(6, "user6", R.drawable.baseline_favorite_border_24),
    Profiles(7, "user7", R.drawable.baseline_favorite_border_24),
    Profiles(8, "user8", R.drawable.baseline_favorite_border_24),
    Profiles(9, "user9", R.drawable.baseline_favorite_border_24),
    Profiles(10, "user10", R.drawable.baseline_favorite_border_24),
)