package com.example.unilocal.ui.screens.users.UserTaps


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.unilocal.R

import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.res.painterResource
import com.example.unilocal.ui.components.BotonPrincipal
import com.example.unilocal.ui.components.CustomTextField

@Composable
fun CrearLugar() {
    var nombre by remember { mutableStateOf("") }
    var descripcion by remember { mutableStateOf("") }
    var horario by remember { mutableStateOf("") }
    var telefono by remember { mutableStateOf("") }
    var direccion by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 20.dp, vertical = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = stringResource(R.string.app_name),
            modifier = Modifier
                .size(160.dp)
                .padding(bottom = 16.dp)
        )

        Text(
            text = stringResource(R.string.crear_lugar_titulo),
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.primary,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )

        Spacer(modifier = Modifier.height(24.dp))

        CustomTextField(
            value = nombre,
            onValueChange = { nombre = it },
            label = stringResource(R.string.nombre_lugar)
        )
        CustomTextField(
            value = descripcion,
            onValueChange = { descripcion = it },
            label = stringResource(R.string.descripcion_lugar)
        )
        CustomTextField(
            value = horario,
            onValueChange = { horario = it },
            label = stringResource(R.string.horario_atencion)
        )
        CustomTextField(
            value = telefono,
            onValueChange = { telefono = it },
            label = stringResource(R.string.telefono_lugar)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            CustomTextField(
                value = direccion,
                onValueChange = { direccion = it },
                label = stringResource(R.string.direccion_lugar),
                modifier = Modifier.weight(1f)
            )
            IconButton(
                onClick = { /* abrir mapa */ },
                modifier = Modifier.align(Alignment.Bottom)
            ) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Buscar en mapa")
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .background(Color.LightGray, RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Mapa de Google (placeholder)")
        }

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = stringResource(R.string.selecciona_foto),
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp)
                .background(Color.LightGray, RoundedCornerShape(8.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Galería de fotos (placeholder)")
        }

        Spacer(modifier = Modifier.height(32.dp))

        BotonPrincipal(
            texto = stringResource(R.string.boton_guardar),
            onClick = { /* guardar */ },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
        )
    }
}
