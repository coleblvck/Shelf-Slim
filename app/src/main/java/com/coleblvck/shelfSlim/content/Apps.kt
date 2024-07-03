package com.coleblvck.shelfSlim.content

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.Intent
import android.graphics.drawable.Drawable
import android.net.Uri
import android.provider.Settings
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp


data class App(
    val name: String,
    val packageName: String,
    val icon: Drawable? = null,
    val bitmap: ImageBitmap
)

@Composable
fun AppIcon(
    bitmap: ImageBitmap,
    modifier: Modifier
) {
    Image(
        bitmap = bitmap, contentDescription = "icon",
        contentScale = ContentScale.Crop,
        modifier = modifier
            .padding(8.dp)
            .size(40.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}

fun Context.findActivity(): Activity {
    var context = this
    while (context is ContextWrapper) {
        if (context is Activity) return context
        context = context.baseContext
    }
    throw IllegalStateException("no activity")
}

fun openAppSettings(activity: Activity, app: App) {
    val intent = Intent(
        Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
        Uri.fromParts("package", app.packageName, null)
    )
    activity.startActivity(intent)
}

/*
fun uninstallApp(context: Context, app: App) {
    val intent = Intent(
        Intent.ACTION_DELETE,
        Uri.fromParts("package", app.packageName, null)
    )
    context.startActivity(intent)
}

 */