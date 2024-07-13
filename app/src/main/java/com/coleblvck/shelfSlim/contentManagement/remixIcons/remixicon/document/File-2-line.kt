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

public val DocumentGroup.`File-2-line`: ImageVector
    get() {
        if (`_file-2-line` != null) {
            return `_file-2-line`!!
        }
        `_file-2-line` = Builder(name = "File-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 8.0f)
                lineTo(9.0032f, 2.0f)
                horizontalLineTo(19.9978f)
                curveTo(20.5513f, 2.0f, 21.0f, 2.4553f, 21.0f, 2.9918f)
                verticalLineTo(21.0082f)
                curveTo(21.0f, 21.556f, 20.5551f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.4448f, 22.0f, 3.0f, 21.5501f, 3.0f, 20.9932f)
                verticalLineTo(8.0f)
                close()
                moveTo(10.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return `_file-2-line`!!
    }

private var `_file-2-line`: ImageVector? = null