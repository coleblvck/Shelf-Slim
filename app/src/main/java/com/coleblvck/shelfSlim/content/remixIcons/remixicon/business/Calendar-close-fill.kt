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

public val BusinessGroup.`Calendar-close-fill`: ImageVector
    get() {
        if (`_calendar-close-fill` != null) {
            return `_calendar-close-fill`!!
        }
        `_calendar-close-fill` = Builder(name = "Calendar-close-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 3.0f, 2.0f, 3.4477f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.5523f, 2.4477f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 21.0f, 22.0f, 20.5523f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.4477f, 21.5523f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(1.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(4.0f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(9.8785f, 9.9643f)
                lineTo(11.9999f, 12.0858f)
                lineTo(14.1211f, 9.9643f)
                lineTo(15.5354f, 11.3785f)
                lineTo(13.4141f, 13.5f)
                lineTo(15.5353f, 15.6211f)
                lineTo(14.1212f, 17.0354f)
                lineTo(11.9999f, 14.9142f)
                lineTo(9.8785f, 17.0354f)
                lineTo(8.4643f, 15.6211f)
                lineTo(10.5856f, 13.5f)
                lineTo(8.4643f, 11.3785f)
                lineTo(9.8785f, 9.9643f)
                close()
            }
        }
        .build()
        return `_calendar-close-fill`!!
    }

private var `_calendar-close-fill`: ImageVector? = null
