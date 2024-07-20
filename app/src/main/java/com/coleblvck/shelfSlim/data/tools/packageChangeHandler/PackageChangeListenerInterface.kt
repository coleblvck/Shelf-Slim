package com.coleblvck.shelfSlim.data.tools.packageChangeHandler


interface PackageChangeListenerInterface {
    fun onPackageInstalled(packageName: String?)

    fun onPackageUpdated(packageName: String?)

    fun onPackageUninstalled(packageName: String?)

    fun onPackageChanged(packageName: String?)
}