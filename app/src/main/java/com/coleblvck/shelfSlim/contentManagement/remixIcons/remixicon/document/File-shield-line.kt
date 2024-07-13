package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-shield-line`: ImageVector
    get() {
        if (`_file-shield-line` != null) {
            return `_file-shield-line`!!
        }
        `_file-shield-line` = Builder(name = "File-shield-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.6195f)
                curveTo(16.0f, 14.4641f, 15.5544f, 15.2529f, 14.8125f, 15.7215f)
                lineTo(12.0f, 17.4978f)
                lineTo(9.1875f, 15.7215f)
                curveTo(8.4456f, 15.2529f, 8.0f, 14.4641f, 8.0f, 13.6195f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(21.0f, 8.0f)
                verticalLineTo(20.9932f)
                curveTo(21.0f, 21.5501f, 20.5552f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4553f, 3.4487f, 2.0f, 4.0022f, 2.0f)
                horizontalLineTo(14.9968f)
                lineTo(21.0f, 8.0f)
                close()
                moveTo(10.0f, 13.6195f)
                curveTo(10.0f, 13.7698f, 10.0872f, 13.9242f, 10.2554f, 14.0305f)
                lineTo(12.0f, 15.1323f)
                lineTo(13.7446f, 14.0305f)
                curveTo(13.9128f, 13.9242f, 14.0f, 13.7698f, 14.0f, 13.6195f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.6195f)
                close()
            }
        }
        .build()
        return `_file-shield-line`!!
    }

private var `_file-shield-line`: ImageVector? = null
