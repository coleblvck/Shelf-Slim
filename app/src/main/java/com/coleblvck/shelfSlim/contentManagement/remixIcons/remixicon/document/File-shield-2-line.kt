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

public val DocumentGroup.`File-shield-2-line`: ImageVector
    get() {
        if (`_file-shield-2-line` != null) {
            return `_file-shield-2-line`!!
        }
        `_file-shield-2-line` = Builder(name = "File-shield-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0563f)
                curveTo(11.3838f, 20.4171f, 11.7803f, 20.7847f, 12.236f, 21.0848f)
                lineTo(13.626f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4553f, 3.4487f, 2.0f, 4.0022f, 2.0f)
                horizontalLineTo(14.9968f)
                lineTo(21.0f, 8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(12.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(16.949f)
                curveTo(21.0f, 17.9397f, 20.4987f, 18.8648f, 19.6641f, 19.4144f)
                lineTo(16.5f, 21.4978f)
                lineTo(13.3359f, 19.4144f)
                curveTo(12.5013f, 18.8648f, 12.0f, 17.9397f, 12.0f, 16.949f)
                verticalLineTo(11.0f)
                close()
                moveTo(14.0f, 16.949f)
                curveTo(14.0f, 17.2652f, 14.1616f, 17.5634f, 14.4358f, 17.744f)
                lineTo(16.5f, 19.1032f)
                lineTo(18.5642f, 17.744f)
                curveTo(18.8384f, 17.5634f, 19.0f, 17.2652f, 19.0f, 16.949f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.949f)
                close()
            }
        }
        .build()
        return `_file-shield-2-line`!!
    }

private var `_file-shield-2-line`: ImageVector? = null
