package com.coleblvck.shelfSlim.utils

import com.coleblvck.shelfSlim.state.ShelfViewModel


class PackageUpdateHandler(private val shelfViewModel: ShelfViewModel) : PackageChangeListenerInterface {
    override fun onPackageInstalled(packageName: String?) {
        shelfViewModel.updateShelfContent()
    }

    override fun onPackageUpdated(packageName: String?) {
        shelfViewModel.updateShelfContent()
    }

    override fun onPackageUninstalled(packageName: String?) {
        shelfViewModel.updateShelfContent()
    }

    override fun onPackageChanged(packageName: String?) {
        shelfViewModel.updateShelfContent()
    }
}