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
import com.example.unilocal.ui.components.CustomTextField
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

            Text(
                text = stringResource(R.string.login_title),
                fontSize = 20.sp,
                color = PrimaryBlue
            )

            Spacer(modifier = Modifier.height(32.dp))

            // Campo usuario con nuevo estilo
            CustomTextField(
                value = usuario,
                onValueChange = { usuario = it },
                label = stringResource(R.string.usuario_hint)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Campo contraseña con nuevo estilo
            CustomTextField(
                value = clave,
                onValueChange = { clave = it },
                label = stringResource(R.string.clave_hint),
                visualTransformation = PasswordVisualTransformation(),
                keyboardOptions = KeyboardOptions.Default.copy()
            )

            Spacer(modifier = Modifier.height(30.dp))

            Text(
                text = stringResource(R.string.forgot_password),
                fontSize = 14.sp,
                color = PrimaryBlue,
                modifier = Modifier.clickable { }
            )

            Spacer(modifier = Modifier.height(24.dp))

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
