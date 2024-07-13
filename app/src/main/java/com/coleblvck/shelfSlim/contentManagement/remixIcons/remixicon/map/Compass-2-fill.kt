package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MapGroup

public val MapGroup.`Compass-2-fill`: ImageVector
    get() {
        if (`_compass-2-fill` != null) {
            return `_compass-2-fill`!!
        }
        `_compass-2-fill` = Builder(name = "Compass-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3277f, 4.2581f)
                lineTo(10.5858f, 12.0f)
                lineTo(12.0f, 13.4142f)
                lineTo(19.7419f, 5.6723f)
                curveTo(21.153f, 7.3964f, 22.0f, 9.5999f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                curveTo(14.4001f, 2.0f, 16.6036f, 2.847f, 18.3277f, 4.2581f)
                close()
            }
        }
        .build()
        return `_compass-2-fill`!!
    }

private var `_compass-2-fill`: ImageVector? = null
