package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Remixicon-fill`: ImageVector
    get() {
        if (`_remixicon-fill` != null) {
            return `_remixicon-fill`!!
        }
        `_remixicon-fill` = Builder(name = "Remixicon-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5301f, 17.5291f)
                lineTo(20.001f, 21.0f)
                horizontalLineTo(3.001f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.6676f)
                verticalLineTo(4.0078f)
                curveTo(13.7781f, 4.0026f, 13.8892f, 4.0f, 14.001f, 4.0f)
                curveTo(14.0464f, 4.0f, 14.0918f, 4.0004f, 14.137f, 4.0013f)
                curveTo(14.048f, 4.3716f, 14.001f, 4.7617f, 14.001f, 5.1667f)
                curveTo(14.001f, 7.4853f, 16.0157f, 9.5f, 18.6676f, 9.5f)
                curveTo(19.3921f, 9.5f, 20.0868f, 9.3033f, 20.6997f, 8.9622f)
                curveTo(20.8956f, 9.607f, 21.001f, 10.2912f, 21.001f, 11.0f)
                curveTo(21.001f, 13.9742f, 19.1461f, 16.5151f, 16.5301f, 17.5291f)
                close()
                moveTo(18.501f, 7.5f)
                curveTo(17.1203f, 7.5f, 16.001f, 6.3807f, 16.001f, 5.0f)
                curveTo(16.001f, 3.6193f, 17.1203f, 2.5f, 18.501f, 2.5f)
                curveTo(19.8817f, 2.5f, 21.001f, 3.6193f, 21.001f, 5.0f)
                curveTo(21.001f, 6.3807f, 19.8817f, 7.5f, 18.501f, 7.5f)
                close()
            }
        }
        .build()
        return `_remixicon-fill`!!
    }

private var `_remixicon-fill`: ImageVector? = null
