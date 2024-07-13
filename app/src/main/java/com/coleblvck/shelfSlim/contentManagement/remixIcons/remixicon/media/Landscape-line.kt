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

public val MediaGroup.`Landscape-line`: ImageVector
    get() {
        if (`_landscape-line` != null) {
            return `_landscape-line`!!
        }
        `_landscape-line` = Builder(name = "Landscape-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.2703f, 12.2162f)
                lineTo(15.0f, 6.0f)
                lineTo(23.0f, 21.0f)
                horizontalLineTo(2.0f)
                lineTo(9.0f, 8.0f)
                lineTo(11.2703f, 12.2162f)
                close()
                moveTo(12.3897f, 14.2378f)
                lineTo(14.9873f, 19.0f)
                horizontalLineTo(19.6667f)
                lineTo(14.8976f, 10.058f)
                lineTo(12.3897f, 14.2378f)
                close()
                moveTo(5.3484f, 19.0f)
                horizontalLineTo(12.6516f)
                lineTo(9.0f, 12.2185f)
                lineTo(5.3484f, 19.0f)
                close()
                moveTo(5.5f, 8.0f)
                curveTo(4.1193f, 8.0f, 3.0f, 6.8807f, 3.0f, 5.5f)
                curveTo(3.0f, 4.1193f, 4.1193f, 3.0f, 5.5f, 3.0f)
                curveTo(6.8807f, 3.0f, 8.0f, 4.1193f, 8.0f, 5.5f)
                curveTo(8.0f, 6.8807f, 6.8807f, 8.0f, 5.5f, 8.0f)
                close()
            }
        }
        .build()
        return `_landscape-line`!!
    }

private var `_landscape-line`: ImageVector? = null
