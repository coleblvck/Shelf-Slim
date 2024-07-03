package com.coleblvck.shelf.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Font-color`: ImageVector
    get() {
        if (`_font-color` != null) {
            return `_font-color`!!
        }
        `_font-color` = Builder(name = "Font-color", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2459f, 14.0f)
                horizontalLineTo(8.7541f)
                lineTo(7.1541f, 18.0f)
                horizontalLineTo(5.0f)
                lineTo(11.0f, 3.0f)
                horizontalLineTo(13.0f)
                lineTo(19.0f, 18.0f)
                horizontalLineTo(16.8459f)
                lineTo(15.2459f, 14.0f)
                close()
                moveTo(14.4459f, 12.0f)
                lineTo(12.0f, 5.8852f)
                lineTo(9.5541f, 12.0f)
                horizontalLineTo(14.4459f)
                close()
                moveTo(3.0f, 20.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return `_font-color`!!
    }

private var `_font-color`: ImageVector? = null
