package com.coleblvck.shelf.desktop

import androidx.compose.runtime.Composable

enum class DrawerType {
    BLINDS, BOXES, GRID
}

val defaultDrawerType: DrawerType = DrawerType.BLINDS

var currentDrawerType: DrawerType = defaultDrawerType


@Composable
fun Drawer() {
    if (appDrawerDisplayed) {
        when (currentDrawerType) {
            DrawerType.BLINDS -> {
                Blinds()
            }

            DrawerType.BOXES -> {
                Blinds()
            }

            DrawerType.GRID -> {
                Blinds()
            }
        }
    }
}