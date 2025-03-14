package com.example.mobile.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mobile.R
import com.example.mobile.data.colaboradores
import com.example.mobile.ui.components.ColaboradorCard
import com.example.mobile.ui.components.BottomNavBar

@Composable
fun EquipeScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = CardDefaults.cardColors(containerColor = Color(0xFF0A3D91))
        ) {
            Row(
                modifier = Modifier.padding(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo TL STAFF",
                    modifier = Modifier.size(48.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text("TL STAFF", color = Color.White)
            }
        }

        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(colaboradores) { colaborador ->
                ColaboradorCard(colaborador) {
                    // Aqui abrirá o modal com detalhes do colaborador
                }
            }
        }

        BottomNavBar(
            items = listOf(
                R.drawable.baseline_dashboard_customize_24,
                R.drawable.ticket_24,
                R.drawable.logo,
                R.drawable.bag_24
            ),
            onItemClick = { index ->
                when (index) {
                    0 -> navController.navigate("dashboard")
                    1 -> navController.navigate("eventos")
                    2 -> navController.navigate("home")
                    3 -> navController.navigate("demandas")
                }
            }
        )
    }
}
