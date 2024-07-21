package com.coleblvck.shelfSlim.contentManagement.listeners.packageChangeListener


interface PackageChangeListenerInterface {
    fun onPackageInstalled(packageName: String?)

    fun onPackageUpdated(packageName: String?)

    fun onPackageUninstalled(packageName: String?)

    fun onPackageChanged(packageName: String?)
}