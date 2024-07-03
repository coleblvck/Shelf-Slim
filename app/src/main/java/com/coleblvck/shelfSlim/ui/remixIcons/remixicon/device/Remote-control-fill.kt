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

public val DeviceGroup.`Remote-control-fill`: ImageVector
    get() {
        if (`_remote-control-fill` != null) {
            return `_remote-control-fill`!!
        }
        `_remote-control-fill` = Builder(name = "Remote-control-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0001f, 12.0f)
                curveTo(17.5524f, 12.0f, 18.0001f, 12.4477f, 18.0001f, 13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0002f)
                verticalLineTo(13.0f)
                curveTo(6.0002f, 12.4477f, 6.4479f, 12.0f, 7.0002f, 12.0f)
                horizontalLineTo(17.0001f)
                close()
                moveTo(10.0001f, 14.0f)
                horizontalLineTo(8.0001f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0001f)
                verticalLineTo(14.0f)
                close()
                moveTo(12.0001f, 6.0f)
                curveTo(14.3491f, 6.0f, 16.3827f, 7.3498f, 17.3678f, 9.316f)
                lineTo(15.5787f, 10.2108f)
                curveTo(14.922f, 8.8999f, 13.5662f, 8.0f, 12.0001f, 8.0f)
                curveTo(10.4341f, 8.0f, 9.0783f, 8.8999f, 8.4216f, 10.2108f)
                lineTo(6.6325f, 9.316f)
                curveTo(7.6175f, 7.3498f, 9.6512f, 6.0f, 12.0001f, 6.0f)
                close()
                moveTo(12.0001f, 2.0f)
                curveTo(15.9153f, 2.0f, 19.3049f, 4.2499f, 20.9466f, 7.5273f)
                lineTo(19.1576f, 8.4224f)
                curveTo(17.8443f, 5.8002f, 15.1325f, 4.0f, 12.0001f, 4.0f)
                curveTo(8.8678f, 4.0f, 6.156f, 5.8002f, 4.8427f, 8.4224f)
                lineTo(3.0537f, 7.5273f)
                curveTo(4.6954f, 4.2499f, 8.085f, 2.0f, 12.0001f, 2.0f)
                close()
            }
        }
        .build()
        return `_remote-control-fill`!!
    }

private var `_remote-control-fill`: ImageVector? = null
