package com.coleblvck.shelfSlim.state

import android.content.Context
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.vector.ImageVector
import com.coleblvck.shelfSlim.userInterface.common.iconMap
import com.coleblvck.shelfSlim.utils.Utils


class CustomFunctionToolBox{

    private val _mappingDialogVisible = mutableStateOf(false)
    val mappingDialogVisible: State<Boolean> get() = _mappingDialogVisible

    val setMappingDialogVisibility: (Boolean) -> Unit = {
        _mappingDialogVisible.value = it
    }


    private fun packageLaunchBehavior(context: Context, parameter: String) {
        if (parameter != "") {
            Utils.launchApp(parameter, context)
        } else {
            setMappingDialogVisibility(true)
        }
    }

    fun executeAction(action: ActionType, context: Context, parameter: String = "") {
        when (action) {
            ActionType.PACKAGE_RUN -> packageLaunchBehavior(context, parameter)
            ActionType.NONE -> {
                setMappingDialogVisibility(true)
            }
        }
    }
}


val getIconValue: (String) -> ImageVector = {
    iconMap[it]!!
}

val getActionTypeValue: (String) -> ActionType = {
    ActionType.valueOf(it.uppercase())
}

enum class ActionType {
    PACKAGE_RUN, NONE
}
