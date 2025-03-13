package com.example.mobile.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.*
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.mobile.data.Collaborator
import com.example.mobile.data.collaboratorsList
import com.example.mobile.ui.components.BottomNavBar
import com.example.mobile.ui.components.CollaboratorCard
import com.example.mobile.ui.components.CollaboratorDetailsDialog
import com.example.mobile.ui.components.RemoveConfirmationDialog

@Composable
fun EquipeScreen(navController: NavHostController) {
    var selectedCollaborator by remember { mutableStateOf<Collaborator?>(null) }
    var showRemoveDialog by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        // Lista de colaboradores
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.padding(16.dp)
        ) {
            items(collaboratorsList) { collaborator ->
                CollaboratorCard(collaborator) {
                    selectedCollaborator = collaborator
                }
            }
        }

        // Bottom Navigation Bar
        BottomNavBar()
    }

    // Modal com detalhes do colaborador
    selectedCollaborator?.let {
        CollaboratorDetailsDialog(it, onDismiss = { selectedCollaborator = null }) {
            showRemoveDialog = true
        }
    }

    // Diálogo de confirmação de remoção
    if (showRemoveDialog) {
        RemoveConfirmationDialog(
            onConfirm = { /* Remover lógica aqui */ showRemoveDialog = false },
            onDismiss = { showRemoveDialog = false }
        )
    }
}

