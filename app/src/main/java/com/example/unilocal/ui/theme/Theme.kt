package com.example.unilocal.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.graphics.Color

// Custom dark scheme
private val IndigoDarkScheme = darkColorScheme(
    primary = PrimaryIndigo,
    secondary = AccentTeal,
    tertiary = CoralDark,
    background = PureWhite,
    surface = SkyBlueLight,
    error = AlertOrange,
    onPrimary = PureWhite,
    onSecondary = PureWhite,
    onBackground = Color.Black,
    onSurface = Color.Black
)

// Custom light scheme
private val IndigoLightScheme = lightColorScheme(
    primary = PrimaryBlue,
    secondary = AccentTeal,
    tertiary = CoralLight,
    background = PureWhite,
    surface = SkyBlueLight,
    error = AlertOrange,
    onPrimary = PureWhite,
    onSecondary = PureWhite,
    onBackground = Color.Black,
    onSurface = Color.Black
)

@Composable
fun UniLocalAppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> IndigoDarkScheme
        else -> IndigoLightScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = AppTypography,
        shapes = Shapes,
        content = content
    )
}
