package com.coleblvck.shelfSlim.state

import android.content.Context
import com.coleblvck.shelfSlim.data.tools.packageChangeHandler.PackageChangeListener
import com.coleblvck.shelfSlim.data.tools.packageChangeHandler.PackageUpdateHandler

class Listeners (updateContent: () -> Unit) {
    private val packageChangeListener = PackageChangeListener(PackageUpdateHandler(updateContent))

    fun register(context: Context) {
        packageChangeListener.register(context.applicationContext)
    }
}