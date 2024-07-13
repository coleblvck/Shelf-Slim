package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Shapes-fill`: ImageVector
    get() {
        if (`_shapes-fill` != null) {
            return `_shapes-fill`!!
        }
        `_shapes-fill` = Builder(name = "Shapes-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 1.0f)
                lineTo(18.0f, 11.0f)
                horizontalLineTo(6.0f)
                lineTo(11.9998f, 1.0f)
                close()
                moveTo(13.0f, 13.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.5f)
                close()
                moveTo(6.75f, 22.0f)
                curveTo(9.3734f, 22.0f, 11.5f, 19.8734f, 11.5f, 17.25f)
                curveTo(11.5f, 14.6266f, 9.3734f, 12.5f, 6.75f, 12.5f)
                curveTo(4.1266f, 12.5f, 2.0f, 14.6266f, 2.0f, 17.25f)
                curveTo(2.0f, 19.8734f, 4.1266f, 22.0f, 6.75f, 22.0f)
                close()
            }
        }
        .build()
        return `_shapes-fill`!!
    }

private var `_shapes-fill`: ImageVector? = null
