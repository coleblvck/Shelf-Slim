package com.coleblvck.shelfSlim.userInterface.desktop.dashboard


enum class DashboardPosition {
    BOTTOM, TOP, LEFT, RIGHT
}

val getDashboardPosition: (String) -> DashboardPosition =
    { DashboardPosition.valueOf(it.uppercase()) }