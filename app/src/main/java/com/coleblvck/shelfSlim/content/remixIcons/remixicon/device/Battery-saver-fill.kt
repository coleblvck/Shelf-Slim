package com.coleblvck.shelfSlim.content.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Battery-saver-fill`: ImageVector
    get() {
        if (`_battery-saver-fill` != null) {
            return `_battery-saver-fill`!!
        }
        `_battery-saver-fill` = Builder(name = "Battery-saver-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                curveTo(14.5523f, 2.0f, 15.0f, 2.4477f, 15.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 4.0f, 19.0f, 4.4477f, 19.0f, 5.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.5523f, 18.5523f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 22.0f, 5.0f, 21.5523f, 5.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 4.4477f, 5.4477f, 4.0f, 6.0f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                curveTo(9.0f, 2.4477f, 9.4477f, 2.0f, 10.0f, 2.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(13.0f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_battery-saver-fill`!!
    }

private var `_battery-saver-fill`: ImageVector? = null
