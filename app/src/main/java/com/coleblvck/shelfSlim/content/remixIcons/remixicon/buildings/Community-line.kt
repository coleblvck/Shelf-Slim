package com.coleblvck.shelfSlim.content.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Community-line`: ImageVector
    get() {
        if (`_community-line` != null) {
            return `_community-line`!!
        }
        `_community-line` = Builder(name = "Community-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(12.4868f)
                curveTo(2.0f, 12.1978f, 2.125f, 11.9229f, 2.3428f, 11.733f)
                lineTo(6.0f, 8.5443f)
                verticalLineTo(4.0f)
                curveTo(6.0f, 3.4477f, 6.4477f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                close()
                moveTo(9.0f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.9416f)
                lineTo(8.0f, 9.454f)
                lineTo(4.0f, 12.9416f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(14.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.1273f)
                curveTo(8.2344f, 7.1273f, 8.4689f, 7.2094f, 8.6572f, 7.3735f)
                lineTo(13.6572f, 11.733f)
                curveTo(13.875f, 11.9229f, 14.0f, 12.1978f, 14.0f, 12.4868f)
                verticalLineTo(19.0f)
                close()
                moveTo(16.0f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(16.0f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(16.0f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(12.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_community-line`!!
    }

private var `_community-line`: ImageVector? = null
