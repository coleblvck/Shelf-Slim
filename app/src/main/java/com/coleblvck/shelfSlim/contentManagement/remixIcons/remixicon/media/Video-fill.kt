package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Video-fill`: ImageVector
    get() {
        if (`_video-fill` != null) {
            return `_video-fill`!!
        }
        `_video-fill` = Builder(name = "Video-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.9934f)
                curveTo(3.0f, 3.4448f, 3.445f, 3.0f, 3.9934f, 3.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5552f, 3.0f, 21.0f, 3.445f, 21.0f, 3.9934f)
                verticalLineTo(20.0066f)
                curveTo(21.0f, 20.5552f, 20.5551f, 21.0f, 20.0066f, 21.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 21.0f, 3.0f, 20.5551f, 3.0f, 20.0066f)
                verticalLineTo(3.9934f)
                close()
                moveTo(10.6219f, 8.4146f)
                curveTo(10.5562f, 8.3708f, 10.479f, 8.3474f, 10.4f, 8.3474f)
                curveTo(10.1791f, 8.3474f, 10.0f, 8.5265f, 10.0f, 8.7474f)
                verticalLineTo(15.2526f)
                curveTo(10.0f, 15.3316f, 10.0234f, 15.4088f, 10.0672f, 15.4745f)
                curveTo(10.1897f, 15.6583f, 10.4381f, 15.708f, 10.6219f, 15.5854f)
                lineTo(15.5008f, 12.3328f)
                curveTo(15.5447f, 12.3035f, 15.5824f, 12.2658f, 15.6117f, 12.2219f)
                curveTo(15.7343f, 12.0381f, 15.6846f, 11.7897f, 15.5008f, 11.6672f)
                lineTo(10.6219f, 8.4146f)
                close()
            }
        }
        .build()
        return `_video-fill`!!
    }

private var `_video-fill`: ImageVector? = null
