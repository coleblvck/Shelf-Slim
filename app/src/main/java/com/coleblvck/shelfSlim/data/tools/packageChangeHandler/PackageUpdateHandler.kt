package com.coleblvck.shelfSlim.data.tools.packageChangeHandler


class PackageUpdateHandler(private val updateContent: () -> Unit) :
    PackageChangeListenerInterface {
    override fun onPackageInstalled(packageName: String?) {
        updateContent()
    }

    override fun onPackageUpdated(packageName: String?) {
        updateContent()
    }

    override fun onPackageUninstalled(packageName: String?) {
       updateContent()
    }

    override fun onPackageChanged(packageName: String?) {
        updateContent()
    }
}