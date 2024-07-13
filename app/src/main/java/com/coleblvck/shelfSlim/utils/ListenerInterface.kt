package com.coleblvck.shelfSlim.utils


interface PackageChangeListenerInterface {
    fun onPackageInstalled(packageName: String?)

    fun onPackageUpdated(packageName: String?)

    fun onPackageUninstalled(packageName: String?)

    fun onPackageChanged(packageName: String?)
}