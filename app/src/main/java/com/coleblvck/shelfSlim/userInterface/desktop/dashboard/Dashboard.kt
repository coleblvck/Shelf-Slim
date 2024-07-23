package com.coleblvck.shelfSlim.userInterface.desktop.dashboard

import android.graphics.Typeface
import android.os.Build
import android.widget.TextClock
import androidx.annotation.RequiresApi
import androidx.compose.foundation.gestures.detectHorizontalDragGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.gestures.detectVerticalDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.compositeOver
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import com.coleblvck.shelfSlim.contentManagement.getIconMapVector
import com.coleblvck.shelfSlim.contentManagement.remixIcons.RemixIcon
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.Design
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.System
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design.`Quill-pen-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Apps-2-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Dashboard-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Eye-2-fill`
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system.`Eye-close-fill`
import com.coleblvck.shelfSlim.data.tools.ActionType
import com.coleblvck.shelfSlim.data.tools.CustomFunctionToolBox
import com.coleblvck.shelfSlim.data.tools.getActionTypeValue
import com.coleblvck.shelfSlim.state.ShelfPagerState
import com.coleblvck.shelfSlim.userInterface.common.ActionIcon
import com.coleblvck.shelfSlim.userInterface.common.HorizontalSpacer
import com.coleblvck.shelfSlim.userInterface.common.VerticalSpacer
import com.coleblvck.shelfSlim.userInterface.desktop.pages.drawer.DrawerTypeDialog
import com.coleblvck.shelfSlim.userInterface.theme.colorWithAlpha
import com.coleblvck.shelfSlim.utils.Utils
import kotlinx.coroutines.launch


