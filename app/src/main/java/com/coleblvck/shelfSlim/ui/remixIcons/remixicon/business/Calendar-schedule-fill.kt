package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Calendar-schedule-fill`: ImageVector
    get() {
        if (`_calendar-schedule-fill` != null) {
            return `_calendar-schedule-fill`!!
        }
        `_calendar-schedule-fill` = Builder(name = "Calendar-schedule-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(10.7546f)
                curveTo(9.6567f, 19.6304f, 9.0f, 17.8919f, 9.0f, 16.0f)
                curveTo(9.0f, 11.5817f, 12.5817f, 8.0f, 17.0f, 8.0f)
                curveTo(18.8919f, 8.0f, 20.6304f, 8.6567f, 22.0f, 9.7546f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.4477f, 21.5523f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(23.0f, 16.0f)
                curveTo(23.0f, 19.3137f, 20.3137f, 22.0f, 17.0f, 22.0f)
                curveTo(13.6863f, 22.0f, 11.0f, 19.3137f, 11.0f, 16.0f)
                curveTo(11.0f, 12.6863f, 13.6863f, 10.0f, 17.0f, 10.0f)
                curveTo(20.3137f, 10.0f, 23.0f, 12.6863f, 23.0f, 16.0f)
                close()
                moveTo(16.0f, 12.0f)
                verticalLineTo(16.4142f)
                lineTo(18.2929f, 18.7071f)
                lineTo(19.7071f, 17.2929f)
                lineTo(18.0f, 15.5858f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_calendar-schedule-fill`!!
    }

private var `_calendar-schedule-fill`: ImageVector? = null
