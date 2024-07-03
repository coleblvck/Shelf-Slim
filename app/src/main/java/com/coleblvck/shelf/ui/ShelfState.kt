package com.coleblvck.shelf.ui

import androidx.paging.PagingData
import com.coleblvck.shelf.content.App
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf


data class ShelfUiState(
    val apps: Flow<PagingData<App>> = flowOf( PagingData.from(emptyList())),
    val isFlowVisible: Boolean = true,
    val isDashboardVisible: Boolean = true
)