@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun Dashboard(
    pagesPagerState: ShelfPagerState,
    dashboardIsHorizontal: State<Boolean>,
    flowAnimateToNote: () -> Unit,
    systemUiVisibilityToggle: () -> Unit,
    isFlowVisible: State<Boolean>,
    flowVisibilityToggle: () -> Unit,
    isDashboardVisible: State<Boolean>,
    customFunctionAction: State<String>,
    customFunctionIcon: State<String>,
    customFunctionParameter: State<String>,
    customFunctionToolBox: CustomFunctionToolBox,
    currentDrawerType: State<String>,
    updateDrawerType: (String) -> Unit,
    currentDashboardPosition: State<String>,
    updateDashboardPosition: (String) -> Unit,
) {
    val showDrawerTypeDialog = remember {
        mutableStateOf(false)
    }
    val positionSetDialogVisible = remember {
        mutableStateOf(false)
    }
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    fun menuToggleAction() {
        if (pagesPagerState.currentPage == 1) {
            coroutineScope.launch { pagesPagerState.animateScrollToPage(0) }
        } else {
            coroutineScope.launch { pagesPagerState.animateScrollToPage(1) }
        }
    }

    val dashModifier: () -> Modifier = {
        if (dashboardIsHorizontal.value) {
            Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
                .pointerInput(Unit) {
                    detectHorizontalDragGestures { _, dragAmount ->
                        if (dragAmount < -50)
                            customFunctionToolBox.executeAction(
                                getActionTypeValue(customFunctionAction.value),
                                context,
                                customFunctionParameter.value
                            )
                    }
                }
        } else {
            Modifier
                .fillMaxHeight()
                .width(50.dp)
                .padding(vertical = 12.dp)
                .pointerInput(Unit) {
                    detectVerticalDragGestures { _, dragAmount ->
                        if (dragAmount < -50)
                            customFunctionToolBox.executeAction(
                                getActionTypeValue(customFunctionAction.value),
                                context,
                                customFunctionParameter.value
                            )
                    }
                }
        }
    }

    val getSpacer: @Composable () -> Unit = {
        if (dashboardIsHorizontal.value) {
            HorizontalSpacer()
        } else {
            VerticalSpacer()
        }
    }

    val dashContent: @Composable (firstChildModifier: Modifier) -> Unit =
        { firstChildModifier: Modifier ->
            if (dashboardIsHorizontal.value) {
                Box(modifier = firstChildModifier) {
                    DashboardClock(
                        color = MaterialTheme.colorScheme.onTertiary,
                        systemUiVisibilityToggle = systemUiVisibilityToggle,
                    )
                }
            } else {
                VerticalSpacer(firstChildModifier)
            }

            getSpacer()

            ActionIcon(
                vector = RemixIcon.Design.`Quill-pen-fill`,
                action = { flowAnimateToNote() })

            getSpacer()

            ActionIcon(
                vector = if (isFlowVisible.value) {
                    RemixIcon.System.`Eye-2-fill`
                } else {
                    RemixIcon.System.`Eye-close-fill`
                },
                action = { flowVisibilityToggle() }
            )

            if (getActionTypeValue(customFunctionAction.value) != ActionType.NONE) {
                getSpacer()
                ActionIcon(
                    vector = getIconMapVector(customFunctionIcon.value),
                    action = {
                        customFunctionToolBox.executeAction(
                            getActionTypeValue(customFunctionAction.value),
                            context,
                            customFunctionParameter.value
                        )
                    },
                    longPressAction = {
                        customFunctionToolBox.setMappingDialogVisibility(true)
                    }
                )
            }
            getSpacer()
            ActionIcon(
                vector = if (pagesPagerState.currentPage == 1) {
                    RemixIcon.System.`Apps-2-fill`
                } else {
                    RemixIcon.System.`Dashboard-fill`
                },
                action = { menuToggleAction() },
                longPressAction = { showDrawerTypeDialog.value = true }
            )
        }

    when {
        showDrawerTypeDialog.value -> {
            DrawerTypeDialog(
                onDismiss = {
                    showDrawerTypeDialog.value = false
                },
                currentDrawerType = currentDrawerType,
                updateDrawerType = updateDrawerType,
            )
        }
    }

    if (positionSetDialogVisible.value) {
        DashboardPositionSetDialog(
            onDismiss = { positionSetDialogVisible.value = false },
            currentDashboardPosition = currentDashboardPosition,
            updateDashboardPosition = updateDashboardPosition,
        )
    }
    if (isDashboardVisible.value) {
        Card(
            modifier = dashModifier().pointerInput(Unit) {
                detectTapGestures(onDoubleTap = { positionSetDialogVisible.value = true })
            },
            elevation = CardDefaults.elevatedCardElevation(defaultElevation = 1.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorWithAlpha(MaterialTheme.colorScheme.primary).compositeOver(
                    MaterialTheme.colorScheme.primary
                ),
                contentColor = MaterialTheme.colorScheme.onPrimary,
            )
        ) {
            if (dashboardIsHorizontal.value) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 12.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    dashContent(Modifier.weight(1f))
                }
            } else {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = 12.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    dashContent(Modifier.weight(1f))
                }
            }
        }
    }
}

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@Composable
fun DashboardClock(
    color: Color,
    systemUiVisibilityToggle: () -> Unit,
) {
    val context = LocalContext.current
    ElevatedCard(
        colors = CardDefaults.cardColors(
            colorWithAlpha(MaterialTheme.colorScheme.tertiary).compositeOver(MaterialTheme.colorScheme.tertiary),
            MaterialTheme.colorScheme.onPrimary,
            MaterialTheme.colorScheme.primary,
            MaterialTheme.colorScheme.onPrimary
        ),
        shape = RoundedCornerShape(20),
        modifier = Modifier.pointerInput(Unit) {
            detectTapGestures(
                onTap = { Utils.expandStatusBar(context = context) },
                onLongPress = { systemUiVisibilityToggle() }
            )
        }
    ) {
        AndroidView(
            factory = { context ->
                TextClock(context).apply {

                    this.format12Hour = "hh:mm:ss a"
                    this.format24Hour = "kk:mm:ss"

                    timeZone?.let { this.timeZone = it }
                    textSize.let { this.textSize = 24f }
                    setTextColor(color.toArgb())
                    isAllCaps = true
                    typeface = Typeface.DEFAULT_BOLD
                }
            },
            modifier = Modifier.padding(horizontal = 8.dp),
        )
    }
}