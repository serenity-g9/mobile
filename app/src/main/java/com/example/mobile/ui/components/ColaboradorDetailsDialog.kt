package com.example.mobile.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import com.example.mobile.data.Colaborador

@Composable
fun ColaboradorDetailsDialog(colaborador: Colaborador, onDismiss: () -> Unit, onRemove: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(colaborador.nome) },
        text = { Text("Último trabalho: ${colaborador.ultimoTrabalho}") },
        confirmButton = {
            Button(onClick = onRemove) { Text("Remover") }
        },
        dismissButton = {
            Button(onClick = onDismiss) { Text("Fechar") }
        }
    )
}


