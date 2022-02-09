package com.afjalapplab.kendrobindu.ui.screens.sign_in_screen

sealed class SignInScreenEvents{
    data class OnEmailChanged(val email: String): SignInScreenEvents()
    data class OnPasswordChanged(val password: String): SignInScreenEvents()
    object OnSignInButtonPressed: SignInScreenEvents()
    object OnRegisterButtonPressed: SignInScreenEvents()
    object OnPasswordVisibilityToggle: SignInScreenEvents()
}
