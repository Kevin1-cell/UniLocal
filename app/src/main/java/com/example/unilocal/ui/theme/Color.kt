package com.example.unilocal.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

// Soft pastel palette
val SkyBlueLight = Color(0xFFB3E5FC)
val IndigoGray = Color(0xFFB0BEC5)
val CoralLight = Color(0xFFFFCDD2)

val IndigoDark = Color(0xFF3949AB)
val IndigoMuted = Color(0xFF5C6BC0)
val CoralDark = Color(0xFFE57373)

// Custom brand palette (changed from green focus → blue/purple vibe)
val PrimaryIndigo = Color(0xFF3F51B5)
val AccentTeal = Color(0xFF0097A7)

val PrimaryBlue = Color(0xFF0288D1)
val PureWhite = Color(0xFFFFFFFF)
val AlertOrange = Color(0xFFFF7043)

// Updated app color scheme
val AppColorScheme = darkColorScheme(
    primary = PrimaryIndigo,
    secondary = AccentTeal,
    background = PureWhite,
    surface = SkyBlueLight,
    onPrimary = PureWhite,
    onSecondary = PureWhite,
    onBackground = Color.Black,
    onSurface = Color.Black,
    error = AlertOrange
)
