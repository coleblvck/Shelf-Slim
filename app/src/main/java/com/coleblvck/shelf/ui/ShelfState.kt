package com.coleblvck.shelf.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.coleblvck.shelf.content.App


@Composable
@OptIn(ExperimentalFoundationApi::class)
fun rememberShelfState(
    pagesPagerState: PagerState
): ShelfState {
    return remember(pagesPagerState) {
        ShelfState(pagesPagerState)
    }
}

data class ShelfState @OptIn(ExperimentalFoundationApi::class) constructor(

    val pagesPagerState: PagerState
)

data class ShelfUiState(
    val apps: List<App> = emptyList(),
    val isFlowVisible: Boolean = true,
    val isDashboardVisible: Boolean = true
)