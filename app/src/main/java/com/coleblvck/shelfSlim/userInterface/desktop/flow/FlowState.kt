package com.coleblvck.shelfSlim.userInterface.desktop.flow

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import com.coleblvck.shelfSlim.state.PreferenceStore
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.userInterface.desktop.flow.flowHeader.FlowHeaderState
import com.coleblvck.shelfSlim.userInterface.desktop.flow.flowNote.FlowNoteState

class FlowState(private val preferenceStore: PreferenceStore) {


    @OptIn(ExperimentalFoundationApi::class)
    val pagerState = ShelfPagerState(pageCount = 2, initialPage = 0)

    val preferences get() = FlowPreferences(this, preferenceStore)

    val flowVisibilityKey = preferenceStore.keys.flowVisibilityKey

    val defaultFlowVisibility = true

    private val _isVisible: MutableState<Boolean> = mutableStateOf(defaultFlowVisibility)
    val isVisible: State<Boolean> get() = _isVisible

    val toggleVisibility: (save: Boolean) -> Unit = {
        save ->
        setVisibility(!_isVisible.value)
        if (save) {
            preferenceStore.saveBoolean(flowVisibilityKey, _isVisible.value)
        }
    }

    val setVisibility: (Boolean) -> Unit = {
        _isVisible.value = it
    }

    private val _header = FlowHeaderState(preferenceStore)
    val header get() = _header

    private val _note = FlowNoteState(preferenceStore)
    val note get() = _note

    suspend fun animateDirectlyToNote() {
        if (!_isVisible.value) {
            toggleVisibility(true)
        }
        if (pagerState.currentPage != 1) {
            pagerState.animateScrollToPage(1)
        }
    }
}


class FlowPreferences(private val flowState: FlowState, private  val preferenceStore: PreferenceStore) {
    suspend fun initialize() {
        flowState.setVisibility(preferenceStore.getBoolean(flowState.flowVisibilityKey, flowState.defaultFlowVisibility))
        flowState.header.setHeading(preferenceStore.getString(flowState.header.headingKey, flowState.header.defaultHeading), false)
        flowState.header.setSubHeading(preferenceStore.getString(flowState.header.subHeadingKey, flowState.header.defaultSubHeading), false)
        flowState.note.setText(preferenceStore.getString(flowState.note.noteTextKey), false)
    }
}