package com.dotescapesoftwarelab.kendrobindu.ui.screens.sign_in_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignInViewModel: ViewModel() {

    var email by mutableStateOf("test@gmail.com")
        private set
    var password by mutableStateOf("123456")
        private set

    fun onEvent(event: SignInScreenEvents){
        when(event){
            is SignInScreenEvents.OnEmailChanged -> { email = event.email }
            is SignInScreenEvents.OnPasswordChanged -> { password = event.password }
            is SignInScreenEvents.OnSignInButtonPressed -> {

            }
            is SignInScreenEvents.OnRegisterButtonPressed -> {

            }
        }
    }

}