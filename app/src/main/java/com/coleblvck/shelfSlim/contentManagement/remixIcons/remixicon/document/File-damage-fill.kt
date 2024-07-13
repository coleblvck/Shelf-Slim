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

public val DocumentGroup.`File-damage-fill`: ImageVector
    get() {
        if (`_file-damage-fill` != null) {
            return `_file-damage-fill`!!
        }
        `_file-damage-fill` = Builder(name = "File-damage-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 14.0f)
                lineTo(7.0f, 16.5f)
                lineTo(10.0f, 13.0f)
                lineTo(13.0f, 17.0f)
                lineTo(15.0f, 14.5f)
                lineTo(18.0f, 15.0f)
                lineTo(15.0f, 12.0f)
                lineTo(13.0f, 14.5f)
                lineTo(10.0f, 9.5f)
                lineTo(6.5f, 13.25f)
                lineTo(3.0f, 10.0f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4553f, 3.4469f, 2.0f, 3.9983f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                curveTo(14.0f, 8.5523f, 14.4477f, 9.0f, 15.0f, 9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(20.9925f)
                curveTo(21.0f, 21.5511f, 20.5552f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.0082f)
                verticalLineTo(14.0f)
                close()
                moveTo(21.0f, 7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.0032f)
                lineTo(21.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_file-damage-fill`!!
    }

private var `_file-damage-fill`: ImageVector? = null