package com.example.unilocal.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.unilocal.ui.configuration.ScreenRoutes
import com.example.unilocal.ui.screens.users.PrincipalUsuario

@Composable
fun Navegacion() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.Login
    ) {
        // Pantalla de Login
        composable<ScreenRoutes.Login> {
            PantallaLogin(
                navegarAPrincipalUsuario = {
                    navController.navigate(ScreenRoutes.PrincipalUsuarios)
                },
                navegarARegistro = {
                    navController.navigate(ScreenRoutes.Registro)
                }
            )
        }

        // Pantalla de Registro
        composable<ScreenRoutes.Registro> {
            PantallaRegistro()
        }

        // Pantalla Principal del Usuario
        composable<ScreenRoutes.PrincipalUsuarios> {
            PrincipalUsuario()
        }
    }
}
