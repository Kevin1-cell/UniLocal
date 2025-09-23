package com.example.unilocal.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

val Shapes = Shapes(
    small = RoundedCornerShape(50),   // súper redondeado (chips, badges)
    medium = RoundedCornerShape(16.dp), // más suaves y modernos
    large = RoundedCornerShape(0.dp)   // cuadrados para contraste
)
