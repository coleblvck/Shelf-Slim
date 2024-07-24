package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Lock-star-fill`: ImageVector
    get() {
        if (`_lock-star-fill` != null) {
            return `_lock-star-fill`!!
        }
        `_lock-star-fill` = Builder(name = "Lock-star-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(8.6863f, 1.0f, 6.0f, 3.6863f, 6.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 8.0f, 3.0f, 8.4477f, 3.0f, 9.0f)
                verticalLineTo(21.0f)
                curveTo(3.0f, 21.5523f, 3.4477f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(13.044f)
                curveTo(12.6947f, 21.2389f, 12.5f, 20.3922f, 12.5f, 19.5f)
                curveTo(12.5f, 16.1863f, 15.1863f, 13.5f, 18.5f, 13.5f)
                curveTo(19.3922f, 13.5f, 20.2389f, 13.6947f, 21.0f, 14.044f)
                verticalLineTo(9.0f)
                curveTo(21.0f, 8.4477f, 20.5523f, 8.0f, 20.0f, 8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                curveTo(18.0f, 3.6863f, 15.3137f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                curveTo(8.0f, 4.7909f, 9.7909f, 3.0f, 12.0f, 3.0f)
                curveTo(14.2091f, 3.0f, 16.0f, 4.7909f, 16.0f, 7.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(21.145f, 23.1406f)
                lineTo(20.6399f, 20.1953f)
                lineTo(22.7798f, 18.1094f)
                lineTo(19.8225f, 17.6797f)
                lineTo(18.5f, 15.0f)
                lineTo(17.1775f, 17.6797f)
                lineTo(14.2202f, 18.1094f)
                lineTo(16.3601f, 20.1953f)
                lineTo(15.855f, 23.1406f)
                lineTo(18.5f, 21.75f)
                lineTo(21.145f, 23.1406f)
                close()
            }
        }
        .build()
        return `_lock-star-fill`!!
    }

private var `_lock-star-fill`: ImageVector? = null
