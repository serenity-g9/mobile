package com.example.mobile.data

import com.example.mobile.R

data class Colaborador(
    val id: Int,
    val nome: String,
    val ultimoTrabalho: String,
    val avaliacao: Float,
    val imagemRes: Int // ID do recurso da imagem
)

// Lista de colaboradores para exibição
val colaboradores = listOf(
    Colaborador(1, "Eduardo", "Mochileiro", 4.0f, R.drawable.baseline_face_24),
    Colaborador(2, "Camila", "Atendente", 3.5f, R.drawable.baseline_face_24),
    Colaborador(3, "Betânia", "Mochileira", 4.5f, R.drawable.baseline_face_24),
    Colaborador(4, "Eduardo", "Coordenador", 4.2f, R.drawable.baseline_face_24)
)



