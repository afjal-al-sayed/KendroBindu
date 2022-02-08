package com.dotescapesoftwarelab.kendrobindu.ui.screens.home_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dotescapesoftwarelab.kendrobindu.R

@Composable
fun HomeScreenUserSection() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .size(84.dp)
                .clip(CircleShape)
                .background(Color.White)
        ){
            val userImage = painterResource(id = R.drawable.ic_demo_profile_pic)
            Image(
                painter = userImage,
                contentDescription = "User image",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp)
                    .clip(CircleShape),
                contentScale = ContentScale.Crop
            )
        }
        Spacer(Modifier.width(12.dp))
        Column(

        ){
            Text(
                text = "Amit Modak",
                style = TextStyle(
                    color = Color.White,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                )
            )
            Text(
                text = "HSC 2nd year",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp
                )
            )
            Text(
                text = "Batch: Borno",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 16.sp
                )
            )
        }
        Spacer(Modifier.weight(1F))
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Icon(
                Icons.Default.Settings,
                contentDescription = "Edit profile",
                tint = Color.White
            )
        }
    }
}