package com.coleblvck.shelfSlim.utils


interface DeviceAppsChangedListenerInterface {
    fun onPackageInstalled(packageName: String?)

    fun onPackageUpdated(packageName: String?)

    fun onPackageUninstalled(packageName: String?)

    fun onPackageChanged(packageName: String?)
}