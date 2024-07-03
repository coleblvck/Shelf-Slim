package com.coleblvck.shelf.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-shield-fill`: ImageVector
    get() {
        if (`_file-shield-fill` != null) {
            return `_file-shield-fill`!!
        }
        `_file-shield-fill` = Builder(name = "File-shield-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                verticalLineTo(20.9925f)
                curveTo(21.0f, 21.5511f, 20.5552f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4553f, 3.4469f, 2.0f, 3.9983f, 2.0f)
                horizontalLineTo(15.9968f)
                lineTo(21.0f, 7.0f)
                close()
                moveTo(8.0f, 8.0f)
                verticalLineTo(13.6002f)
                curveTo(8.0f, 14.4496f, 8.4456f, 15.2427f, 9.1875f, 15.7138f)
                lineTo(12.0f, 17.5f)
                lineTo(14.8125f, 15.7138f)
                curveTo(15.5544f, 15.2427f, 16.0f, 14.4496f, 16.0f, 13.6002f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.6002f)
                curveTo(14.0f, 13.7579f, 13.9103f, 13.9176f, 13.7403f, 14.0255f)
                lineTo(12.0f, 15.1308f)
                lineTo(10.2597f, 14.0255f)
                curveTo(10.0897f, 13.9176f, 10.0f, 13.7579f, 10.0f, 13.6002f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return `_file-shield-fill`!!
    }

private var `_file-shield-fill`: ImageVector? = null
