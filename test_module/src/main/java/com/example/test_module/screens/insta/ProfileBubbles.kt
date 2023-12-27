package com.example.test_module.screens.insta

import android.graphics.PorterDuff
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_module.R

@Composable
fun ProfileBubbles() {
    LazyRow {
        itemsIndexed(profiles) { index, profile ->
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (index == 0) {
                    Box {
                        Image(
                            modifier = Modifier
                                .size(80.dp)
                                .padding(10.dp)
                                .clip(RoundedCornerShape(100.dp))
                                .background(Color.Blue),
                            painter = painterResource(profile.image),
                            contentDescription = profile.userName
                        )
                        Image(
                            modifier = Modifier
                                .size(40.dp)
                                .align(Alignment.BottomEnd)
                                .padding(10.dp)
                                .background(Color.Transparent),
                            painter = painterResource(R.drawable.baseline_add_circle_24),
                            contentDescription = "add story",
                            colorFilter = ColorFilter.tint(Color.White)
                        )
                    }
                } else {
                    Image(
                        modifier = Modifier
                            .size(80.dp)
                            .padding(10.dp)
                            .clip(RoundedCornerShape(100.dp))
                            .background(Color.Blue),
                        painter = painterResource(profile.image),
                        contentDescription = profile.userName
                    )
                }

                Text(
                    text = if (index == 0) {
                        "Your Story"
                    } else {
                        profile.userName
                    },
                    fontSize = 15.sp
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }
    }
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
    Profiles(1, "user1", R.drawable.girl),
    Profiles(2, "user2", R.drawable.girl),
    Profiles(3, "user3", R.drawable.girl),
    Profiles(4, "user4", R.drawable.girl),
    Profiles(5, "user5", R.drawable.girl),
    Profiles(6, "user6", R.drawable.girl),
    Profiles(7, "user7", R.drawable.girl),
    Profiles(8, "user8", R.drawable.girl),
    Profiles(9, "user9", R.drawable.girl),
    Profiles(10, "user10", R.drawable.girl),
)