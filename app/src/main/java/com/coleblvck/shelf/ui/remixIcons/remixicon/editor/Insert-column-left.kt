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

public val EditorGroup.`Insert-column-left`: ImageVector
    get() {
        if (`_insert-column-left` != null) {
            return `_insert-column-left`!!
        }
        `_insert-column-left` = Builder(name = "Insert-column-left", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 21.0f, 13.0f, 20.5523f, 13.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(13.0f, 3.4477f, 13.4477f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(19.0f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(6.0f, 7.0f)
                curveTo(8.7614f, 7.0f, 11.0f, 9.2386f, 11.0f, 12.0f)
                curveTo(11.0f, 14.7614f, 8.7614f, 17.0f, 6.0f, 17.0f)
                curveTo(3.2386f, 17.0f, 1.0f, 14.7614f, 1.0f, 12.0f)
                curveTo(1.0f, 9.2386f, 3.2386f, 7.0f, 6.0f, 7.0f)
                close()
                moveTo(7.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.999f)
                lineTo(3.0f, 11.0f)
                verticalLineTo(13.0f)
                lineTo(5.0f, 12.999f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(12.999f)
                lineTo(9.0f, 13.0f)
                verticalLineTo(11.0f)
                lineTo(7.0f, 10.999f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_insert-column-left`!!
    }

private var `_insert-column-left`: ImageVector? = null
