package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Unsplash-line`: ImageVector
    get() {
        if (`_unsplash-line` != null) {
            return `_unsplash-line`!!
        }
        `_unsplash-line` = Builder(name = "Unsplash-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.001f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0002f)
                lineTo(14.0012f, 10.0f)
                horizontalLineTo(21.0012f)
                lineTo(21.0002f, 14.0f)
                lineTo(21.001f, 21.0f)
                horizontalLineTo(3.001f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.001f)
                close()
                moveTo(8.001f, 12.0f)
                horizontalLineTo(5.001f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.001f)
                verticalLineTo(16.0f)
                lineTo(19.0007f, 12.0f)
                horizontalLineTo(16.0007f)
                lineTo(15.9997f, 16.0f)
                horizontalLineTo(8.001f)
                verticalLineTo(12.0f)
                close()
                moveTo(16.001f, 3.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.001f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.001f)
                close()
                moveTo(14.001f, 5.0f)
                horizontalLineTo(10.001f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.001f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_unsplash-line`!!
    }

private var `_unsplash-line`: ImageVector? = null
