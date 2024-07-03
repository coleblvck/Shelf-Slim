package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Calendar-check-fill`: ImageVector
    get() {
        if (`_calendar-check-fill` != null) {
            return `_calendar-check-fill`!!
        }
        `_calendar-check-fill` = Builder(name = "Calendar-check-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 1.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(20.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(15.0355f, 10.136f)
                lineTo(16.4497f, 11.5503f)
                lineTo(11.5f, 16.5f)
                lineTo(7.9645f, 12.9645f)
                lineTo(9.3787f, 11.5503f)
                lineTo(11.5f, 13.6716f)
                lineTo(15.0355f, 10.136f)
                close()
            }
        }
        .build()
        return `_calendar-check-fill`!!
    }

private var `_calendar-check-fill`: ImageVector? = null
