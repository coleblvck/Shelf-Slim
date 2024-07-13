package com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer

import androidx.compose.foundation.gestures.ScrollableDefaults
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridState
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.itemKey
import com.coleblvck.shelfSlim.contentManagement.App
import com.coleblvck.shelfSlim.userInterface.theme.colorWithAlpha

@Composable
fun Grid(
    apps: LazyPagingItems<App>,
    state: LazyStaggeredGridState = rememberLazyStaggeredGridState(),
    contentPadding: PaddingValues = PaddingValues(12.dp)
) {
    Card(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp),

        colors = CardDefaults.cardColors(
            colorWithAlpha(MaterialTheme.colorScheme.background),
            MaterialTheme.colorScheme.onBackground,
            MaterialTheme.colorScheme.background,
            MaterialTheme.colorScheme.onBackground,
        ),
    ) {
        LazyVerticalStaggeredGrid(
            modifier = Modifier.fillMaxSize(),
            state = state,
            columns = StaggeredGridCells.Adaptive(60.dp),
            contentPadding = contentPadding,
            horizontalArrangement = Arrangement.spacedBy(4.dp),
            verticalItemSpacing = 4.dp,
            flingBehavior = ScrollableDefaults.flingBehavior(),
        ) {
            items(
                count = apps.itemCount,
                contentType = { "App" },
                key = apps.itemKey { it.packageName },
                itemContent = { index ->
                    apps[index]?.let {
                        DrawerAppItem(
                            app = it,
                            appCardType = AppCardType.BOX
                        )
                    }
                }
            )

        }
    }
}