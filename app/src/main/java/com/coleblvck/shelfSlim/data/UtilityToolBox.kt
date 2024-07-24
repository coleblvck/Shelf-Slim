package com.coleblvck.shelfSlim.data

import android.content.pm.PackageManager
import com.coleblvck.shelfSlim.Shelf
import com.coleblvck.shelfSlim.state.stateTools.widgets.WidgetTool
import com.coleblvck.shelfSlim.state.stateTools.widgets.widgetHost
import com.coleblvck.shelfSlim.state.stateTools.widgets.widgetManager

class UtilityToolBox(val shelf: Shelf) {
    val appPackageName: String = shelf.applicationContext.packageName
    val packageManager: PackageManager = shelf.applicationContext.applicationContext.packageManager
    val widgetTool: WidgetTool = WidgetTool(
        host = shelf.applicationContext.widgetHost,
        manager = shelf.applicationContext.widgetManager
    )
}