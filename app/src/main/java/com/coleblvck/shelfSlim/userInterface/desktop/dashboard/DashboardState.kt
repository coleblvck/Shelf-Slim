package com.coleblvck.shelfSlim.userInterface.desktop.dashboard

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.state.PreferenceStore


class DashboardState(val preferenceStore: PreferenceStore) {

    val positionKey = preferenceStore.keys.dashboardPositionKey

    val defaultPosition = "BOTTOM"
    val currentPosition = mutableStateOf(getDashboardPosition(defaultPosition))

    val changePosition: (position: String) -> Unit = {
        currentPosition.value = getDashboardPosition(it)
        preferenceStore.saveString(positionKey, it)
    }

    val dashIsHorizontal: () -> Boolean = {
        currentPosition.value == DashboardPosition.TOP || currentPosition.value == DashboardPosition.BOTTOM
    }

    val preferences = DashboardPreferences(this)
    val dashboardVisibilityKey = preferenceStore.keys.dashboardVisibilityKey

    val defaultDashboardVisibility = true

    private val _isVisible: MutableState<Boolean> = mutableStateOf(defaultDashboardVisibility)
    val isVisible: State<Boolean> get() = _isVisible

    val toggleVisibility: (save: Boolean) -> Unit = { save ->
        setVisibility(!_isVisible.value)
        if (save) {
            preferenceStore.saveBoolean(dashboardVisibilityKey, _isVisible.value)
        }
    }

    val setVisibility: (Boolean) -> Unit = {
        _isVisible.value = it
    }
}

class DashboardPreferences(private val dashboardState: DashboardState) {
    suspend fun initialize() {
        dashboardState.setVisibility(
            dashboardState.preferenceStore.getBoolean(
                dashboardState.dashboardVisibilityKey,
                dashboardState.defaultDashboardVisibility
            )
        )
        dashboardState.changePosition(
            dashboardState.preferenceStore.getString(
                dashboardState.positionKey,
                dashboardState.defaultPosition
            )
        )
    }
}

enum class DashboardPosition {
    BOTTOM, TOP, LEFT, RIGHT
}

val getDashboardPosition: (String) -> DashboardPosition =
    { DashboardPosition.valueOf(it.uppercase()) }