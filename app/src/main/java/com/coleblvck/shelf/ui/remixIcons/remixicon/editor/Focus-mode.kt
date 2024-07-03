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

public val EditorGroup.`Focus-mode`: ImageVector
    get() {
        if (`_focus-mode` != null) {
            return `_focus-mode`!!
        }
        `_focus-mode` = Builder(name = "Focus-mode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                curveTo(3.4477f, 3.0f, 3.0f, 3.4477f, 3.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(20.0f, 3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.4477f, 20.5523f, 3.0f, 20.0f, 3.0f)
                close()
                moveTo(5.0f, 16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.0f, 16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(10.0f, 9.0f)
                curveTo(9.4477f, 9.0f, 9.0f, 9.4477f, 9.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(9.0f, 14.5523f, 9.4477f, 15.0f, 10.0f, 15.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 15.0f, 15.0f, 14.5523f, 15.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(15.0f, 9.4477f, 14.5523f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return `_focus-mode`!!
    }

private var `_focus-mode`: ImageVector? = null
