package com.afjalapplab.kendrobindu.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.afjalapplab.kendrobindu.ui.screens.sign_in_screen.SignInScreen
import com.afjalapplab.kendrobindu.ui.screens.sign_up_screen.SignUpScreen
import com.afjalapplab.kendrobindu.ui.theme.KendroBinduTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KendroBinduTheme {
                Surface(color = MaterialTheme.colors.background) {
                    SignUpScreen()
                }
            }
        }
    }
}
