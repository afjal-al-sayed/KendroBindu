package com.dotescapesoftwarelab.kendrobindu.ui.screens.sign_in_screen.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyItemScope
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dotescapesoftwarelab.kendrobindu.ui.screens.home_screen.components.HomeScreenHeader

@Composable
fun SignInScreenHeader() {
    HomeScreenHeader()
    Spacer(Modifier.height(12.dp))
    Text(
        text = "Welcome!",
        style = TextStyle(
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        )
    )
    Text(
        text = "Sign in to continue",
        style = TextStyle(
            color = Color.White,
            fontWeight = FontWeight.Normal,
            fontSize = 20.sp
        )
    )
}