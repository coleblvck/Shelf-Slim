package com.coleblvck.shelf.utils

import android.annotation.SuppressLint
import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.reflect.Method

class Utils {
    companion object {

        @RequiresApi(Build.VERSION_CODES.TIRAMISU)
        @SuppressLint("WrongConstant")
        fun expandStatusBar(context: Context) {
            val currentApiVersion = Build.VERSION.SDK_INT
            try {
                val service = context.getSystemService(Context.STATUS_BAR_SERVICE)
                val statusBarManager = Class.forName("android.app.StatusBarManager")

                val expandMethod: Method = if (currentApiVersion <= Build.VERSION_CODES.N) {
                    statusBarManager.getMethod("expand")
                } else {
                    statusBarManager.getMethod("expandNotificationsPanel")
                }
                expandMethod.invoke(service)
            } catch (_: Exception) {

            }
        }

        fun launchApp(packageName: String, context: Context): Boolean {
            return try {
                val launchIntent = context.packageManager.getLaunchIntentForPackage(packageName)
                context.startActivity(launchIntent)
                true
            } catch (e: Exception) {
                false
            }
        }
    }
}