package com.coleblvck.shelf.ui.desktop

import androidx.compose.runtime.Composable
import com.coleblvck.shelf.content.App

enum class DrawerType {
    BLINDS, BOXES, GRID
}

val defaultDrawerType: DrawerType = DrawerType.BLINDS

var currentDrawerType: DrawerType = DrawerType.BOXES


@Composable
fun Drawer(type: DrawerType, apps: List<App>) {
    when (type) {
        DrawerType.BLINDS -> {
            Blinds(apps = apps)
        }

        DrawerType.BOXES -> {
            Boxes(apps = apps)
        }

        DrawerType.GRID -> {
            Blinds(apps = apps)
        }
    }

}