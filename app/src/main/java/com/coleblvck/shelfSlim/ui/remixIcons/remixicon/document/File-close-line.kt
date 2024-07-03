package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`File-close-line`: ImageVector
    get() {
        if (`_file-close-line` != null) {
            return `_file-close-line`!!
        }
        `_file-close-line` = Builder(name = "File-close-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.9998f)
                verticalLineTo(7.0f)
                lineTo(16.0f, 2.0f)
                horizontalLineTo(3.9985f)
                curveTo(3.4475f, 2.0f, 3.0f, 2.4441f, 3.0f, 2.9918f)
                verticalLineTo(21.0082f)
                curveTo(3.0f, 21.5447f, 3.4448f, 22.0f, 3.9934f, 22.0f)
                horizontalLineTo(12.0f)
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
        return `_file-close-line`!!
    }

private var `_file-close-line`: ImageVector? = null
