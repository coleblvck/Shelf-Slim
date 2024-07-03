package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Alarm-line`: ImageVector
    get() {
        if (`_alarm-line` != null) {
            return `_alarm-line`!!
        }
        `_alarm-line` = Builder(name = "Alarm-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 22.0001f)
                curveTo(7.0296f, 22.0001f, 3.0001f, 17.9707f, 3.0001f, 13.0001f)
                curveTo(3.0001f, 8.0296f, 7.0296f, 4.0001f, 12.0001f, 4.0001f)
                curveTo(16.9707f, 4.0001f, 21.0001f, 8.0296f, 21.0001f, 13.0001f)
                curveTo(21.0001f, 17.9707f, 16.9707f, 22.0001f, 12.0001f, 22.0001f)
                close()
                moveTo(12.0001f, 20.0001f)
                curveTo(15.8661f, 20.0001f, 19.0001f, 16.8661f, 19.0001f, 13.0001f)
                curveTo(19.0001f, 9.1341f, 15.8661f, 6.0001f, 12.0001f, 6.0001f)
                curveTo(8.1341f, 6.0001f, 5.0001f, 9.1341f, 5.0001f, 13.0001f)
                curveTo(5.0001f, 16.8661f, 8.1341f, 20.0001f, 12.0001f, 20.0001f)
                close()
                moveTo(13.0001f, 13.0001f)
                horizontalLineTo(16.0001f)
                verticalLineTo(15.0001f)
                horizontalLineTo(11.0001f)
                verticalLineTo(8.0001f)
                horizontalLineTo(13.0001f)
                verticalLineTo(13.0001f)
                close()
                moveTo(1.7471f, 6.2826f)
                lineTo(5.2826f, 2.7471f)
                lineTo(6.6968f, 4.1613f)
                lineTo(3.1613f, 7.6968f)
                lineTo(1.7471f, 6.2826f)
                close()
                moveTo(18.7176f, 2.7471f)
                lineTo(22.2532f, 6.2826f)
                lineTo(20.839f, 7.6968f)
                lineTo(17.3034f, 4.1613f)
                lineTo(18.7176f, 2.7471f)
                close()
            }
        }
        .build()
        return `_alarm-line`!!
    }

private var `_alarm-line`: ImageVector? = null
