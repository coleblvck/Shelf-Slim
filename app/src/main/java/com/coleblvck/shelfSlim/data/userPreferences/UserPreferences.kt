package com.coleblvck.shelfSlim.data.userPreferences

import androidx.compose.runtime.MutableState

data class UserPreferences(
    val flowNote: MutableState<String>,
    val headerHeading: MutableState<String>,
    val headerSubHeading: MutableState<String>,
    val flowVisible: MutableState<Boolean>,
    val dashboardVisible: MutableState<Boolean>,
    val drawerType: MutableState<String>,
    val customFunctionIcon: MutableState<String>,
    val customFunctionPackage: MutableState<String>,
    val customFunctionAction: MutableState<String>,
    val dashboardPosition: MutableState<String>,
)