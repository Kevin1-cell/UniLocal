package com.example.unilocal.ui.configuration

import kotlinx.serialization.Serializable

sealed class ScreenRoutes {

    @Serializable
    data object Login : ScreenRoutes()

    @Serializable
    data object Registro : ScreenRoutes()

    @Serializable
    data object PrincipalUsuarios : ScreenRoutes()

    @Serializable
    data object PrincipalAdministrador : ScreenRoutes()

    @Serializable
    object EditarPerfilUsuario : ScreenRoutes()





}