package com.dotescapesoftwarelab.kendrobindu.ui.screens.home_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.dotescapesoftwarelab.kendrobindu.R
import com.dotescapesoftwarelab.kendrobindu.ui.screens.home_screen.components.HomeScreenHeader
import com.dotescapesoftwarelab.kendrobindu.ui.screens.home_screen.components.HomeScreenJumboOptionsSection
import com.dotescapesoftwarelab.kendrobindu.ui.screens.home_screen.components.HomeScreenUserSection

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()

    ){
        val backgroundImage = painterResource(id = R.drawable.ic_home_background)
        Image(
            painter = backgroundImage,
            contentDescription = "background",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter
        )
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            modifier = Modifier
                .fillMaxSize()
        ){
            item{
                HomeScreenHeader()
                Spacer(Modifier.height(16.dp))
                HomeScreenUserSection()
                Spacer(Modifier.height(24.dp))
                HomeScreenJumboOptionsSection()
            }
        }
    }
}