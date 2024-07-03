package com.coleblvck.shelf.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Rss-line`: ImageVector
    get() {
        if (`_rss-line` != null) {
            return `_rss-line`!!
        }
        `_rss-line` = Builder(name = "Rss-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                curveTo(5.2091f, 17.0f, 7.0f, 18.7909f, 7.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(3.0f, 10.0f)
                curveTo(9.0751f, 10.0f, 14.0f, 14.9249f, 14.0f, 21.0f)
                horizontalLineTo(12.0f)
                curveTo(12.0f, 16.0294f, 7.9706f, 12.0f, 3.0f, 12.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(3.0f, 3.0f)
                curveTo(12.9411f, 3.0f, 21.0f, 11.0589f, 21.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 12.1634f, 11.8366f, 5.0f, 3.0f, 5.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return `_rss-line`!!
    }

private var `_rss-line`: ImageVector? = null
