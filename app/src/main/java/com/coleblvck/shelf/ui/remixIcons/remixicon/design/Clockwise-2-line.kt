package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Clockwise-2-line`: ImageVector
    get() {
        if (`_clockwise-2-line` != null) {
            return `_clockwise-2-line`!!
        }
        `_clockwise-2-line` = Builder(name = "Clockwise-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5858f, 4.0f)
                lineTo(8.7574f, 2.1716f)
                lineTo(10.1716f, 0.7574f)
                lineTo(14.4142f, 5.0f)
                lineTo(10.1716f, 9.2427f)
                lineTo(8.7574f, 7.8285f)
                lineTo(10.5858f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(6.3432f, 6.0f, 5.0f, 7.3432f, 5.0f, 9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 6.2386f, 5.2386f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(10.5858f)
                close()
                moveTo(9.0f, 11.0f)
                curveTo(9.0f, 10.4477f, 9.4477f, 10.0f, 10.0f, 10.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 10.0f, 21.0f, 10.4477f, 21.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 22.0f, 9.0f, 21.5523f, 9.0f, 21.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(11.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_clockwise-2-line`!!
    }

private var `_clockwise-2-line`: ImageVector? = null
