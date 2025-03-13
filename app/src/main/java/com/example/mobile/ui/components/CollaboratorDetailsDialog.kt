package com.example.mobile.ui.components

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.mobile.data.Collaborator

@Composable
fun CollaboratorDetailsDialog(collaborator: Collaborator, onDismiss: () -> Unit, onRemoveClick: () -> Unit) {
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(collaborator.name) },
        text = { Text("Experiência: ${collaborator.experience.joinToString()}") },
        confirmButton = {
            Button(onClick = onRemoveClick, colors = ButtonDefaults.buttonColors(Color.Red)) {
                Text("Remover")
            }
        },
        dismissButton = {
            Button(onClick = onDismiss) { Text("Fechar") }
        }
    )
}


