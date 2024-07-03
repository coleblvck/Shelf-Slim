package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Delete-back-2-line`: ImageVector
    get() {
        if (`_delete-back-2-line` != null) {
            return `_delete-back-2-line`!!
        }
        `_delete-back-2-line` = Builder(name = "Delete-back-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5345f, 3.0f)
                horizontalLineTo(20.9993f)
                curveTo(21.5516f, 3.0f, 21.9993f, 3.4477f, 21.9993f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.9993f, 20.5523f, 21.5516f, 21.0f, 20.9993f, 21.0f)
                horizontalLineTo(6.5345f)
                curveTo(6.2002f, 21.0f, 5.8879f, 20.8329f, 5.7025f, 20.5547f)
                lineTo(0.3691f, 12.5547f)
                curveTo(0.1452f, 12.2188f, 0.1452f, 11.7812f, 0.3691f, 11.4453f)
                lineTo(5.7025f, 3.4453f)
                curveTo(5.8879f, 3.1671f, 6.2002f, 3.0f, 6.5345f, 3.0f)
                close()
                moveTo(7.0697f, 5.0f)
                lineTo(2.403f, 12.0f)
                lineTo(7.0697f, 19.0f)
                horizontalLineTo(19.9993f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0697f)
                close()
                moveTo(12.9993f, 10.5858f)
                lineTo(15.8277f, 7.7574f)
                lineTo(17.242f, 9.1716f)
                lineTo(14.4135f, 12.0f)
                lineTo(17.242f, 14.8284f)
                lineTo(15.8277f, 16.2426f)
                lineTo(12.9993f, 13.4142f)
                lineTo(10.1709f, 16.2426f)
                lineTo(8.7567f, 14.8284f)
                lineTo(11.5851f, 12.0f)
                lineTo(8.7567f, 9.1716f)
                lineTo(10.1709f, 7.7574f)
                lineTo(12.9993f, 10.5858f)
                close()
            }
        }
        .build()
        return `_delete-back-2-line`!!
    }

private var `_delete-back-2-line`: ImageVector? = null
