package com.coleblvck.shelf.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Ram-line`: ImageVector
    get() {
        if (`_ram-line` != null) {
            return `_ram-line`!!
        }
        `_ram-line` = Builder(name = "Ram-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(2.0f, 5.0f)
                curveTo(1.4477f, 5.0f, 1.0f, 5.4477f, 1.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 18.5523f, 1.4477f, 19.0f, 2.0f, 19.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 19.0f, 23.0f, 18.5523f, 23.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(23.0f, 5.4477f, 22.5523f, 5.0f, 22.0f, 5.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_ram-line`!!
    }

private var `_ram-line`: ImageVector? = null
