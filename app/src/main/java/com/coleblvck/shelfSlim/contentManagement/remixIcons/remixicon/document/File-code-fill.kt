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

public val DocumentGroup.`File-code-fill`: ImageVector
    get() {
        if (`_file-code-fill` != null) {
            return `_file-code-fill`!!
        }
        `_file-code-fill` = Builder(name = "File-code-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(21.0082f)
                curveTo(21.0f, 21.556f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5447f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4441f, 3.445f, 2.0f, 3.9934f, 2.0f)
                horizontalLineTo(16.0f)
                close()
                moveTo(17.6569f, 12.0f)
                lineTo(14.1213f, 8.4645f)
                lineTo(12.7071f, 9.8787f)
                lineTo(14.8284f, 12.0f)
                lineTo(12.7071f, 14.1213f)
                lineTo(14.1213f, 15.5355f)
                lineTo(17.6569f, 12.0f)
                close()
                moveTo(6.3432f, 12.0f)
                lineTo(9.8787f, 15.5355f)
                lineTo(11.2929f, 14.1213f)
                lineTo(9.1716f, 12.0f)
                lineTo(11.2929f, 9.8787f)
                lineTo(9.8787f, 8.4645f)
                lineTo(6.3432f, 12.0f)
                close()
            }
        }
        .build()
        return `_file-code-fill`!!
    }

private var `_file-code-fill`: ImageVector? = null
