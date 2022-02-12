package com.afjalapplab.kendrobindu.ui.screens.sign_up_screen

sealed class SignUpScreenEvents {
    data class OnNameChanged(val name: String): SignUpScreenEvents()
}