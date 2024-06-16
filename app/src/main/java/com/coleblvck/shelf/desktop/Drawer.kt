package com.coleblvck.shelf.desktop

enum class DrawerType {
    BLINDS, BOXES, GRID
}

val defaultDrawerType: DrawerType = DrawerType.BLINDS

var currentDrawerType: DrawerType = defaultDrawerType