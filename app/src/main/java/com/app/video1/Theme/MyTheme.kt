package com.app.video1.Theme

import android.content.res.Resources
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionContext
import androidx.compose.ui.graphics.Color

private val customDarkColor = darkColors(
    primary = Color.Black,
    secondary = Color.White,
    background = Color.DarkGray
)

private val customLightColor = lightColors(
    primary = Color.Yellow,
    secondary = Color.Black,
    background = Color.White
)

@Composable
fun MyTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit

){
    val customColors = if (darkTheme) customDarkColor
    else customLightColor

    MaterialTheme(
        colors = customColors,
        content = content
    )
}