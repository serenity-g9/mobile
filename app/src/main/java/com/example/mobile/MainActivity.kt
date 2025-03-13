package com.example.mobile

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.mobile.ui.navigation.NavGraph
import com.example.mobile.ui.screens.HomeScreen
import com.example.mobile.ui.theme.MobileTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MobileApp()
        }
    }
}

@Composable
fun MobileApp() {
    val navController = rememberNavController()  // Inicializa o controlador de navegação
    NavGraph(navController)  // Passa corretamente para o gráfico de navegação
}

@Preview(showBackground = true)  // Ativa a pré-visualização
@Composable
fun PreviewHomeScreen() {
    MobileTheme {
        HomeScreen(navController = rememberNavController())
    }
}
