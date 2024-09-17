package com.org.onlinegrocery.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.org.onlinegrocery.ui.features.LoginScreen
import com.org.onlinegrocery.ui.features.OnboardingScreen
import com.org.onlinegrocery.ui.features.RegisterScreen
import com.org.onlinegrocery.ui.features.SplashScreen

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = "onboarding",
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination
    ) {
        composable(Screen.Splash.route) {
            SplashScreen()
        }
        composable(Screen.Onboarding.route) {
            OnboardingScreen(modifier, navController)
        }
        composable(Screen.Login.route) {
            LoginScreen(modifier, navController)
        }
        composable(Screen.Register.route) {
            RegisterScreen()
        }
    }
}