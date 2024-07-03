package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Landscape-fill`: ImageVector
    get() {
        if (`_landscape-fill` != null) {
            return `_landscape-fill`!!
        }
        `_landscape-fill` = Builder(name = "Landscape-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 21.0f)
                lineTo(11.2381f, 12.2698f)
                lineTo(15.0f, 6.0f)
                lineTo(23.0f, 21.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(8.0f, 10.0f)
                lineTo(14.0f, 21.0f)
                horizontalLineTo(2.0f)
                lineTo(8.0f, 10.0f)
                close()
                moveTo(5.5f, 8.0f)
                curveTo(4.1193f, 8.0f, 3.0f, 6.8807f, 3.0f, 5.5f)
                curveTo(3.0f, 4.1193f, 4.1193f, 3.0f, 5.5f, 3.0f)
                curveTo(6.8807f, 3.0f, 8.0f, 4.1193f, 8.0f, 5.5f)
                curveTo(8.0f, 6.8807f, 6.8807f, 8.0f, 5.5f, 8.0f)
                close()
            }
        }
        .build()
        return `_landscape-fill`!!
    }

private var `_landscape-fill`: ImageVector? = null
