package com.coleblvck.shelfSlim.data.userPreferences

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.derivedStateOf
import com.coleblvck.shelfSlim.userInterface.desktop.dashboard.DashboardPosition
import com.coleblvck.shelfSlim.userInterface.desktop.dashboard.getDashboardPosition

data class UserPreferences(
    val flowNote: MutableState<String>,
    val headerHeading: MutableState<String>,
    val headerSubHeading: MutableState<String>,
    val flowIsVisible: MutableState<Boolean>,
    val dashboardIsVisible: MutableState<Boolean>,
    val drawerType: MutableState<String>,
    val customFunctionIcon: MutableState<String>,
    val customFunctionPackage: MutableState<String>,
    val customFunctionAction: MutableState<String>,
    val dashboardPosition: MutableState<String>,
) {
    val dashboardIsHorizontal = derivedStateOf {
        val dashPosition = getDashboardPosition(dashboardPosition.value)
        dashPosition == DashboardPosition.BOTTOM || dashPosition == DashboardPosition.TOP
    }
}