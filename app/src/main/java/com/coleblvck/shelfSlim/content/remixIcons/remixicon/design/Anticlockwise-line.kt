package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Anticlockwise-line`: ImageVector
    get() {
        if (`_anticlockwise-line` != null) {
            return `_anticlockwise-line`!!
        }
        `_anticlockwise-line` = Builder(name = "Anticlockwise-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5522f, 9.0f, 22.0f, 9.4477f, 22.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5522f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(10.4477f, 21.0f, 10.0f, 20.5523f, 10.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(10.0f, 9.4477f, 10.4477f, 9.0f, 11.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(6.0f, 10.5858f)
                lineTo(7.8284f, 8.7574f)
                lineTo(9.2426f, 10.1716f)
                lineTo(5.0f, 14.4142f)
                lineTo(0.7573f, 10.1716f)
                lineTo(2.1715f, 8.7574f)
                lineTo(4.0f, 10.5858f)
                verticalLineTo(8.0f)
                curveTo(4.0f, 5.2386f, 6.2385f, 3.0f, 9.0f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                curveTo(7.3431f, 5.0f, 6.0f, 6.3432f, 6.0f, 8.0f)
                verticalLineTo(10.5858f)
                close()
            }
        }
        .build()
        return `_anticlockwise-line`!!
    }

private var `_anticlockwise-line`: ImageVector? = null
