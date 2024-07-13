package com.coleblvck.shelfSlim.userInterface.desktop.flow.flowNote

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.state.PreferenceStore


class FlowNoteState(private val preferenceStore: PreferenceStore) {
    private val _text = mutableStateOf("")
    val text: State<String> get() = _text
    val noteTextKey = preferenceStore.keys.noteTextKey

    val setText: (value: String, save: Boolean) -> Unit = {
            value, save ->
        _text.value = value
        if (save) {
            preferenceStore.saveString(noteTextKey, value)
        }
    }
}
