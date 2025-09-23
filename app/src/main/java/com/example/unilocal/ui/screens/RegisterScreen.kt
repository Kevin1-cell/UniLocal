package com.example.unilocal.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unilocal.R
import com.example.unilocal.ui.components.BotonPrincipal
import com.example.unilocal.ui.components.CampoTexto

@Composable
fun PantallaRegistro() {

    var nombre by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var ciudad by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = stringResource(R.string.app_name),
            modifier = Modifier
                .size(270.dp)
                .align(Alignment.TopCenter)
                .padding(top = 60.dp)
        )

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top
        ) {
            Spacer(modifier = Modifier.height(220.dp))

            Text(
                text = stringResource(R.string.register_title),
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(28.dp))

            CampoTexto(
                valor = nombre,
                cuandoCambia = { nombre = it },
                etiqueta = stringResource(R.string.nombre_hint)
            )
            Spacer(modifier = Modifier.height(16.dp))

            CampoTexto(
                valor = username,
                cuandoCambia = { username = it },
                etiqueta = stringResource(R.string.username_hint)
            )
            Spacer(modifier = Modifier.height(16.dp))

            CampoTexto(
                valor = email,
                cuandoCambia = { email = it },
                etiqueta = stringResource(R.string.email_hint),
                opcionesTeclado = KeyboardOptions(keyboardType = KeyboardType.Email)
            )
            Spacer(modifier = Modifier.height(16.dp))

            CampoTexto(
                valor = ciudad,
                cuandoCambia = { ciudad = it },
                etiqueta = stringResource(R.string.ciudad_hint)
            )
            Spacer(modifier = Modifier.height(16.dp))

            CampoTexto(
                valor = password,
                cuandoCambia = { password = it },
                etiqueta = stringResource(R.string.password_hint),
                transformacion = PasswordVisualTransformation(),
                opcionesTeclado = KeyboardOptions(keyboardType = KeyboardType.Password)
            )
            Spacer(modifier = Modifier.height(24.dp))

            BotonPrincipal(
                texto = stringResource(R.string.register_button),
                onClick = {
                    // Acción de registro aquí
                }
            )
        }
    }
}
