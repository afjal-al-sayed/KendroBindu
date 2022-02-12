package com.afjalapplab.kendrobindu.ui.screens.sign_up_screen.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.afjalapplab.kendrobindu.ui.screens.sign_in_screen.SignInScreenEvents

@Composable
fun SignUpInputField(
    value: String,
    onValueChange: (String) -> Unit,
    title: String,
    cornerRoundNess: Dp,
    isEnabled: Boolean,
    isPassword: Boolean = false,
    isLastItem: Boolean = false,
    focusManager: FocusManager,
    keyboardType: KeyboardType = KeyboardType.Text
) {

    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = title) },
        singleLine = true,
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = if(isLastItem) ImeAction.Done else ImeAction.Next
        ),
        keyboardActions = KeyboardActions(
            onNext = { focusManager.moveFocus(FocusDirection.Down) },
            onDone = { focusManager.clearFocus() }
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 24.dp),
        shape = RoundedCornerShape(cornerRoundNess),
        enabled = isEnabled,
        visualTransformation = if(isPassword) PasswordVisualTransformation() else VisualTransformation.None,
    )

}