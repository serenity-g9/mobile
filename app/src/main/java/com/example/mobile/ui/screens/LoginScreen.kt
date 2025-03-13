package com.example.mobile.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.mobile.R
import com.example.mobile.ui.components.CustomTextField
import com.example.mobile.ui.theme.OrangeSerenity
import com.example.mobile.ui.theme.PrimaryColorDeepBlue
import com.example.mobile.ui.theme.WhiteSerenity
import androidx.compose.foundation.shape.RoundedCornerShape

@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        // Conteúdo principal da tela (mesmo código anterior)
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFF182F4E))  // Cor de fundo da tela
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Imagem antes do título
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = "Logo do App",
                modifier = Modifier
                    .size(120.dp)
                    .padding(bottom = 16.dp)
            )

            // Título "Serenity"
            Text(
                text = "Serenity",
                style = MaterialTheme.typography.headlineLarge,
                color = Color.White,  // Cor do texto para contraste
                modifier = Modifier.padding(bottom = 32.dp)
            )

            // Card para agrupar e-mail, senha, botão e link "Esqueci minha senha"
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp),
                shape = RoundedCornerShape(16.dp),  // Bordas arredondadas
                colors = CardDefaults.cardColors(containerColor = Color.White)  // Fundo branco
            ) {
                Column(
                    modifier = Modifier.padding(16.dp),
                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally  // Centraliza os filhos horizontalmente
                ) {
                    // Campo de e-mail
                    CustomTextField(
                        value = email,
                        onValueChange = { email = it },
                        label = "E-mail",
                        placeholder = "user123@gmail.com",
                        modifier = Modifier.fillMaxWidth()
                    )

                    // Campo de senha
                    CustomTextField(
                        value = password,
                        onValueChange = { password = it },
                        label = "Senha",
                        placeholder = "***********",
                        isPassword = true,
                        modifier = Modifier.fillMaxWidth()
                    )

                    // Botão "Entrar"
                    Button(
                        onClick = {
                            // Lógica de login
                            navController.navigate("home")
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = OrangeSerenity,  // Cor de fundo do botão
                            contentColor = WhiteSerenity            // Cor do texto do botão
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(56.dp)
                    ) {
                        Text("Entrar")
                    }

                    // Link "Esqueci minha senha"
                    TextButton(
                        onClick = { navController.navigate("esqueciSenha") },
                        modifier = Modifier.fillMaxWidth()  // Ocupa toda a largura
                    ) {
                        Text("Esqueci minha senha", color = PrimaryColorDeepBlue)  // Cor do texto
                    }
                }
            }

            // Link "Não possui uma conta? Cadastrar"
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                TextButton(onClick = { navController.navigate("cadastrar") }) {
                    Text("Não possui uma conta? Cadastrar", color = Color.White)
                }
            }
        }

        // Footer branco com a logo e o texto "Serenity"
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)  // Altura do footer
                .background(Color.White)  // Fundo branco
                .align(Alignment.BottomCenter)  // Posiciona na parte inferior
        ) {
            // Row para alinhar a logo e o texto verticalmente
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center),  // Centraliza o Row no footer
                verticalAlignment = Alignment.CenterVertically,  // Alinha os itens verticalmente no centro
                horizontalArrangement = Arrangement.Center  // Centraliza os itens horizontalmente
            ) {
                // Logo
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo do App",
                    modifier = Modifier
                        .size(48.dp)  // Tamanho da logo no footer
                        .padding(end = 8.dp)  // Espaçamento entre a logo e o texto
                )

                // Texto "Serenity"
                Text(
                    text = "Serenity",
                    style = MaterialTheme.typography.bodyLarge,
                    color = Color(0xFF182F4E)  // Cor do texto
                )
            }
        }
    }
}