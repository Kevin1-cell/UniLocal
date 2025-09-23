package com.example.unilocal.ui.screens.users.UserNavegation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.unilocal.ui.screens.users.PantallaEditarUsuario
import com.example.unilocal.ui.screens.users.UserTaps.Busqueda
import com.example.unilocal.ui.screens.users.UserTaps.CrearLugar
import com.example.unilocal.ui.screens.users.UserTaps.Inicio
import com.example.unilocal.ui.screens.users.UserTaps.Recomendaciones

@Composable
fun ContentUsuario(
    navController: NavHostController,
    padding: PaddingValues
) {


    NavHost(
        modifier = Modifier.padding(padding),
        navController = navController,
        startDestination = RutaTab.InicioUsuario
    ){
        composable<RutaTab.InicioUsuario> {
            Inicio()
        }
        composable<RutaTab.Busqueda> {
            Busqueda()
        }
        composable<RutaTab.CrearLugar> {
            CrearLugar()
        }
        composable<RutaTab.Recomendados> {
            Recomendaciones()
        }
        composable<RutaTab.Perfil> {
            PantallaEditarUsuario()
        }
    }

}