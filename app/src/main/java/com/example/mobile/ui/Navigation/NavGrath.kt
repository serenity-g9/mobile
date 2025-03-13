package com.example.mobile.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.mobile.ui.screens.*

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") { HomeScreen(navController) }
        composable("eventos") { EventosScreen() }
        composable("demandas") { DemandasScreen() }
        composable("dashboard") { DashboardScreen() }
        composable("equipe") { EquipeScreen() }
        composable("checkin") { CheckInScreen() }
    }
}


