package com.coleblvck.shelfSlim.content.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MapGroup

public val MapGroup.`Compass-2-line`: ImageVector
    get() {
        if (`_compass-2-line` != null) {
            return `_compass-2-line`!!
        }
        `_compass-2-line` = Builder(name = "Compass-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.6248f, 3.1326f)
                lineTo(15.1247f, 4.6327f)
                curveTo(14.1648f, 4.2253f, 13.1088f, 4.0f, 12.0f, 4.0f)
                curveTo(7.58f, 4.0f, 4.0f, 7.58f, 4.0f, 12.0f)
                curveTo(4.0f, 16.42f, 7.58f, 20.0f, 12.0f, 20.0f)
                curveTo(16.42f, 20.0f, 20.0f, 16.42f, 20.0f, 12.0f)
                curveTo(20.0f, 10.8912f, 19.7747f, 9.8352f, 19.3673f, 8.8753f)
                lineTo(20.8674f, 7.3752f)
                curveTo(21.5908f, 8.7585f, 22.0f, 10.3318f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(13.6682f, 2.0f, 15.2415f, 2.4092f, 16.6248f, 3.1326f)
                close()
                moveTo(18.364f, 4.2218f)
                lineTo(19.7782f, 5.636f)
                lineTo(12.0f, 13.4142f)
                lineTo(10.5858f, 12.0f)
                lineTo(18.364f, 4.2218f)
                close()
            }
        }
        .build()
        return `_compass-2-line`!!
    }

private var `_compass-2-line`: ImageVector? = null
