package com.afjalapplab.kendrobindu.ui.screens.sign_in_screen.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.afjalapplab.kendrobindu.R
import com.afjalapplab.kendrobindu.ui.components.AdditionalSignInUpButtonSection
import com.afjalapplab.kendrobindu.ui.components.SignInUpButton
import com.afjalapplab.kendrobindu.ui.screens.sign_in_screen.SignInScreenEvents
import com.afjalapplab.kendrobindu.ui.screens.sign_in_screen.SignInViewModel

@Composable
fun SignInSection(
    viewModel: SignInViewModel
) {

    val focusManager = LocalFocusManager.current
    val cornerRoundedNess = 8.dp
    val fieldState = true

    val visibilityIcon = painterResource(id = R.drawable.ic_visibility_24)
    val visibilityOffIcon = painterResource(id = R.drawable.ic_visibility_off_24)

    OutlinedTextField(
        value = viewModel.email,
        onValueChange = { viewModel.onEvent(SignInScreenEvents.OnEmailChanged(it)) },
        label = { Text(text = "E-mail") },
        leadingIcon = { Icon(Icons.Default.Email, "E-mail icon") },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Next
        ),
        keyboardActions = KeyboardActions(
            onNext = { focusManager.moveFocus(FocusDirection.Down) }
        ),
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(cornerRoundedNess),
        enabled = fieldState
    )

    Spacer(Modifier.height(16.dp))

    OutlinedTextField(
        value = viewModel.password,
        onValueChange = { viewModel.onEvent(SignInScreenEvents.OnPasswordChanged(it)) },
        label = { Text(text = "Password") },
        leadingIcon = { Icon(Icons.Default.Lock, "Lock icon") },
        trailingIcon = {
            IconButton(onClick = { viewModel.onEvent(SignInScreenEvents.OnPasswordVisibilityToggle) }) {
                Icon(
                    painter = if (viewModel.isPasswordVisible) visibilityOffIcon else visibilityIcon,
                    contentDescription = "toggle password visibility"
                )
            }
        },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Password,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(
            onDone = { focusManager.clearFocus() }
        ),
        modifier = Modifier
            .fillMaxWidth(),
        shape = RoundedCornerShape(cornerRoundedNess),
        visualTransformation = if(viewModel.isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        enabled = fieldState
    )

    Spacer(Modifier.height(16.dp))

    SignInUpButton(
        normalText = "Sign in",
        loadingText = "Signing in",
        isEnabled = fieldState,
        isLoading = false,
        onClick = { /*TODO*/ },
        cornerRoundness = cornerRoundedNess
    )

    Spacer(Modifier.height(4.dp))

    AdditionalSignInUpButtonSection(
        message = "New student?",
        buttonText = "Register here!",
        onClick = { /*TODO*/ },
        isEnabled = fieldState
    )
}