package com.coleblvck.shelfSlim.userInterface.widgets

import android.app.Activity
import android.appwidget.AppWidgetProviderInfo
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.RequiresApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.coleblvck.shelfSlim.state.LocalWidgetData
import com.coleblvck.shelfSlim.userInterface.widgets.management.AppWidgetData
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.IntentExtraName
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.WidgetSelectionActivity

@RequiresApi(Build.VERSION_CODES.S)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun WidgetSelectionSheet(
    isWidgetSelectionSheetVisible: State<Boolean>,
    onDismiss: () -> Unit,
    sheetState: SheetState,
) {
    val widgetData = LocalWidgetData.current
    val widgetsState = widgetData.widgetsState
    val userWidgets = widgetsState.userWidgets.widgets
    val density = LocalDensity.current
    val context = LocalContext.current
    val widgetTool = widgetData.widgetTool
    val widgetPreviews = widgetTool.getAllPreviewData(context.applicationContext, density)
    val packageManager = context.packageManager
    val startForResult =
        rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) { result: ActivityResult ->
            if (result.resultCode == Activity.RESULT_OK) {
                val intent = result.data
                if (intent != null) {
                    val intentWidgetId = intent.getIntExtra(IntentExtraName.WIDGET_ID_EXTRA, -1)
                    val intentProviderInfo =
                        intent.getParcelableExtra<AppWidgetProviderInfo>(IntentExtraName.PROVIDER_INFO_EXTRA)!!
                    val widgetData = AppWidgetData(
                        appName = packageManager.getApplicationInfo(
                            intentProviderInfo.provider.packageName,
                            PackageManager.GET_META_DATA
                        ).loadLabel(packageManager).toString(),
                        widgetLabel = intentProviderInfo.loadLabel(packageManager),
                        providerInfo = intentProviderInfo,
                        appWidgetId = intentWidgetId,
                        icon = widgetTool.getWidgetIcon(
                            context.applicationContext,
                            intentProviderInfo,
                            1
                        ),
                        previewImage = widgetTool.getWidgetPreviewDrawable(
                            context.applicationContext,
                            intentProviderInfo,
                            1
                        ),
                        isPreview = false
                    )
                    widgetsState.helper.addUserWidget(widgetData)
                }
            }
        }

    fun initiateWidgetAdd(providerInfo: AppWidgetProviderInfo) {
        val intent = Intent(context, WidgetSelectionActivity::class.java)
        intent.putExtra(IntentExtraName.PROVIDER_INFO_EXTRA, providerInfo)
        startForResult.launch(intent)
    }
    if (isWidgetSelectionSheetVisible.value) {
        ModalBottomSheet(
            onDismissRequest = onDismiss,
            sheetState = sheetState,
            shape = RoundedCornerShape(
                topStart = CornerSize(12.dp),
                topEnd = CornerSize(12.dp),
                bottomStart = CornerSize(0.dp),
                bottomEnd = CornerSize(0.dp)
            ),
            dragHandle = null,
            containerColor = MaterialTheme.colorScheme.tertiary,
            contentColor = MaterialTheme.colorScheme.onTertiary
        ) {
            Box(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                LazyColumn(
                    modifier = Modifier.fillMaxSize(),
                    state = rememberLazyListState(),
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    if (userWidgets.value.isNotEmpty()) {
                        item {
                            Text(
                                color = MaterialTheme.colorScheme.onTertiary,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .wrapContentHeight(align = Alignment.CenterVertically),
                                textAlign = TextAlign.Center,
                                fontSize = 24.sp,
                                fontWeight = FontWeight(500),
                                text = "Current Widgets",
                            )
                        }
                        items(
                            userWidgets.value,
                            key = { it.appWidgetId },
                            itemContent = {
                                WidgetView(
                                    modifier = Modifier
                                        .fillMaxWidth(), appWidgetData = it,
                                    isEditPreview = true
                                )
                            }
                        )
                        item {
                            Divider(
                                thickness = 10.dp,
                                color = MaterialTheme.colorScheme.onTertiary
                            )
                        }

                    }
                    item {
                        Text(
                            color = MaterialTheme.colorScheme.onTertiary,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight(align = Alignment.CenterVertically),
                            textAlign = TextAlign.Center,
                            fontSize = 24.sp,
                            fontWeight = FontWeight(500),
                            text = "Add Widgets",
                        )
                    }
                    items(
                        widgetPreviews,
                        key = { it.providerInfo.provider.className },
                        itemContent = {
                            WidgetView(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .clickable {
                                        initiateWidgetAdd(it.providerInfo)
                                        onDismiss()
                                    },
                                appWidgetData = it
                            )
                        }
                    )
                }
            }
        }
    }
}