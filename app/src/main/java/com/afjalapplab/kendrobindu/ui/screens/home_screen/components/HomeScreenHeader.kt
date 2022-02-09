package com.afjalapplab.kendrobindu.ui.screens.home_screen.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.afjalapplab.kendrobindu.R

@Composable
fun HomeScreenHeader() {
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ){
        val logo = painterResource(id = R.drawable.ic_kendro_bindu_logo)
        Image(
            painter = logo,
            contentDescription = "KendroBindu logo",
            modifier = Modifier
                .size(56.dp)
                .clip(CircleShape)
        )
        Spacer(
            Modifier.width(8.dp)
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "কেন্দ্রবিন্দু একাডেমিক কেয়ার",
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
                )
            )
            Text(
                text = "অপার সম্ভাবনার ব্রাহ্মণবাড়িয়া গড়তে",
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    color = Color.White,
                    fontWeight = FontWeight.Medium,
                    fontSize = 14.sp

                )
            )
        }
    }
}