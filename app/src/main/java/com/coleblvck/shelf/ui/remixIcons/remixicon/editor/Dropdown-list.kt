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

public val EditorGroup.`Dropdown-list`: ImageVector
    get() {
        if (`_dropdown-list` != null) {
            return `_dropdown-list`!!
        }
        `_dropdown-list` = Builder(name = "Dropdown-list", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(19.7071f, 11.2929f)
                lineTo(19.0f, 10.5858f)
                lineTo(18.2929f, 11.2929f)
                lineTo(15.2929f, 14.2929f)
                lineTo(16.7071f, 15.7071f)
                lineTo(19.0f, 13.4142f)
                lineTo(21.2929f, 15.7071f)
                lineTo(22.7071f, 14.2929f)
                lineTo(19.7071f, 11.2929f)
                close()
                moveTo(16.7071f, 17.2929f)
                lineTo(19.0f, 19.5858f)
                lineTo(21.2929f, 17.2929f)
                lineTo(22.7071f, 18.7071f)
                lineTo(19.7071f, 21.7071f)
                lineTo(19.0f, 22.4142f)
                lineTo(18.2929f, 21.7071f)
                lineTo(15.2929f, 18.7071f)
                lineTo(16.7071f, 17.2929f)
                close()
            }
        }
        .build()
        return `_dropdown-list`!!
    }

private var `_dropdown-list`: ImageVector? = null
