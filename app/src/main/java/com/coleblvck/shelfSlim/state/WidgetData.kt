package com.coleblvck.shelfSlim.state

import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.WidgetTool
import com.coleblvck.shelfSlim.userInterface.widgets.state.WidgetsState

data class WidgetData(
    val widgetsState: WidgetsState,
    val widgetTool: WidgetTool,
)