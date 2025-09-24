package com.example.unilocal.ui.screens.users

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unilocal.R
import com.example.unilocal.ui.components.BotonPrincipal
import com.example.unilocal.ui.components.CustomTextField
@Composable
fun PantallaEditarUsuario(
    onNavigateBack: () -> Unit = {}
) {
    var nombre by remember { mutableStateOf("Nombre Ejemplo") }
    var username by remember { mutableStateOf("nickname_ejemplo") }
    var ciudad by remember { mutableStateOf("Ciudad Ejemplo") }

    val correo = "ejemplo@correo.com"
    val edad = "28 años"
    val sexo = "Masculino"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 20.dp, vertical = 24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Campos editables
        CustomTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = stringResource(id = R.string.nombre_usuario)
        )

        CustomTextField(
            value = username,
            onValueChange = { username = it },
            label = stringResource(id = R.string.username_hint)
        )

        CustomTextField(
            value = ciudad,
            onValueChange = { ciudad = it },
            label = stringResource(id = R.string.ciudad_usuario)
        )

        Divider(modifier = Modifier.padding(vertical = 8.dp))

        // Campos solo informativos
        Text(text = "Correo: $correo", fontSize = 16.sp)
        Text(text = "Edad: $edad", fontSize = 16.sp)
        Text(text = "Sexo: $sexo", fontSize = 16.sp)

        Spacer(modifier = Modifier.weight(1f))

        BotonPrincipal(
            texto = stringResource(id = R.string.boton_editar_datos_usuario),
            onClick = {
                // Guardar cambios aquí
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        )
    }
}
