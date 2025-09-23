package com.example.unilocal.ui.screens.users.UserNavegation

import kotlinx.serialization.Serializable

sealed class RutaTab() {

    @Serializable
    data object Busqueda : RutaTab()

    @Serializable
    data object CrearLugar : RutaTab()

    @Serializable
    data object InicioUsuario : RutaTab()

    @Serializable
    data object Perfil : RutaTab()

    @Serializable
    data object Recomendados : RutaTab()



}