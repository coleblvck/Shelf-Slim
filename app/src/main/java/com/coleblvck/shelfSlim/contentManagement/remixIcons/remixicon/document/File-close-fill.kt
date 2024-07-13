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

public val DocumentGroup.`File-close-fill`: ImageVector
    get() {
        if (`_file-close-fill` != null) {
            return `_file-close-fill`!!
        }
        `_file-close-fill` = Builder(name = "File-close-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveTo(19.0928f, 13.0f, 20.1174f, 13.2922f, 20.9999f, 13.8026f)
                lineTo(20.9998f, 7.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineTo(3.9985f)
                curveTo(3.4475f, 2.0f, 3.0f, 2.4441f, 3.0f, 2.9918f)
                verticalLineTo(21.0082f)
                curveTo(3.0f, 21.5447f, 3.4448f, 22.0f, 3.9934f, 22.0f)
                horizontalLineTo(12.8027f)
                curveTo(12.2922f, 21.1175f, 12.0f, 20.0929f, 12.0f, 19.0f)
                curveTo(12.0f, 15.6863f, 14.6863f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(21.5356f, 21.1212f)
                lineTo(19.4143f, 18.9999f)
                lineTo(21.5356f, 16.8786f)
                lineTo(20.1214f, 15.4644f)
                lineTo(18.0001f, 17.5857f)
                lineTo(15.8788f, 15.4644f)
                lineTo(14.4646f, 16.8786f)
                lineTo(16.5859f, 18.9999f)
                lineTo(14.4646f, 21.1212f)
                lineTo(15.8788f, 22.5354f)
                lineTo(18.0001f, 20.4141f)
                lineTo(20.1214f, 22.5354f)
                lineTo(21.5356f, 21.1212f)
                close()
            }
        }
        .build()
        return `_file-close-fill`!!
    }

private var `_file-close-fill`: ImageVector? = null
