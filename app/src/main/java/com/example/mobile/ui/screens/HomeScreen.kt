package com.example.mobile.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mobile.R
import com.example.mobile.ui.components.BottomNavBar
import com.example.mobile.ui.components.HomeCard
import com.example.mobile.ui.theme.PrimaryColorDeepBlue

@Composable
fun HomeScreen(navController: NavHostController) {  // Certifique-se de que está recebendo um NavHostController
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Header
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = CardDefaults.cardColors(containerColor = PrimaryColorDeepBlue)
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.rounded_assignment_ind_24),
                    contentDescription = "Usuário",
                    tint = Color.Gray,
                    modifier = Modifier
                        .size(48.dp)
                        .clip(CircleShape)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text("Bem vindo(a),\nUsuário", color = Color.White)
            }
        }

        // Grid de Cards
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                HomeCard("Eventos", R.drawable.ticket_24) {
                    navController.navigate("eventos")  // Corrigindo a navegação
                }
                HomeCard("Demandas", R.drawable.bag_24) {
                    navController.navigate("demandas")  // Corrigindo a navegação
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
                HomeCard("Dashboard", R.drawable.dashboard) {
                    navController.navigate("dashboard")
                }
                HomeCard("Equipe", R.drawable.outline_equipe) {
                    navController.navigate("equipe")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            HomeCard("Check in", R.drawable.qr_24) {
                navController.navigate("checkin")
            }
        }

        // Bottom Navigation Bar
        BottomNavBar(
            items = listOf(
                R.drawable.baseline_dashboard_customize_24,
                R.drawable.ticket_24,
                R.drawable.logo,
                R.drawable.bag_24,
                R.drawable.outline_equipe
            )
        ) { /* Lidar com cliques */ }
    }
}
