package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Insert-row-top`: ImageVector
    get() {
        if (`_insert-row-top` != null) {
            return `_insert-row-top`!!
        }
        `_insert-row-top` = Builder(name = "Insert-row-top", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.0f)
                curveTo(20.5523f, 13.0f, 21.0f, 13.4477f, 21.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(3.0f, 13.4477f, 3.4477f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(14.7614f, 1.0f, 17.0f, 3.2386f, 17.0f, 6.0f)
                curveTo(17.0f, 8.7614f, 14.7614f, 11.0f, 12.0f, 11.0f)
                curveTo(9.2386f, 11.0f, 7.0f, 8.7614f, 7.0f, 6.0f)
                curveTo(7.0f, 3.2386f, 9.2386f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(13.0f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.999f)
                lineTo(9.0f, 5.0f)
                verticalLineTo(7.0f)
                lineTo(11.0f, 6.999f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.999f)
                lineTo(15.0f, 7.0f)
                verticalLineTo(5.0f)
                lineTo(13.0f, 4.999f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return `_insert-row-top`!!
    }

private var `_insert-row-top`: ImageVector? = null
