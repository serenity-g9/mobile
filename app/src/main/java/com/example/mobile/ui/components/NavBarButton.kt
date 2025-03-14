package com.example.mobile.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mobile.R
import com.example.mobile.ui.theme.PrimaryColorDeepBlue

//@Composable
//fun BottomNavBar(
//    items: List<Int>,  // Lista de ícones
//    onItemClick: (Int) -> Unit  // Função de clique
//) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .background(PrimaryColorDeepBlue)
//            .padding(vertical = 8.dp),
//        horizontalArrangement = Arrangement.SpaceAround,
//        verticalAlignment = Alignment.CenterVertically
//    ) {
//        items.forEach { iconRes ->
//            IconButton(onClick = { onItemClick(iconRes) }) {
//                Icon(
//                    painter = painterResource(id = iconRes),
//                    contentDescription = "Menu Item",
//                    tint = Color.White,
//                    modifier = Modifier
//                        .size(40.dp)
//                        .clip(CircleShape)
//                        .padding(8.dp)
//                )
//            }
//        }
//    }
//}

@Composable
fun BottomNavBar(
    items: List<Int>,
    onItemClick: (Int) -> Unit
) {
    BottomAppBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = Color(0xFF002D62),
        tonalElevation = 8.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly, // Distribui os itens de forma equilibrada
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEachIndexed { index, item ->
                IconButton(onClick = { onItemClick(index) }) {
                    Icon(
                        painter = painterResource(id = item),
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        }
    }
}