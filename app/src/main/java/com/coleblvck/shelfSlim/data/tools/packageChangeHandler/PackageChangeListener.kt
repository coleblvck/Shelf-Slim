package com.coleblvck.shelfSlim.data.tools.packageChangeHandler

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter


class PackageChangeListener(private val callback: PackageChangeListenerInterface) {

    private var appsBroadcastReceiver: BroadcastReceiver? = null

    fun register(context: Context) {
        if (appsBroadcastReceiver == null) {
            createBroadcastReceiver()
        }

        val intentFilter = IntentFilter()
        intentFilter.addAction(Intent.ACTION_PACKAGE_ADDED)
        intentFilter.addAction(Intent.ACTION_PACKAGE_REPLACED)
        intentFilter.addAction(Intent.ACTION_PACKAGE_CHANGED)
        intentFilter.addAction(Intent.ACTION_PACKAGE_REMOVED)
        intentFilter.addDataScheme("package")


        context.registerReceiver(appsBroadcastReceiver, intentFilter)
    }

    private fun createBroadcastReceiver() {
        appsBroadcastReceiver = object : BroadcastReceiver() {
            override fun onReceive(context: Context, intent: Intent) {

                val packageName = intent.dataString!!.replace("package:", "")

                val replacing = intent.extras!!
                    .getBoolean(Intent.EXTRA_REPLACING, false)

                when (intent.action) {
                    Intent.ACTION_PACKAGE_ADDED -> if (!replacing) {
                        onPackageInstalled(packageName)
                    }

                    Intent.ACTION_PACKAGE_REPLACED -> onPackageUpdated(packageName)
                    Intent.ACTION_PACKAGE_CHANGED -> {
                        val components =
                            intent.extras!!.getStringArray(Intent.EXTRA_CHANGED_COMPONENT_NAME_LIST)
                        if (components!!.size == 1 && components[0].equals(
                                packageName,
                                ignoreCase = true
                            )
                        ) {
                            onPackageChanged(packageName)
                        }
                    }

                    Intent.ACTION_PACKAGE_REMOVED -> if (!replacing) {
                        onPackageUninstalled(packageName)
                    }
                }
            }
        }
    }
    fun onPackageInstalled(packageName: String?) {
            callback.onPackageInstalled(packageName)
    }

    fun onPackageUpdated(packageName: String?) {
            callback.onPackageUpdated(packageName)
    }

    fun onPackageUninstalled(packageName: String?) {
            callback.onPackageUninstalled(packageName)
    }

    fun onPackageChanged(packageName: String?) {
            callback.onPackageChanged(packageName)

    }

    fun unregister(context: Context) {
        if (appsBroadcastReceiver != null) {
            context.unregisterReceiver(appsBroadcastReceiver)
        }
    }

}