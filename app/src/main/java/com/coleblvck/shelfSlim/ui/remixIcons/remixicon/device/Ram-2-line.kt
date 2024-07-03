package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Ram-2-line`: ImageVector
    get() {
        if (`_ram-2-line` != null) {
            return `_ram-2-line`!!
        }
        `_ram-2-line` = Builder(name = "Ram-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                curveTo(1.4477f, 5.0f, 1.0f, 5.4477f, 1.0f, 6.0f)
                verticalLineTo(15.0f)
                curveTo(1.0f, 15.5523f, 1.4477f, 16.0f, 2.0f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 18.5523f, 2.4477f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(10.4142f)
                lineTo(11.4142f, 18.0f)
                horizontalLineTo(12.5858f)
                lineTo(13.5858f, 19.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 19.0f, 22.0f, 18.5523f, 22.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(22.5523f, 16.0f, 23.0f, 15.5523f, 23.0f, 15.0f)
                verticalLineTo(6.0f)
                curveTo(23.0f, 5.4477f, 22.5523f, 5.0f, 22.0f, 5.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(20.0f, 16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.4142f)
                lineTo(13.4142f, 16.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(10.5858f, 16.0f)
                lineTo(9.5858f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.5858f)
                close()
                moveTo(3.0f, 14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(5.0f, 9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(19.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_ram-2-line`!!
    }

private var `_ram-2-line`: ImageVector? = null
