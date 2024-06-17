package com.coleblvck.shelf.ui.theme

import androidx.compose.ui.graphics.Color

val khaki = Color(0xFFC2AE95)
val brownish = Color(0xFFCD9C60)
val greenish = Color(0xFF85BD7E)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

fun colorWithAlpha(color: Color, alpha: Float = 0.8f) :Color {
    return color.copy(alpha)
}