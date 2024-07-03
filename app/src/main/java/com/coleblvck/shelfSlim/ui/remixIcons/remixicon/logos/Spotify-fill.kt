package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Spotify-fill`: ImageVector
    get() {
        if (`_spotify-fill` != null) {
            return `_spotify-fill`!!
        }
        `_spotify-fill` = Builder(name = "Spotify-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(6.501f, 2.0f, 2.001f, 6.5f, 2.001f, 12.0f)
                curveTo(2.001f, 17.5f, 6.501f, 22.0f, 12.001f, 22.0f)
                curveTo(17.501f, 22.0f, 22.001f, 17.5f, 22.001f, 12.0f)
                curveTo(22.001f, 6.5f, 17.551f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(15.751f, 16.65f)
                curveTo(13.401f, 15.2f, 10.451f, 14.8992f, 6.9501f, 15.6992f)
                curveTo(6.6018f, 15.8008f, 6.301f, 15.55f, 6.201f, 15.25f)
                curveTo(6.101f, 14.8992f, 6.351f, 14.6f, 6.651f, 14.5f)
                curveTo(10.451f, 13.6492f, 13.751f, 14.0f, 16.351f, 15.6f)
                curveTo(16.701f, 15.75f, 16.7501f, 16.1492f, 16.6018f, 16.45f)
                curveTo(16.4018f, 16.7492f, 16.0518f, 16.85f, 15.751f, 16.65f)
                close()
                moveTo(16.7501f, 13.95f)
                curveTo(14.051f, 12.3f, 9.951f, 11.8f, 6.801f, 12.8f)
                curveTo(6.4018f, 12.9f, 5.951f, 12.7f, 5.851f, 12.3f)
                curveTo(5.751f, 11.9f, 5.951f, 11.4492f, 6.351f, 11.3492f)
                curveTo(10.001f, 10.25f, 14.501f, 10.8008f, 17.601f, 12.7f)
                curveTo(17.9018f, 12.8508f, 18.051f, 13.35f, 17.8018f, 13.7f)
                curveTo(17.551f, 14.05f, 17.101f, 14.2f, 16.7501f, 13.95f)
                close()
                moveTo(6.301f, 9.7508f)
                curveTo(5.801f, 9.9f, 5.301f, 9.6f, 5.151f, 9.15f)
                curveTo(5.001f, 8.6492f, 5.301f, 8.15f, 5.751f, 7.9992f)
                curveTo(9.301f, 6.9492f, 15.151f, 7.1492f, 18.8518f, 9.35f)
                curveTo(19.301f, 9.6f, 19.451f, 10.2f, 19.201f, 10.65f)
                curveTo(18.9518f, 11.0008f, 18.351f, 11.1492f, 17.9018f, 10.9f)
                curveTo(14.701f, 9.0f, 9.351f, 8.8f, 6.301f, 9.7508f)
                close()
            }
        }
        .build()
        return `_spotify-fill`!!
    }

private var `_spotify-fill`: ImageVector? = null
