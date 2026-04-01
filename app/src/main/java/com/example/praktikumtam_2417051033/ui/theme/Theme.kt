package com.example.praktikumtam_2417051033.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val AppColorScheme = lightColorScheme(
    primary = PinkPrimary,
    secondary = PurpleSecondary,
    background = CreamBackground,
    surface = CardSurface,
    onPrimary = OnPrimaryText,
    onSurface = Color(0xFF4A4A4A)
)

@Composable
fun PraktikumTAM_2417051033Theme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppColorScheme,
        typography = AppTypography,
        content = content
    )
}