package com.coleblvck.shelfSlim.ui.desktop

import android.content.pm.PackageManager
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.state.stateTools.appList.AppListToolBox


class DesktopState(packageManager: PackageManager) {

    val appListToolBox: AppListToolBox = AppListToolBox(packageManager)

    private val _isSystemUiVisible: MutableState<Boolean> = mutableStateOf(false)
    val isSystemUiVisible: State<Boolean> get() = _isSystemUiVisible

    val toggleSystemUiVisibility: () -> Unit = {
        _isSystemUiVisible.value = !_isSystemUiVisible.value
    }

    val isWidgetSelectionSheetVisible = mutableStateOf(false)

    val showWidgetSelectionSheet: () -> Unit = {
        isWidgetSelectionSheetVisible.value = true
    }

    private val _isHintVisible: MutableState<Boolean> = mutableStateOf(false)
    val isHintVisible: State<Boolean> get() = _isHintVisible

    val updateHintVisibility: (Boolean) -> Unit = {
        _isHintVisible.value = it
    }

}

