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

public val DesignGroup.`Anticlockwise-2-line`: ImageVector
    get() {
        if (`_anticlockwise-2-line` != null) {
            return `_anticlockwise-2-line`!!
        }
        `_anticlockwise-2-line` = Builder(name = "Anticlockwise-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4142f, 6.0f)
                lineTo(15.2426f, 7.8284f)
                lineTo(13.8284f, 9.2426f)
                lineTo(9.5858f, 5.0f)
                lineTo(13.8284f, 0.7573f)
                lineTo(15.2426f, 2.1715f)
                lineTo(13.4142f, 4.0f)
                horizontalLineTo(16.0f)
                curveTo(18.7614f, 4.0f, 21.0f, 6.2385f, 21.0f, 9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 7.3431f, 17.6569f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(13.4142f)
                close()
                moveTo(15.0f, 11.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 21.5522f, 14.5523f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5522f, 3.0f, 21.0f)
                verticalLineTo(11.0f)
                curveTo(3.0f, 10.4477f, 3.4477f, 10.0f, 4.0f, 10.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 10.0f, 15.0f, 10.4477f, 15.0f, 11.0f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_anticlockwise-2-line`!!
    }

private var `_anticlockwise-2-line`: ImageVector? = null
