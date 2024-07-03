package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Settings-2-fill`: ImageVector
    get() {
        if (`_settings-2-fill` != null) {
            return `_settings-2-fill`!!
        }
        `_settings-2-fill` = Builder(name = "Settings-2-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6864f, 4.0001f)
                lineTo(11.293f, 1.3935f)
                curveTo(11.6835f, 1.0029f, 12.3167f, 1.0029f, 12.7072f, 1.3935f)
                lineTo(15.3138f, 4.0001f)
                horizontalLineTo(19.0001f)
                curveTo(19.5524f, 4.0001f, 20.0001f, 4.4478f, 20.0001f, 5.0001f)
                verticalLineTo(8.6864f)
                lineTo(22.6067f, 11.293f)
                curveTo(22.9972f, 11.6835f, 22.9972f, 12.3167f, 22.6067f, 12.7072f)
                lineTo(20.0001f, 15.3138f)
                verticalLineTo(19.0001f)
                curveTo(20.0001f, 19.5524f, 19.5524f, 20.0001f, 19.0001f, 20.0001f)
                horizontalLineTo(15.3138f)
                lineTo(12.7072f, 22.6067f)
                curveTo(12.3167f, 22.9972f, 11.6835f, 22.9972f, 11.293f, 22.6067f)
                lineTo(8.6864f, 20.0001f)
                horizontalLineTo(5.0001f)
                curveTo(4.4478f, 20.0001f, 4.0001f, 19.5524f, 4.0001f, 19.0001f)
                verticalLineTo(15.3138f)
                lineTo(1.3935f, 12.7072f)
                curveTo(1.0029f, 12.3167f, 1.0029f, 11.6835f, 1.3935f, 11.293f)
                lineTo(4.0001f, 8.6864f)
                verticalLineTo(5.0001f)
                curveTo(4.0001f, 4.4478f, 4.4478f, 4.0001f, 5.0001f, 4.0001f)
                horizontalLineTo(8.6864f)
                close()
                moveTo(12.0001f, 15.0001f)
                curveTo(13.6569f, 15.0001f, 15.0001f, 13.6569f, 15.0001f, 12.0001f)
                curveTo(15.0001f, 10.3432f, 13.6569f, 9.0001f, 12.0001f, 9.0001f)
                curveTo(10.3432f, 9.0001f, 9.0001f, 10.3432f, 9.0001f, 12.0001f)
                curveTo(9.0001f, 13.6569f, 10.3432f, 15.0001f, 12.0001f, 15.0001f)
                close()
            }
        }
        .build()
        return `_settings-2-fill`!!
    }

private var `_settings-2-fill`: ImageVector? = null
