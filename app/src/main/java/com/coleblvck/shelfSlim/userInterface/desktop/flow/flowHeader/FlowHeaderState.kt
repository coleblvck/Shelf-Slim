package com.coleblvck.shelfSlim.userInterface.desktop.flow.flowHeader

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.state.PreferenceStore

class FlowHeaderState(private val preferenceStore: PreferenceStore) {
    val headingKey = preferenceStore.keys.headerHeadingKey
    val subHeadingKey = preferenceStore.keys.headerSubHeadingKey

    private val _editDialogVisible = mutableStateOf(false)
    val editDialogVisible: State<Boolean> get() = _editDialogVisible

    val setEditDialogVisibility: (Boolean) -> Unit = {
        _editDialogVisible.value = it
    }

    val defaultHeading = "Welcome"
    private val _heading = mutableStateOf(defaultHeading)
    val heading: State<String> get() = _heading
    val setHeading: (value: String, save: Boolean) -> Unit = {
            value, save ->
        _heading.value = value
        if (save) {
            preferenceStore.saveString(headingKey, value)
        }
    }

    val defaultSubHeading = "Double Tap"
    private val _subHeading = mutableStateOf(defaultSubHeading)
    val subHeading: State<String> get() = _subHeading
    val setSubHeading: (value: String, save: Boolean) -> Unit = {
            value, save ->
        _subHeading.value = value
        if (save) {
            preferenceStore.saveString(subHeadingKey, value)
        }
    }
}