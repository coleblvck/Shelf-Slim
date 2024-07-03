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

public val EditorGroup.`Flow-chart`: ImageVector
    get() {
        if (`_flow-chart` != null) {
            return `_flow-chart`!!
        }
        `_flow-chart` = Builder(name = "Flow-chart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 21.5f)
                curveTo(4.067f, 21.5f, 2.5f, 19.933f, 2.5f, 18.0f)
                curveTo(2.5f, 16.067f, 4.067f, 14.5f, 6.0f, 14.5f)
                curveTo(7.5852f, 14.5f, 8.9243f, 15.5539f, 9.3548f, 16.9992f)
                lineTo(15.0f, 16.9994f)
                verticalLineTo(15.0f)
                lineTo(17.0f, 14.9994f)
                verticalLineTo(9.2434f)
                lineTo(14.757f, 6.9994f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.9994f)
                horizontalLineTo(14.757f)
                lineTo(18.0f, 1.7574f)
                lineTo(22.2426f, 6.0f)
                lineTo(19.0f, 9.2414f)
                verticalLineTo(14.9994f)
                lineTo(21.0f, 15.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.9994f)
                lineTo(9.355f, 19.0003f)
                curveTo(8.9246f, 20.4459f, 7.5854f, 21.5f, 6.0f, 21.5f)
                close()
                moveTo(6.0f, 16.5f)
                curveTo(5.1716f, 16.5f, 4.5f, 17.1716f, 4.5f, 18.0f)
                curveTo(4.5f, 18.8285f, 5.1716f, 19.5f, 6.0f, 19.5f)
                curveTo(6.8284f, 19.5f, 7.5f, 18.8285f, 7.5f, 18.0f)
                curveTo(7.5f, 17.1716f, 6.8284f, 16.5f, 6.0f, 16.5f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(18.0f, 4.5858f)
                lineTo(16.5858f, 6.0f)
                lineTo(18.0f, 7.4142f)
                lineTo(19.4142f, 6.0f)
                lineTo(18.0f, 4.5858f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_flow-chart`!!
    }

private var `_flow-chart`: ImageVector? = null
