package com.coleblvck.shelf.desktop

import androidx.compose.runtime.Composable
import java.util.EnumMap

enum class WidgetType {
    DRAWER,
}

var widgets: Map<WidgetType, @Composable () -> Unit> = mapOf(
    WidgetType.DRAWER to { Drawer() }
)