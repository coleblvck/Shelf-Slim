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

public val DeviceGroup.`Battery-share-line`: ImageVector
    get() {
        if (`_battery-share-line` != null) {
            return `_battery-share-line`!!
        }
        `_battery-share-line` = Builder(name = "Battery-share-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                curveTo(14.5523f, 2.0f, 15.0f, 2.4477f, 15.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 4.0f, 19.0f, 4.4477f, 19.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
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
                moveTo(15.0f, 8.0f)
                lineTo(20.0f, 12.0f)
                lineTo(15.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                curveTo(12.9456f, 13.0f, 12.0f, 13.95f, 12.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                curveTo(10.0f, 12.7909f, 11.7909f, 11.0f, 14.0f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return `_battery-share-line`!!
    }

private var `_battery-share-line`: ImageVector? = null
