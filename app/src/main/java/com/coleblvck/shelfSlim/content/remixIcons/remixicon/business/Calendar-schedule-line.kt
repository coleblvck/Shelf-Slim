package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Calendar-schedule-line`: ImageVector
    get() {
        if (`_calendar-schedule-line` != null) {
            return `_calendar-schedule-line`!!
        }
        `_calendar-schedule-line` = Builder(name = "Calendar-schedule-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(14.7909f, 12.0f, 13.0f, 13.7909f, 13.0f, 16.0f)
                curveTo(13.0f, 18.2091f, 14.7909f, 20.0f, 17.0f, 20.0f)
                curveTo(19.2091f, 20.0f, 21.0f, 18.2091f, 21.0f, 16.0f)
                curveTo(21.0f, 13.7909f, 19.2091f, 12.0f, 17.0f, 12.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 12.6863f, 13.6863f, 10.0f, 17.0f, 10.0f)
                curveTo(20.3137f, 10.0f, 23.0f, 12.6863f, 23.0f, 16.0f)
                curveTo(23.0f, 19.3137f, 20.3137f, 22.0f, 17.0f, 22.0f)
                curveTo(13.6863f, 22.0f, 11.0f, 19.3137f, 11.0f, 16.0f)
                close()
                moveTo(16.0f, 13.0f)
                verticalLineTo(16.4142f)
                lineTo(18.2929f, 18.7071f)
                lineTo(19.7071f, 17.2929f)
                lineTo(18.0f, 15.5858f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_calendar-schedule-line`!!
    }

private var `_calendar-schedule-line`: ImageVector? = null
