package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Clockwise-fill`: ImageVector
    get() {
        if (`_clockwise-fill` != null) {
            return `_clockwise-fill`!!
        }
        `_clockwise-fill` = Builder(name = "Clockwise-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                horizontalLineTo(23.0f)
                lineTo(19.0f, 15.0f)
                lineTo(15.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 6.3432f, 16.6569f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                curveTo(17.7614f, 3.0f, 20.0f, 5.2386f, 20.0f, 8.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(13.0f, 9.0f)
                curveTo(13.5523f, 9.0f, 14.0f, 9.4477f, 14.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(14.0f, 20.5523f, 13.5523f, 21.0f, 13.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 9.4477f, 2.4477f, 9.0f, 3.0f, 9.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_clockwise-fill`!!
    }

private var `_clockwise-fill`: ImageVector? = null
