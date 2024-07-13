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

public val DocumentGroup.`File-marked-fill`: ImageVector
    get() {
        if (`_file-marked-fill` != null) {
            return `_file-marked-fill`!!
        }
        `_file-marked-fill` = Builder(name = "File-marked-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.9918f)
                verticalLineTo(21.0082f)
                curveTo(21.0f, 21.5447f, 20.5552f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4553f, 3.4448f, 2.0f, 3.9934f, 2.0f)
                horizontalLineTo(20.0066f)
                curveTo(20.5551f, 2.0f, 21.0f, 2.4441f, 21.0f, 2.9918f)
                close()
                moveTo(7.0f, 4.0f)
                verticalLineTo(13.0f)
                lineTo(10.5f, 11.0f)
                lineTo(14.0f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_file-marked-fill`!!
    }

private var `_file-marked-fill`: ImageVector? = null