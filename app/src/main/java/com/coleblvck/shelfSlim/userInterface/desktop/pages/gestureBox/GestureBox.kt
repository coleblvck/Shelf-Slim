package com.coleblvck.shelfSlim.userInterface.desktop.pages.gestureBox

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.userInterface.desktop.DesktopUiState
import com.coleblvck.shelfSlim.utils.Utils


@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun GestureBox(
    desktopUiState: DesktopUiState,
) {
    val context = LocalContext.current
    Card(

        modifier = Modifier
            .pointerInput(Unit) {
                detectVerticalDragGestures(
                    onVerticalDrag = { _, dragAmount ->
                        if (dragAmount > 50) {
                            Utils.expandStatusBar(context)
                        }
                    },
                )
            }
            .pointerInput(Unit) {
                detectTapGestures(onDoubleTap = {
                    desktopUiState.dashboard.toggleVisibility(true)
                })
            }
            .fillMaxSize()
            .padding(horizontal = 12.dp),
        colors = CardDefaults.cardColors(
            Color.Transparent,
            MaterialTheme.colorScheme.onTertiary,
            MaterialTheme.colorScheme.tertiary,
            MaterialTheme.colorScheme.onTertiary
        )
    ) {

    }
}