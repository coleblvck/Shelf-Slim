package com.coleblvck.shelfSlim.contentManagement.listeners

import android.content.Context
import com.coleblvck.shelfSlim.contentManagement.listeners.packageChangeListener.PackageChangeListener
import com.coleblvck.shelfSlim.contentManagement.listeners.packageChangeListener.PackageUpdateHandler

class Listeners (updateContent: () -> Unit) {
    private val packageChangeListener = PackageChangeListener(PackageUpdateHandler(updateContent))

    fun register(context: Context) {
        packageChangeListener.register(context.applicationContext)
    }
}