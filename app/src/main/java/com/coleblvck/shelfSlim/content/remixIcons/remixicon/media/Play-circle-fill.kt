package com.coleblvck.shelfSlim.content.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Play-circle-fill`: ImageVector
    get() {
        if (`_play-circle-fill` != null) {
            return `_play-circle-fill`!!
        }
        `_play-circle-fill` = Builder(name = "Play-circle-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
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
        return `_play-circle-fill`!!
    }

private var `_play-circle-fill`: ImageVector? = null
