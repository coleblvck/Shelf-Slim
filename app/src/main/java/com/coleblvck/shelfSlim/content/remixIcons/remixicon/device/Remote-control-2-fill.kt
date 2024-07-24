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

public val DeviceGroup.`Remote-control-2-fill`: ImageVector
    get() {
        if (`_remote-control-2-fill` != null) {
            return `_remote-control-2-fill`!!
        }
        `_remote-control-2-fill` = Builder(name = "Remote-control-2-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                curveTo(18.5523f, 2.0f, 19.0f, 2.4477f, 19.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.5523f, 18.5523f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 22.0f, 5.0f, 21.5523f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 2.4477f, 5.4477f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(15.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(13.0f, 6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.999f)
                lineTo(11.0f, 12.0f)
                horizontalLineTo(13.0f)
                lineTo(12.999f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return `_remote-control-2-fill`!!
    }

private var `_remote-control-2-fill`: ImageVector? = null
