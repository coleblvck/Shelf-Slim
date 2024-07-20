package com.coleblvck.shelfSlim.userInterface.desktop.flow

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandHorizontally
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkHorizontally
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.userInterface.desktop.flow.flowHeader.FlowHeader
import com.coleblvck.shelfSlim.userInterface.desktop.flow.flowNote.FlowNote

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Flow(
    modifier: Modifier = Modifier,
    isFlowVisible: Boolean,
    flowPagerState: ShelfPagerState,
    flowHeaderHeading: String,
    updateFlowHeaderHeading: (String) -> Unit,
    flowHeaderSubHeading: String,
    updateFlowHeaderSubHeading: (String) -> Unit,
    flowHeaderEditDialogVisible: Boolean,
    updateFlowHeaderEditDialogVisibility: (Boolean) -> Unit,
    flowNoteText: String,
    updateFlowNoteText: (String) -> Unit,
    updateHintVisibility: (Boolean) -> Unit,
) {
    AnimatedVisibility(
        visible = isFlowVisible,
        modifier = modifier,
        enter = slideInHorizontally() + expandHorizontally() + fadeIn(),
        exit = slideOutHorizontally() + shrinkHorizontally() + fadeOut()
    ) {
        Box {
            HorizontalPager(
                state = flowPagerState,
                beyondBoundsPageCount = 1,
            ) { page ->
                when (page) {
                    0 -> FlowHeader(
                        flowHeaderHeading = flowHeaderHeading,
                        updateFlowHeaderHeading = updateFlowHeaderHeading,
                        flowHeaderSubHeading = flowHeaderSubHeading,
                        updateFlowHeaderSubHeading = updateFlowHeaderSubHeading,
                        flowHeaderEditDialogVisible = flowHeaderEditDialogVisible,
                        updateFlowHeaderEditDialogVisibility = updateFlowHeaderEditDialogVisibility,
                        updateHintVisibility = updateHintVisibility
                    )

                    1 -> FlowNote(
                        flowNoteText = flowNoteText,
                        updateFlowNoteText = updateFlowNoteText
                    )
                }
            }
        }
    }
}