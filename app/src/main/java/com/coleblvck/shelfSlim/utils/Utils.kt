package com.coleblvck.shelfSlim.utils

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Build
import android.provider.Settings
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

        fun openAppSettings(packageName: String, context: Context): Boolean {
            return try {
                val intent = Intent().apply {
                    flags = Intent.FLAG_ACTIVITY_NEW_TASK
                    action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                    data = Uri.fromParts("package", packageName, null)
                }
                context.startActivity(intent)
                true

            } catch (e: Exception) {
                false
            }
        }


        fun uninstallApp(packageName: String, context: Context) {
            val intent = Intent(
                Intent.ACTION_DELETE,
                Uri.fromParts("package", packageName, null)
            )
            context.startActivity(intent)
        }

        fun launchWebSearch(text: String, context: Context) {
            var url: String? = null
            url = if (text.contains(".") && !text.contains(" ") && !text.endsWith(".")) {
                if (!text.startsWith("http://") && !text.startsWith("https://")) {
                    "https://$text"
                } else {
                    text
                }
            } else {
                "https://www.google.com/search?q=$text"
            }
            val webSearchIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            context.startActivity(webSearchIntent)
        }

        fun drawableToBitmap(drawable: Drawable, inWidth: Int, inHeight: Int): Bitmap {
            if (drawable is BitmapDrawable) {
                return drawable.bitmap
            }

            var width = drawable.intrinsicWidth
            width = if (width > 0) width else inWidth
            var height = drawable.intrinsicHeight
            height = if (height > 0) height else inHeight

            val bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
            val canvas: Canvas = Canvas(bitmap)
            drawable.setBounds(0, 0, canvas.width, canvas.height)
            drawable.draw(canvas)

            return bitmap
        }
    }
}