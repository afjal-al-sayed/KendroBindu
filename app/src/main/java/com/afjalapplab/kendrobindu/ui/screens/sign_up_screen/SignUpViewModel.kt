package com.afjalapplab.kendrobindu.ui.screens.sign_up_screen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class SignUpViewModel: ViewModel() {

    var name by mutableStateOf("Sayed")
        private set

    fun onEvent(event: SignUpScreenEvents){
        when(event){
            is SignUpScreenEvents.OnNameChanged -> { name = event.name }
        }
    }

}