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

public val EditorGroup.`Bring-to-front`: ImageVector
    get() {
        if (`_bring-to-front` != null) {
            return `_bring-to-front`!!
        }
        `_bring-to-front` = Builder(name = "Bring-to-front", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                curveTo(11.5523f, 3.0f, 12.0f, 3.4477f, 12.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 6.0f, 18.0f, 6.4477f, 18.0f, 7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 12.0f, 21.0f, 12.4477f, 21.0f, 13.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(13.0f)
                curveTo(12.4477f, 21.0f, 12.0f, 20.5523f, 12.0f, 20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 18.0f, 6.0f, 17.5523f, 6.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 12.0f, 3.0f, 11.5523f, 3.0f, 11.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(16.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return `_bring-to-front`!!
    }

private var `_bring-to-front`: ImageVector? = null
