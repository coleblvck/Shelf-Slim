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

public val MapGroup.`Map-pin-5-line`: ImageVector
    get() {
        if (`_map-pin-5-line` != null) {
            return `_map-pin-5-line`!!
        }
        `_map-pin-5-line` = Builder(name = "Map-pin-5-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.4853f)
                lineTo(16.2426f, 14.2426f)
                curveTo(18.5858f, 11.8995f, 18.5858f, 8.1005f, 16.2426f, 5.7574f)
                curveTo(13.8995f, 3.4142f, 10.1005f, 3.4142f, 7.7574f, 5.7574f)
                curveTo(5.4142f, 8.1005f, 5.4142f, 11.8995f, 7.7574f, 14.2426f)
                lineTo(12.0f, 18.4853f)
                close()
                moveTo(17.6569f, 15.6569f)
                lineTo(12.0f, 21.3137f)
                lineTo(6.3432f, 15.6569f)
                curveTo(3.219f, 12.5327f, 3.219f, 7.4673f, 6.3432f, 4.3432f)
                curveTo(9.4673f, 1.219f, 14.5327f, 1.219f, 17.6569f, 4.3432f)
                curveTo(20.781f, 7.4673f, 20.781f, 12.5327f, 17.6569f, 15.6569f)
                close()
                moveTo(5.0f, 22.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return `_map-pin-5-line`!!
    }

private var `_map-pin-5-line`: ImageVector? = null
