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

public val DeviceGroup.`Cast-line`: ImageVector
    get() {
        if (`_cast-line` != null) {
            return `_cast-line`!!
        }
        `_cast-line` = Builder(name = "Cast-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 20.3199f, 14.9478f, 19.6519f, 14.8471f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.1529f)
                curveTo(3.3481f, 8.0522f, 2.6801f, 8.0f, 2.0f, 8.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(13.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 16.0294f, 6.9706f, 12.0f, 2.0f, 12.0f)
                verticalLineTo(10.0f)
                curveTo(8.0751f, 10.0f, 13.0f, 14.9249f, 13.0f, 21.0f)
                close()
                moveTo(9.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 18.2386f, 4.7614f, 16.0f, 2.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(5.866f, 14.0f, 9.0f, 17.134f, 9.0f, 21.0f)
                close()
                moveTo(5.0f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(18.0f)
                curveTo(3.6569f, 18.0f, 5.0f, 19.3431f, 5.0f, 21.0f)
                close()
            }
        }
        .build()
        return `_cast-line`!!
    }

private var `_cast-line`: ImageVector? = null
