package com.org.onlinegrocery.ui.features

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.org.onlinegrocery.ui.navigation.Screen

@Composable
fun OnboardingScreen(modifier: Modifier = Modifier, navController: NavController) {
    Box(modifier = modifier.fillMaxSize()) {
        Text(text = "Onboarding Screen", modifier = Modifier
            .align(Alignment.Center)
            .clickable {
                navController.navigate(Screen.Login.route)
            })
    }
}