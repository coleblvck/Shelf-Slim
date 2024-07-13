package com.coleblvck.shelfSlim.userInterface.desktop

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.state.CustomFunction
import com.coleblvck.shelfSlim.state.PreferenceStore
import com.coleblvck.shelfSlim.userInterface.desktop.dashboard.DashboardState
import com.coleblvck.shelfSlim.userInterface.desktop.flow.FlowState
import com.coleblvck.shelfSlim.userInterface.desktop.hint.HintState


class DesktopUiState(preferenceStore: PreferenceStore, customFunction: CustomFunction) {



    private val _flow = FlowState(preferenceStore)
    val flow get() = _flow

    private val _dashboard = DashboardState(preferenceStore)
    val dashboard get() = _dashboard


    private val _hint = HintState(desktopUiState = this, customFunction = customFunction)
    val hint get() = _hint

    private val _isSystemUiVisible: MutableState<Boolean> = mutableStateOf(false)
    val isSystemUiVisible: State<Boolean> get() = _isSystemUiVisible

    val toggleSystemUiVisibility: () -> Unit = {
        _isSystemUiVisible.value = !_isSystemUiVisible.value
    }

}

