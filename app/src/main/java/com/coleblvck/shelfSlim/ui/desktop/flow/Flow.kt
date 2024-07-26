package com.coleblvck.shelfSlim.ui.desktop.flow

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.data.entities.text.Text
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.ui.desktop.flow.flowHeader.FlowHeader
import com.coleblvck.shelfSlim.ui.desktop.flow.flowNote.FlowNote

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Flow(
    modifier: Modifier = Modifier,
    shouldPadPagerItemHorizontally: State<Boolean>,
    isFlowVisible: State<Boolean>,
    flowPagerState: ShelfPagerState,
    flowHeaderHeading: State<Text>,
    updateFlowHeaderHeading: (Text) -> Unit,
    flowHeaderSubHeading: State<Text>,
    updateFlowHeaderSubHeading: (Text) -> Unit,
    flowHeaderBackground: State<Int?>,
    updateFlowHeaderBackground: (Int?) -> Unit,
    flowHeaderEditDialogVisible: State<Boolean>,
    updateFlowHeaderEditDialogVisibility: (Boolean) -> Unit,
    flowNoteText: State<Text>,
    updateFlowNoteText: (Text) -> Unit,
    updateHintVisibility: (Boolean) -> Unit,
) {
    AnimatedVisibility(
        visible = isFlowVisible.value,
        modifier = modifier.clip(RoundedCornerShape(12.dp)),
        enter = slideInHorizontally() + expandHorizontally() + fadeIn(),
        exit = slideOutHorizontally() + shrinkHorizontally() + fadeOut()
    ) {
        Box {
            HorizontalPager(
                state = flowPagerState,
                beyondBoundsPageCount = 1,
                pageSpacing = 8.dp
            ) { page ->
                when (page) {
                    0 -> FlowHeader(
                        shouldPadPagerItemHorizontally = shouldPadPagerItemHorizontally,
                        flowHeaderHeading = flowHeaderHeading,
                        updateFlowHeaderHeading = updateFlowHeaderHeading,
                        flowHeaderSubHeading = flowHeaderSubHeading,
                        updateFlowHeaderSubHeading = updateFlowHeaderSubHeading,
                        flowHeaderBackground = flowHeaderBackground,
                        updateFlowHeaderBackground = updateFlowHeaderBackground,
                        flowHeaderEditDialogVisible = flowHeaderEditDialogVisible,
                        updateFlowHeaderEditDialogVisibility = updateFlowHeaderEditDialogVisibility,
                        updateHintVisibility = updateHintVisibility
                    )

                    1 -> FlowNote(
                        shouldPadPagerItemHorizontally = shouldPadPagerItemHorizontally,
                        flowNoteText = flowNoteText,
                        updateFlowNoteText = updateFlowNoteText
                    )
                }
            }
        }
    }
}