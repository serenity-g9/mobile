package com.example.mobile.data

import androidx.annotation.DrawableRes
import com.example.mobile.R

data class Collaborator(
    val name: String,
    val lastJob: String,
    @DrawableRes val image: Int,
    val age: Int = 25,
    val experience: List<String> = listOf(),
    val contact: String = "email@empresa.com"
)

// Simulando uma lista de colaboradores
val collaboratorsList = listOf(
    Collaborator("Eduardo", "Mochileiro", R.drawable.baseline_face_24, experience = listOf("Atendente", "Repositor")),
    Collaborator("Camila", "Atendente", R.drawable.baseline_face_24, experience = listOf("Atendente")),
    Collaborator("Betânia", "Mochileira", R.drawable.baseline_face_24, experience = listOf("Caixa", "Vendas")),
    Collaborator("Eduardo", "Coordenador", R.drawable.baseline_face_24, experience = listOf("Gestor"))
)


