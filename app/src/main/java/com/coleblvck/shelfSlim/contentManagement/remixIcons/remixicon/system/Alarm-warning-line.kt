package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Alarm-warning-line`: ImageVector
    get() {
        if (`_alarm-warning-line` != null) {
            return `_alarm-warning-line`!!
        }
        `_alarm-warning-line` = Builder(name = "Alarm-warning-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(4.0f, 9.5817f, 7.5817f, 6.0f, 12.0f, 6.0f)
                curveTo(16.4183f, 6.0f, 20.0f, 9.5817f, 20.0f, 14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(6.0f, 20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 10.6863f, 15.3137f, 8.0f, 12.0f, 8.0f)
                curveTo(8.6863f, 8.0f, 6.0f, 10.6863f, 6.0f, 14.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(11.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(19.7782f, 4.8076f)
                lineTo(21.1924f, 6.2218f)
                lineTo(19.0711f, 8.3432f)
                lineTo(17.6569f, 6.9289f)
                lineTo(19.7782f, 4.8076f)
                close()
                moveTo(2.8076f, 6.2218f)
                lineTo(4.2218f, 4.8076f)
                lineTo(6.3432f, 6.9289f)
                lineTo(4.9289f, 8.3432f)
                lineTo(2.8076f, 6.2218f)
                close()
                moveTo(7.0f, 14.0f)
                curveTo(7.0f, 11.2386f, 9.2386f, 9.0f, 12.0f, 9.0f)
                verticalLineTo(11.0f)
                curveTo(10.3432f, 11.0f, 9.0f, 12.3431f, 9.0f, 14.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_alarm-warning-line`!!
    }

private var `_alarm-warning-line`: ImageVector? = null
