package com.example.test_module.screens.insta

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test_module.R

@Composable
fun MainContent() {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        content = {
            items(mainContentData) { data ->
                Box(
                ) {
                    Image(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Blue)
                            .scale(1.8f),
                        painter = painterResource(id = data.userAvatar),
                        contentDescription = data.userName,
                        contentScale = ContentScale.FillWidth,
                    )
                    Row(
                        modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Image(
                            modifier = Modifier
                                .size(60.dp)
                                .clip(RoundedCornerShape(100.dp))
                                .background(Color.Transparent),
                            painter = painterResource(
                                id = data.userAvatar
                            ),
                            contentDescription = data.userName
                        )
                        Column {
                            Row {
                                Text(
                                    modifier = Modifier.padding(
                                        vertical = 5.dp,
                                        horizontal = 10.dp
                                    ),
                                    text = data.userName,
                                    fontSize = 15.sp,
                                    color = Color.White,
                                    fontWeight = FontWeight.W900
                                )
                                if(data.isVerified){
                                    Icon(
                                        tint = Color.White,
                                        painter = painterResource(id = R.drawable.baseline_verified_24),
                                        contentDescription = "verified"
                                    )
                                }
                            }

                            Text(
                                modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp),
                                text = "${data.soundName} * ${data.soundAuthor}",
                                fontSize = 15.sp,
                                color = Color.White,
                                fontWeight = FontWeight.W900
                            )
                        }
                    }
                }
            }
        })
}


data class MainContentData(
    val id: Int,
    val userName: String,
    val soundName: String,
    val soundAuthor: String,
    val isVerified: Boolean,
    val isFavorite: Boolean,
    val likes: Int,
    val postTitle: String,
    val postDescription: String,
    val postImage: Int,
    val userAvatar: Int,
    val totalComments: Int,
    val timePosted: String
)

val mainContentData = mutableListOf(
    MainContentData(
        0,
        "kotlin",
        "kotlin",
        "kotlin",
        true,
        true,
        0,
        "kotlin",
        "kotlin",
        R.drawable.screenshot_2023_11_28_132036,
        R.drawable.screenshot_2023_11_28_132036,
        0,
        "kotlin"
    ),
    MainContentData(
        1,
        "kotlin",
        "kotlin",
        "kotlin",
        true,
        true,
        0,
        "kotlin",
        "kotlin",
        R.drawable.screenshot_2023_11_28_132036,
        R.drawable.screenshot_2023_11_28_132036,
        0,
        "kotlin"
    ),
    MainContentData(
        2,
        "kotlin",
        "kotlin",
        "kotlin",
        true,
        true,
        0,
        "kotlin",
        "kotlin",
        R.drawable.screenshot_2023_11_28_132036,
        R.drawable.screenshot_2023_11_28_132036,
        0,
        "kotlin"
    ),
    MainContentData(
        3,
        "kotlin",
        "kotlin",
        "kotlin",
        true,
        true,
        0,
        "kotlin",
        "kotlin",
        R.drawable.screenshot_2023_11_28_132036,
        R.drawable.screenshot_2023_11_28_132036,
        0,
        "kotlin"
    ),
    MainContentData(
        4,
        "kotlin",
        "kotlin",
        "kotlin",
        true,
        true,
        0,
        "kotlin",
        "kotlin",
        R.drawable.screenshot_2023_11_28_132036,
        R.drawable.screenshot_2023_11_28_132036,
        0,
        "kotlin"
    ),
    MainContentData(
        5,
        "kotlin",
        "kotlin",
        "kotlin",
        true,
        true,
        0,
        "kotlin",
        "kotlin",
        R.drawable.screenshot_2023_11_28_132036,
        R.drawable.screenshot_2023_11_28_132036,
        0,
        "kotlin"
    ),
    MainContentData(
        6,
        "kotlin",
        "kotlin",
        "kotlin",
        true,
        true,
        0,
        "kotlin",
        "kotlin",
        R.drawable.screenshot_2023_11_28_132036,
        R.drawable.screenshot_2023_11_28_132036,
        0,
        "kotlin"
    ),
)