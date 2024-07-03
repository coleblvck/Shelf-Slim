package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Lock-star-line`: ImageVector
    get() {
        if (`_lock-star-line` != null) {
            return `_lock-star-line`!!
        }
        `_lock-star-line` = Builder(name = "Lock-star-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.0f)
                curveTo(6.0f, 3.6863f, 8.6863f, 1.0f, 12.0f, 1.0f)
                curveTo(15.3137f, 1.0f, 18.0f, 3.6863f, 18.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.5f)
                curveTo(20.3284f, 8.0f, 21.0f, 8.6716f, 21.0f, 9.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.5f)
                curveTo(3.6716f, 22.0f, 3.0f, 21.3284f, 3.0f, 20.5f)
                verticalLineTo(9.5f)
                curveTo(3.0f, 8.6716f, 3.6716f, 8.0f, 4.5f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(16.0f, 4.7909f, 14.2091f, 3.0f, 12.0f, 3.0f)
                curveTo(9.7909f, 3.0f, 8.0f, 4.7909f, 8.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(20.6399f, 20.1953f)
                lineTo(21.145f, 23.1406f)
                lineTo(18.5f, 21.75f)
                lineTo(15.855f, 23.1406f)
                lineTo(16.3601f, 20.1953f)
                lineTo(14.2202f, 18.1094f)
                lineTo(17.1775f, 17.6797f)
                lineTo(18.5f, 15.0f)
                lineTo(19.8225f, 17.6797f)
                lineTo(22.7798f, 18.1094f)
                lineTo(20.6399f, 20.1953f)
                close()
            }
        }
        .build()
        return `_lock-star-line`!!
    }

private var `_lock-star-line`: ImageVector? = null
