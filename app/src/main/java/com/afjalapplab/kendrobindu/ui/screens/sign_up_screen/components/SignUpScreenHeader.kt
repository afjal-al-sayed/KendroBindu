package com.afjalapplab.kendrobindu.ui.screens.sign_up_screen.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.afjalapplab.kendrobindu.R
import com.afjalapplab.kendrobindu.ui.screens.home_screen.components.HomeScreenHeader
import com.afjalapplab.kendrobindu.ui.theme.lightBlue

@Composable
fun SignUpScreenHeader() {

    val cornerRoundNess = 16.dp

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(bottomStart = cornerRoundNess, bottomEnd = cornerRoundNess))
            .background(lightBlue)
            .padding(bottom = 24.dp, top = 16.dp)
    ){
        HomeScreenHeader()

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Register in KendroBindu",
            style = TextStyle(
                color = Color.White,
                fontWeight = FontWeight.Medium,
                fontSize = 22.sp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        )

        Spacer(Modifier.height(8.dp))

        Text(
            text = stringResource(id = R.string.sign_up_screen_header_message),
            style = TextStyle(
                color = Color.White,
                fontWeight = FontWeight.Normal,
                fontSize = 16.sp,
                textAlign = TextAlign.Justify
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
        )
    }
}