package com.example.unilocal.ui.screens

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unilocal.R
import com.example.unilocal.ui.components.CampoTexto
import com.example.unilocal.ui.components.BotonPrincipal
import com.example.unilocal.ui.theme.PrimaryBlue

@Composable
fun PantallaLogin(
    navegarARegistro: () -> Unit,
    navegarAPrincipalUsuario: () -> Unit
) {
    var usuario by remember { mutableStateOf("") }
    var clave by remember { mutableStateOf("") }
    val context = LocalContext.current

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
            Spacer(modifier = Modifier.height(260.dp))

            Text(stringResource(R.string.login_title))

            Spacer(modifier = Modifier.height(32.dp))

            // Campo usuario
            CampoTexto(
                valor = usuario,
                cuandoCambia = { usuario = it },
                etiqueta = stringResource(R.string.usuario_hint),
                modificador = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Campo contraseña
            CampoTexto(
                valor = clave,
                cuandoCambia = { clave = it },
                etiqueta = stringResource(R.string.clave_hint),
                modificador = Modifier.fillMaxWidth(),
                transformacion = PasswordVisualTransformation(),
                opcionesTeclado = KeyboardOptions.Default.copy()
            )

            Spacer(modifier = Modifier.height(30.dp))

            // Recuperar contraseña
            Text(
                text = stringResource(R.string.forgot_password),
                fontSize = 14.sp,
                color = PrimaryBlue,
                modifier = Modifier.clickable { }
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Botón entrar
            BotonPrincipal(
                texto = stringResource(R.string.login_button),
                onClick = {
                    if (usuario == "admin" && clave == "123") {
                        navegarAPrincipalUsuario()
                    } else {
                        Toast.makeText(
                            context,
                            "Acceso denegado. Admin quemado.",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                }
            )

            Spacer(modifier = Modifier.height(24.dp))

            // Registrarse
            Text(
                text = stringResource(R.string.register_prompt),
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                color = PrimaryBlue,
                modifier = Modifier.clickable {
                    navegarARegistro()
                }
            )
        }
    }
}
