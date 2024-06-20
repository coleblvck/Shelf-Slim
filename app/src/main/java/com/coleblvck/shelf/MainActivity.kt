package com.coleblvck.shelf

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import com.coleblvck.shelf.content.App
import com.coleblvck.shelf.ui.desktop.Desktop
import com.coleblvck.shelf.ui.ShelfViewModel
import com.coleblvck.shelf.ui.theme.ShelfTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge(navigationBarStyle = SystemBarStyle.dark(scrim = Color.Transparent.toArgb()))
        val shelfViewModel = ShelfViewModel()
        shelfViewModel.initContext(this)

        setContent {
            ShelfTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .safeDrawingPadding(),
                    color = Color.Transparent
                ) {
                    ShelfLauncher(shelfViewModel = shelfViewModel)
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun ShelfLauncher(shelfViewModel: ShelfViewModel) {

    val shelfUiState = shelfViewModel.uiState.collectAsState().value
    val apps: List<App> = remember {
        shelfUiState.apps
    }
    val isFLowVisible = shelfUiState.isFlowVisible
    val flowVisibilityToggle = shelfViewModel::toggleFlowVisibility
    val isDashboardVisible = shelfUiState.isDashboardVisible
    val dashboardVisibilityToggle = shelfViewModel::toggleDashboardVisibility
    Desktop(
        apps = apps,
        dashboardVisibilityToggle =  dashboardVisibilityToggle ,
        isDashboardVisible = isDashboardVisible,
        flowVisibilityToggle =  flowVisibilityToggle ,
        isFlowVisible = isFLowVisible
    )
}