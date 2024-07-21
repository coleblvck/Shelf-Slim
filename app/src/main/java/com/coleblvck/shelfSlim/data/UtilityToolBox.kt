package com.coleblvck.shelfSlim.data

import android.content.pm.PackageManager
import com.coleblvck.shelfSlim.Shelf
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.WidgetTool
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.widgetHost
import com.coleblvck.shelfSlim.userInterface.widgets.management.utilities.widgetTool.widgetManager

class UtilityToolBox(val shelf: Shelf) {
    val appPackageName: String = shelf.applicationContext.packageName
    val packageManager: PackageManager = shelf.applicationContext.applicationContext.packageManager
    val widgetTool: WidgetTool = WidgetTool(
        host = shelf.applicationContext.widgetHost,
        manager = shelf.applicationContext.widgetManager
    )
}