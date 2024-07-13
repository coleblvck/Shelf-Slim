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

public val MapGroup.`Compass-discover-fill`: ImageVector
    get() {
        if (`_compass-discover-fill` != null) {
            return `_compass-discover-fill`!!
        }
        `_compass-discover-fill` = Builder(name = "Compass-discover-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 22.0f)
                curveTo(7.4771f, 22.0f, 3.0f, 17.5228f, 3.0f, 12.0f)
                curveTo(3.0f, 6.4771f, 7.4771f, 2.0f, 13.0f, 2.0f)
                curveTo(18.5228f, 2.0f, 23.0f, 6.4771f, 23.0f, 12.0f)
                curveTo(23.0f, 17.5228f, 18.5228f, 22.0f, 13.0f, 22.0f)
                close()
                moveTo(8.0f, 11.5f)
                lineTo(12.0f, 13.0f)
                lineTo(13.5f, 17.0021f)
                lineTo(17.0f, 8.0f)
                lineTo(8.0f, 11.5f)
                close()
            }
        }
        .build()
        return `_compass-discover-fill`!!
    }

private var `_compass-discover-fill`: ImageVector? = null
