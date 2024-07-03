package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Insert-row-bottom`: ImageVector
    get() {
        if (`_insert-row-bottom` != null) {
            return `_insert-row-bottom`!!
        }
        `_insert-row-bottom` = Builder(name = "Insert-row-bottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveTo(14.7614f, 13.0f, 17.0f, 15.2386f, 17.0f, 18.0f)
                curveTo(17.0f, 20.7614f, 14.7614f, 23.0f, 12.0f, 23.0f)
                curveTo(9.2386f, 23.0f, 7.0f, 20.7614f, 7.0f, 18.0f)
                curveTo(7.0f, 15.2386f, 9.2386f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(13.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.999f)
                lineTo(9.0f, 17.0f)
                verticalLineTo(19.0f)
                lineTo(11.0f, 18.999f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.999f)
                lineTo(15.0f, 19.0f)
                verticalLineTo(17.0f)
                lineTo(13.0f, 16.999f)
                verticalLineTo(15.0f)
                close()
                moveTo(20.0f, 3.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(10.0f)
                curveTo(21.0f, 10.5523f, 20.5523f, 11.0f, 20.0f, 11.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 11.0f, 3.0f, 10.5523f, 3.0f, 10.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(5.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_insert-row-bottom`!!
    }

private var `_insert-row-bottom`: ImageVector? = null
