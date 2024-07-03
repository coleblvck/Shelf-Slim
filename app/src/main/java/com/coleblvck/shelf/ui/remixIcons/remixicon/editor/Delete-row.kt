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

public val EditorGroup.`Delete-row`: ImageVector
    get() {
        if (`_delete-row` != null) {
            return `_delete-row`!!
        }
        `_delete-row` = Builder(name = "Delete-row", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                curveTo(20.5523f, 5.0f, 21.0f, 5.4477f, 21.0f, 6.0f)
                verticalLineTo(12.0f)
                curveTo(21.0f, 12.5523f, 20.5523f, 13.0f, 20.0f, 13.0f)
                curveTo(20.628f, 13.8355f, 21.0f, 14.8743f, 21.0f, 16.0f)
                curveTo(21.0f, 18.7614f, 18.7614f, 21.0f, 16.0f, 21.0f)
                curveTo(13.2386f, 21.0f, 11.0f, 18.7614f, 11.0f, 16.0f)
                curveTo(11.0f, 14.8743f, 11.372f, 13.8355f, 11.9998f, 12.9998f)
                lineTo(4.0f, 13.0f)
                curveTo(3.4477f, 13.0f, 3.0f, 12.5523f, 3.0f, 12.0f)
                verticalLineTo(6.0f)
                curveTo(3.0f, 5.4477f, 3.4477f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(20.0f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(19.0f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return `_delete-row`!!
    }

private var `_delete-row`: ImageVector? = null
