package com.dotescapesoftwarelab.kendrobindu.ui.screens.home_screen.components

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dotescapesoftwarelab.kendrobindu.R

@Composable
fun HomeScreenJumboOptionsSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp, start = 8.dp, end = 8.dp),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            HomeScreenOptionBox(
                icon = R.drawable.ic_routine,
                title = "Class Routine",
                onClick = {  }
            )
            HomeScreenOptionBox(
                icon = R.drawable.ic_notice,
                title = "Notice Board",
                onClick = {  }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            HomeScreenOptionBox(
                icon = R.drawable.ic_teachers,
                title = "Teachers",
                onClick = {  }
            )
            HomeScreenOptionBox(
                icon = R.drawable.ic_students,
                title = "Students",
                onClick = {  }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            HomeScreenOptionBox(
                icon = R.drawable.ic_skype,
                title = "Skype Group",
                onClick = {  }
            )
            HomeScreenOptionBox(
                icon = R.drawable.ic_facebook_group,
                title = "Facebook Group",
                onClick = {  }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            HomeScreenOptionBox(
                icon = R.drawable.ic_contact,
                title = "Contact Information",
                onClick = {  }
            )
            HomeScreenOptionBox(
                icon = R.drawable.ic_my_account,
                title = "My Profile",
                onClick = {  }
            )
        }
    }
}