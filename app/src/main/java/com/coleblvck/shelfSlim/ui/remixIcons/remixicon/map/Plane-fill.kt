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

public val MapGroup.`Plane-fill`: ImageVector
    get() {
        if (`_plane-fill` != null) {
            return `_plane-fill`!!
        }
        `_plane-fill` = Builder(name = "Plane-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.9474f)
                lineTo(22.0f, 14.0f)
                verticalLineTo(16.0f)
                lineTo(14.0f, 13.4737f)
                verticalLineTo(18.8333f)
                lineTo(17.0f, 20.5f)
                verticalLineTo(22.0f)
                lineTo(12.5f, 21.0f)
                lineTo(8.0f, 22.0f)
                verticalLineTo(20.5f)
                lineTo(11.0f, 18.8333f)
                verticalLineTo(13.4737f)
                lineTo(3.0f, 16.0f)
                verticalLineTo(14.0f)
                lineTo(11.0f, 8.9474f)
                verticalLineTo(3.5f)
                curveTo(11.0f, 2.6716f, 11.6716f, 2.0f, 12.5f, 2.0f)
                curveTo(13.3284f, 2.0f, 14.0f, 2.6716f, 14.0f, 3.5f)
                verticalLineTo(8.9474f)
                close()
            }
        }
        .build()
        return `_plane-fill`!!
    }

private var `_plane-fill`: ImageVector? = null
