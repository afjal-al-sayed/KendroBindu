package com.afjalapplab.kendrobindu.ui.screens.sign_up_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.afjalapplab.kendrobindu.ui.screens.sign_up_screen.components.SignUpFormTitle
import com.afjalapplab.kendrobindu.ui.screens.sign_up_screen.components.SignUpInputField
import com.afjalapplab.kendrobindu.ui.screens.sign_up_screen.components.SignUpScreenHeader

@Composable
fun SignUpScreen(
    viewModel: SignUpViewModel = hiltViewModel()
) {

    val focusManager = LocalFocusManager.current
    val cornerRoundedNess = 8.dp
    val fieldState = true

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background),

    ){
        item{
            SignUpScreenHeader()
        }
        item{
            SignUpFormTitle(title = "Student's Information")
            SignUpInputField(
                value = viewModel.name,
                onValueChange = { viewModel.onEvent(SignUpScreenEvents.OnNameChanged(it)) },
                title = "Full name",
                cornerRoundNess = cornerRoundedNess,
                isEnabled = fieldState,
                focusManager = focusManager
            )
        }
    }
}