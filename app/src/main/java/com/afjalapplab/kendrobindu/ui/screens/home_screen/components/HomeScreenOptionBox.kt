package com.afjalapplab.kendrobindu.ui.screens.home_screen.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.math.roundToInt

@Composable
fun RowScope.HomeScreenOptionBox(
    @DrawableRes icon: Int,
    title: String,
    onClick: () -> Unit
) {

    var cardSize by remember{ mutableStateOf(IntSize.Zero) }

    Card(
        modifier = Modifier
            .aspectRatio(1F)
            .weight(1F)
            .clip(RoundedCornerShape(8.dp))
            .clickable { onClick() }
            .onSizeChanged { cardSize = it },
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            val itemIcon = painterResource(id = icon)
            Image(
                painter = itemIcon,
                contentDescription = title,
                modifier = Modifier
                    .size(with(LocalDensity.current){
                        (cardSize.height / 2.25).roundToInt().toDp()
                    })
            )
            Spacer(Modifier.height(8.dp))
            Text(
                text = title,
                style = TextStyle(
                    textAlign = TextAlign.Center,
                    color = Color.Black,
                    fontWeight = FontWeight.Medium,
                    fontSize = 18.sp
                ),
                modifier = Modifier
                    .padding(horizontal = 8.dp)
            )
        }
    }
}