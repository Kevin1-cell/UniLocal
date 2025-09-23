package com.example.unilocal.ui.screens.users

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.compose.rememberNavController
import com.example.unilocal.R
import com.example.unilocal.ui.screens.users.userButtonBar.BottonBarUsuario
import com.example.unilocal.ui.screens.users.UserNavegation.ContentUsuario
import com.example.unilocal.ui.screens.users.UserNavegation.RutaTab


@Composable
fun PrincipalUsuario() {

    val navController = rememberNavController()

    Scaffold(
        containerColor = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopBarUsuario()
        },

        bottomBar = {
            BottonBarUsuario(
                navController = navController
            )
        }

    ) { padding ->
        ContentUsuario(
            navController = navController,
            padding = padding
        )

    }
}


@Composable
fun TopBarUsuario() {

}



enum class Destino(
    val ruta: RutaTab,
    val texto: Int,
    val icono: ImageVector

){
    INICIO(RutaTab.InicioUsuario,R.string.inicio,Icons.Default.Home),
    BUSQUEDA(RutaTab.Busqueda,R.string.busqueda,Icons.Default.Search),
    CREARLUGAR(RutaTab.CrearLugar,R.string.crear_lugar,Icons.Default.AddCircle),
    RECOMENDACIONES(RutaTab.Recomendados,R.string.recomendados,Icons.Default.Place),
    PERFIL(RutaTab.Perfil,R.string.perfil,Icons.Default.Person) // vamos al editar momentaniam
}
