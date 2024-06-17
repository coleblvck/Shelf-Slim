package com.coleblvck.shelf.desktop

import androidx.compose.runtime.Composable

enum class WidgetType {
    DRAWER, FAB, EMPTYBOX
}

var widgets: Map<WidgetType, @Composable (Any) -> Unit> = mapOf(
    WidgetType.DRAWER to { i -> Drawer(i as DrawerType) },
    WidgetType.FAB to { FAB() },
    WidgetType.EMPTYBOX to { EmptyBox() }
)