package com.coleblvck.shelfSlim.data.classes

import android.graphics.drawable.Drawable
import androidx.compose.runtime.Immutable

@Immutable
data class App(
    val name: String,
    val packageName: String,
    val activityName: String,
    val icon: Drawable,
)