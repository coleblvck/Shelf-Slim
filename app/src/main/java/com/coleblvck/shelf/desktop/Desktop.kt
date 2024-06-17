package com.coleblvck.shelf.desktop

import android.app.Activity
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.unit.dp
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat
import com.coleblvck.shelf.content.fetchApps
import com.coleblvck.shelf.content.filteredAppList
import com.coleblvck.shelf.content.unfilteredAppsList


var appDrawerDisplayed by mutableStateOf(false)


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Desktop(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    val window = (context as Activity).window
    val insetsController = WindowCompat.getInsetsController(window, window.decorView)
    if (hideSystemUI) {
        insetsController.apply {
            hide(WindowInsetsCompat.Type.systemBars())
            systemBarsBehavior =
                WindowInsetsControllerCompat.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
        }
    } else {
        insetsController.apply { show(WindowInsetsCompat.Type.systemBars()) }
    }
    fetchApps(context)
    filteredAppList = unfilteredAppsList
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        if (topBoxVisible) {
            TopBox(
                modifier =
                Modifier
                    .weight(1f)
                    .fillMaxWidth()
            )
        }
        BottomBox(
            modifier = Modifier
                .weight(2F)
                .fillMaxWidth()
        )
    }
}
