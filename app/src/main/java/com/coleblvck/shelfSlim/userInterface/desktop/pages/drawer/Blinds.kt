package com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.itemKey
import com.coleblvck.shelfSlim.contentManagement.App

@Composable
fun Blinds(
    apps: LazyPagingItems<App>,
    state: LazyListState = rememberLazyListState(),
    contentPadding: PaddingValues = PaddingValues(horizontal = 12.dp)
) {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        state = state,
        contentPadding = contentPadding,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(
            count = apps.itemCount,
            contentType = { apps[0] },
            key = apps.itemKey { it.packageName },
            itemContent = { index ->
                apps[index]?.let {
                    DrawerAppItem(
                        app = it,
                        appCardType = AppCardType.STRIP
                    )
                }
            }
        )
    }
}