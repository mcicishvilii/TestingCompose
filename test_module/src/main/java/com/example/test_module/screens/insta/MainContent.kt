package com.example.test_module.screens.insta

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.spacedBy
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
                Column {
                    Box {
                        Image(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Blue),
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
                                    .clip(RoundedCornerShape(100.dp)),
                                painter = painterResource(
                                    id = data.userAvatar
                                ),
                                contentDescription = data.userName
                            )
                            Column {
                                Row(
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
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
                                    if (data.isVerified) {
                                        Icon(
                                            modifier = Modifier.size(20.dp),
                                            tint = Color.White,
                                            painter = painterResource(id = R.drawable.baseline_verified_24),
                                            contentDescription = "verified"
                                        )
                                    }
                                }

                                Text(
                                    modifier = Modifier.padding(
                                        vertical = 5.dp,
                                        horizontal = 10.dp
                                    ),
                                    text = "${data.soundName} * ${data.soundAuthor}",
                                    fontSize = 15.sp,
                                    color = Color.White,
                                    fontWeight = FontWeight.W900
                                )
                            }
                        }
                    }
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Row(
                            horizontalArrangement = spacedBy(15.dp)
                        ) {
                            Icon(
                                painter = painterResource(
                                    id = R.drawable.baseline_favorite_border_24
                                ),
                                contentDescription = "favorite",
                            )
                            Icon(
                                painter = painterResource(
                                    id = R.drawable.baseline_comment_24
                                ),
                                contentDescription = "favorite",
                            )

                            Icon(
                                painter = painterResource(
                                    id = R.drawable.baseline_send_24
                                ),
                                contentDescription = "favorite",
                            )
                        }
                        Icon(
                            painter = painterResource(
                                id = R.drawable.baseline_bookmark_border_24
                            ),
                            contentDescription = "favorite",
                        )
                    }
                    Text(
                        text = "${data.likes} likes",
                        modifier = Modifier.padding(horizontal = 10.dp)
                    )
                    Row {
                        Text(
                            modifier = Modifier.padding(start = 10.dp),
                            fontWeight = FontWeight.W900,
                            text = data.userName,
                        )
                        Text(
                            modifier = Modifier.padding(horizontal = 5.dp),
                            text = data.postTitle,
                        )
                    }
                    Text(text = "view all ${data.totalComments} comments", modifier = Modifier.padding(horizontal = 10.dp))
                    Text(text = data.timePosted, modifier = Modifier.padding(horizontal = 10.dp))
                    Spacer(modifier = Modifier.height(20.dp))
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
        "john_doe",
        "Awesome Music",
        "John Doe",
        true,
        true,
        5432,
        "Enjoying the moment",
        "Just recorded a new track, what do you think?",
        R.drawable.girl,
        R.drawable.girl,
        21,
        "2 hours ago"
    ),
    MainContentData(
        1,
        "music_lover",
        "Guitar Serenade",
        "Music Lover",
        true,
        true,
        8721,
        "Chilling with my guitar",
        "Feeling the vibes with my favorite guitar melody.",
        R.drawable.girl,
        R.drawable.girl,
        15,
        "1 hour ago"
    ),
    MainContentData(
        2,
        "piano_master",
        "Piano Sonata",
        "Piano Master",
        true,
        true,
        12456,
        "Exploring new piano compositions",
        "Trying out a classical piano piece today. What's your favorite?",
        R.drawable.girl,
        R.drawable.girl,
        30,
        "3 hours ago"
    ),
    MainContentData(
        3,
        "beats_creator",
        "Beats for Days",
        "Beats Creator",
        true,
        true,
        3345,
        "Cooking up some fresh beats",
        "In the studio creating new beats. Can't wait to share them!",
        R.drawable.girl,
        R.drawable.girl,
        45,
        "4 hours ago"
    ),
    MainContentData(
        4,
        "podcast_host",
        "Podcast Talks",
        "Podcast Host",
        true,
        true,
        132,
        "Latest episode out now!",
        "Discussing the latest trends and music news in the new episode.",
        R.drawable.girl,
        R.drawable.girl,
        12,
        "5 hours ago"
    ),
    MainContentData(
        5,
        "saxophone_player",
        "Saxophone Vibes",
        "Saxophone Player",
        true,
        true,
        876,
        "Lost in saxophone melodies",
        "Playing my favorite saxophone tunes. What's your favorite instrument?",
        R.drawable.girl,
        R.drawable.girl,
        8,
        "6 hours ago"
    ),
    MainContentData(
        6,
        "drummer_beats",
        "Drumming Grooves",
        "Drummer Beats",
        true,
        true,
        543,
        "Jamming on the drums",
        "Feeling the rhythm today. Who else loves drumming?",
        R.drawable.girl,
        R.drawable.girl,
        23,
        "7 hours ago"
    )
)