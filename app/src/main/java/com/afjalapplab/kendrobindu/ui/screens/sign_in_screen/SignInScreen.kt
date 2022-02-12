package com.afjalapplab.kendrobindu.ui.screens.sign_in_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.afjalapplab.kendrobindu.R
import com.afjalapplab.kendrobindu.ui.screens.sign_in_screen.components.SignInScreenHeader
import com.afjalapplab.kendrobindu.ui.screens.sign_in_screen.components.SignInSection

@Composable
fun SignInScreen(
    viewModel: SignInViewModel = hiltViewModel()
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        val background = painterResource(id = R.drawable.ic_sign_in_background)
        Image(
            painter = background,
            contentDescription = "background image",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.Crop,
            alignment = Alignment.TopCenter
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            contentPadding = PaddingValues(horizontal = 24.dp, vertical = 16.dp)
        ){
            item{
                SignInScreenHeader()
                Spacer(modifier = Modifier.height(96.dp))
                SignInSection(viewModel = viewModel)
                Spacer(modifier = Modifier.height(72.dp))
            }
        }
    }
}