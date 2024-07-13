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
import com.coleblvck.shelfSlim.userInterface.desktop.flow.flowHeader.FlowHeader
import com.coleblvck.shelfSlim.userInterface.desktop.flow.flowNote.FlowNote
import com.coleblvck.shelfSlim.userInterface.desktop.hint.HintState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Flow(
    modifier: Modifier = Modifier,
    flowState: FlowState,
    hintState: HintState,
) {
    AnimatedVisibility(
        visible = flowState.isVisible.value,
        modifier = modifier,
        enter = slideInHorizontally() + expandHorizontally() + fadeIn(),
        exit = slideOutHorizontally() + shrinkHorizontally() + fadeOut()
    ) {
        Box {
            HorizontalPager(
                state = flowState.pagerState,
                beyondBoundsPageCount = 1,
            ) { page ->
                when (page) {
                    0 -> FlowHeader(
                        flowState = flowState,
                        hintState = hintState
                    )

                    1 -> FlowNote(
                        note = flowState.note
                    )
                }
            }
        }
    }
}