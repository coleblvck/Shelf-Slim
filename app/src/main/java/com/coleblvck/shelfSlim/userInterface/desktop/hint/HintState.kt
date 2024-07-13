package com.coleblvck.shelfSlim.userInterface.desktop.hint

import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.state.CustomFunction
import com.coleblvck.shelfSlim.userInterface.desktop.DesktopUiState

class HintState (desktopUiState: DesktopUiState, customFunction: CustomFunction) {
    val isVisible = mutableStateOf(false)
    val content = HintContent(desktopUiState = desktopUiState, customFunction = customFunction)
}