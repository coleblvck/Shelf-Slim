package com.coleblvck.shelfSlim.data

import android.content.Context
import android.content.pm.PackageManager

class UtilityToolBox (context: Context) {
    val appPackageName: String = context.packageName
    val packageManager: PackageManager = context.applicationContext.packageManager
}