package com.example.mobile.ui.components

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable

@Composable
fun RemoveConfirmationDialog(onConfirm: () -> Unit, onDismiss: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Remover parceiro?") },
        text = { Text("Deseja remover este colaborador?") },
        confirmButton = { Button(onClick = onConfirm) { Text("Sim") } },
        dismissButton = { Button(onClick = onDismiss) { Text("Não") } }
    )
}
