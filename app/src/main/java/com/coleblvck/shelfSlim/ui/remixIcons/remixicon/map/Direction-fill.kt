package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Direction-fill`: ImageVector
    get() {
        if (`_direction-fill` != null) {
            return `_direction-fill`!!
        }
        `_direction-fill` = Builder(name = "Direction-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0001f, 10.0001f)
                curveTo(8.4478f, 10.0001f, 8.0001f, 10.4478f, 8.0001f, 11.0001f)
                verticalLineTo(15.0001f)
                horizontalLineTo(10.0001f)
                verticalLineTo(12.0001f)
                horizontalLineTo(13.0001f)
                verticalLineTo(14.5001f)
                lineTo(16.5001f, 11.0001f)
                lineTo(13.0001f, 7.5001f)
                verticalLineTo(10.0001f)
                horizontalLineTo(9.0001f)
                close()
                moveTo(12.7072f, 1.3935f)
                lineTo(22.6067f, 11.293f)
                curveTo(22.9972f, 11.6835f, 22.9972f, 12.3167f, 22.6067f, 12.7072f)
                lineTo(12.7072f, 22.6067f)
                curveTo(12.3167f, 22.9972f, 11.6835f, 22.9972f, 11.293f, 22.6067f)
                lineTo(1.3935f, 12.7072f)
                curveTo(1.0029f, 12.3167f, 1.0029f, 11.6835f, 1.3935f, 11.293f)
                lineTo(11.293f, 1.3935f)
                curveTo(11.6835f, 1.0029f, 12.3167f, 1.0029f, 12.7072f, 1.3935f)
                close()
            }
        }
        .build()
        return `_direction-fill`!!
    }

private var `_direction-fill`: ImageVector? = null
