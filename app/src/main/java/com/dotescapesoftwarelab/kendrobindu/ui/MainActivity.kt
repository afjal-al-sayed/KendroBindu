package com.dotescapesoftwarelab.kendrobindu.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dotescapesoftwarelab.kendrobindu.ui.screens.home_screen.HomeScreen
import com.dotescapesoftwarelab.kendrobindu.ui.screens.sign_in_screen.SignInScreen
import com.dotescapesoftwarelab.kendrobindu.ui.theme.KendroBinduTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KendroBinduTheme {
                Surface(color = MaterialTheme.colors.background) {
                    SignInScreen()
                }
            }
        }
    }
}
