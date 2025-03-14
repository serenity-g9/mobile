package com.example.mobile.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mobile.R
import com.example.mobile.data.Colaborador

@Composable
fun ColaboradorCard(colaborador: Colaborador, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClick() }
            .padding(8.dp),
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = colaborador.imagemRes),
                contentDescription = "Foto de ${colaborador.nome}",
                modifier = Modifier
                    .size(60.dp)
                    .clip(RoundedCornerShape(10.dp))
            )

            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Text(text = colaborador.nome, style = MaterialTheme.typography.titleMedium)
                Text(text = "Último trabalho: ${colaborador.ultimoTrabalho}", style = MaterialTheme.typography.bodySmall)

                Row {
                    repeat(5) { index ->
                        val starColor = if (index < colaborador.avaliacao.toInt()) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.onSurface.copy(alpha = 0.3f)
                        Icon(
                            painter = painterResource(id = R.drawable.star_24),
                            contentDescription = null,
                            tint = starColor,
                            modifier = Modifier.size(16.dp)
                        )
                    }
                }
            }
        }
    }
}


