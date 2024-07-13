package com.coleblvck.shelfSlim.state

import android.content.Context
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.vector.ImageVector
import com.coleblvck.shelfSlim.userInterface.common.iconMap
import com.coleblvck.shelfSlim.utils.Utils


class CustomFunction(val preferenceStore: PreferenceStore, val appListState: AppListState) {
    private val iconPreferenceKey = preferenceStore.keys.customFunctionIconKey
    private val packagePreferenceKey = preferenceStore.keys.customFunctionPackageKey
    private val actionTypePreferenceKey = preferenceStore.keys.customFunctionActionTypeKey

    private val defaultIconKey = "Pulse"
    private val _currentIcon = mutableStateOf(iconMap[defaultIconKey]!!)
    val currentIcon: State<ImageVector> get() = _currentIcon

    private val _currentPackage: MutableState<String?> = mutableStateOf(null)
    val currentPackage: State<String?> get() = _currentPackage

    private val _mappingDialogVisible = mutableStateOf(false)
    val mappingDialogVisible: State<Boolean> get() = _mappingDialogVisible

    val setMappingDialogVisibility: (Boolean) -> Unit = {
        _mappingDialogVisible.value = it
    }


    var packageLaunchBehavior = { context: Context ->
        if (currentPackage.value != null && currentPackage.value != "") {
            if (appListState.unfilteredList.map { it.packageName }.contains(currentPackage.value)) {
                Utils.launchApp(currentPackage.value!!, context)
            } else {
                setMappingDialogVisibility(true)
            }
        } else {
            setMappingDialogVisibility(true)
        }
    }
    private val defaultActionKey = "Package Run"
    private var _currentAction = mutableStateOf(actionTypeMap[defaultActionKey]!!)
    val currentAction: State<ActionType> get() = _currentAction

    val setActionType: (actionType: ActionType, save: Boolean) -> Unit = {
        actionType, save ->
        _currentAction.value = actionType
        if (save) {
            val actionKey = actionTypeMap.entries.first { it.value == actionType }.key
            preferenceStore.saveString(actionTypePreferenceKey, actionKey)
        }
    }

    var execute = { param1: Any ->
        when (currentAction.value) {
            ActionType.PackageRun -> packageLaunchBehavior(param1 as Context)
            ActionType.None -> {setMappingDialogVisibility(true)}
        }
    }

    var setCurrentPackage: (packageName: String, save: Boolean) -> Unit = { packageName, save ->
        _currentPackage.value = packageName
        if (_currentAction.value != ActionType.PackageRun) {
            setActionType(ActionType.PackageRun, true)
        }
        if (save) {
            preferenceStore.saveString(packagePreferenceKey, packageName)
        }
    }

    val setCurrentIcon: (iconKey: String, save: Boolean) -> Unit = { iconKey, save ->
        _currentIcon.value = iconMap[iconKey]!!
        if (save) {
            preferenceStore.saveString(iconPreferenceKey, iconKey)
        }
    }

    suspend fun initialize() {
        _currentAction.value = actionTypeMap[preferenceStore.getString(actionTypePreferenceKey, defaultActionKey)]!!
        _currentIcon.value = iconMap[preferenceStore.getString(iconPreferenceKey, defaultIconKey)]!!
        _currentPackage.value = preferenceStore.getString(packagePreferenceKey)
    }
}



val actionTypeMap: Map<String, ActionType> = mapOf(
    "Package Run" to ActionType.PackageRun,
    "None" to ActionType.None
)

enum class ActionType {
    PackageRun, None
}
