package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Shapes-line`: ImageVector
    get() {
        if (`_shapes-line` != null) {
            return `_shapes-line`!!
        }
        `_shapes-line` = Builder(name = "Shapes-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 1.0f)
                lineTo(6.0f, 11.0f)
                horizontalLineTo(18.0f)
                lineTo(11.9998f, 1.0f)
                close()
                moveTo(11.9998f, 4.8873f)
                lineTo(14.4676f, 9.0f)
                horizontalLineTo(9.5323f)
                lineTo(11.9998f, 4.8873f)
                close()
                moveTo(6.75f, 20.0f)
                curveTo(5.2312f, 20.0f, 4.0f, 18.7688f, 4.0f, 17.25f)
                curveTo(4.0f, 15.7312f, 5.2312f, 14.5f, 6.75f, 14.5f)
                curveTo(8.2688f, 14.5f, 9.5f, 15.7312f, 9.5f, 17.25f)
                curveTo(9.5f, 18.7688f, 8.2688f, 20.0f, 6.75f, 20.0f)
                close()
                moveTo(6.75f, 22.0f)
                curveTo(9.3734f, 22.0f, 11.5f, 19.8734f, 11.5f, 17.25f)
                curveTo(11.5f, 14.6266f, 9.3734f, 12.5f, 6.75f, 12.5f)
                curveTo(4.1266f, 12.5f, 2.0f, 14.6266f, 2.0f, 17.25f)
                curveTo(2.0f, 19.8734f, 4.1266f, 22.0f, 6.75f, 22.0f)
                close()
                moveTo(15.0f, 15.5f)
                verticalLineTo(19.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(15.0f)
                close()
                moveTo(13.0f, 21.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.5f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_shapes-line`!!
    }

private var `_shapes-line`: ImageVector? = null
