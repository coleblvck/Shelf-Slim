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

public val SystemGroup.`Lock-2-fill`: ImageVector
    get() {
        if (`_lock-2-fill` != null) {
            return `_lock-2-fill`!!
        }
        `_lock-2-fill` = Builder(name = "Lock-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 8.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 8.0f, 21.0f, 8.4477f, 21.0f, 9.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 8.4477f, 3.4477f, 8.0f, 4.0f, 8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 3.6863f, 8.6863f, 1.0f, 12.0f, 1.0f)
                curveTo(15.3137f, 1.0f, 18.0f, 3.6863f, 18.0f, 7.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(11.0f, 15.7324f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.7324f)
                curveTo(13.5978f, 15.3866f, 14.0f, 14.7403f, 14.0f, 14.0f)
                curveTo(14.0f, 12.8954f, 13.1046f, 12.0f, 12.0f, 12.0f)
                curveTo(10.8954f, 12.0f, 10.0f, 12.8954f, 10.0f, 14.0f)
                curveTo(10.0f, 14.7403f, 10.4022f, 15.3866f, 11.0f, 15.7324f)
                close()
                moveTo(16.0f, 8.0f)
                verticalLineTo(7.0f)
                curveTo(16.0f, 4.7909f, 14.2091f, 3.0f, 12.0f, 3.0f)
                curveTo(9.7909f, 3.0f, 8.0f, 4.7909f, 8.0f, 7.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_lock-2-fill`!!
    }

private var `_lock-2-fill`: ImageVector? = null
