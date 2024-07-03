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

public val EditorGroup.Draggable: ImageVector
    get() {
        if (_draggable != null) {
            return _draggable!!
        }
        _draggable = Builder(name = "Draggable", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 7.0f)
                curveTo(9.3284f, 7.0f, 10.0f, 6.3284f, 10.0f, 5.5f)
                curveTo(10.0f, 4.6716f, 9.3284f, 4.0f, 8.5f, 4.0f)
                curveTo(7.6716f, 4.0f, 7.0f, 4.6716f, 7.0f, 5.5f)
                curveTo(7.0f, 6.3284f, 7.6716f, 7.0f, 8.5f, 7.0f)
                close()
                moveTo(8.5f, 13.5f)
                curveTo(9.3284f, 13.5f, 10.0f, 12.8284f, 10.0f, 12.0f)
                curveTo(10.0f, 11.1716f, 9.3284f, 10.5f, 8.5f, 10.5f)
                curveTo(7.6716f, 10.5f, 7.0f, 11.1716f, 7.0f, 12.0f)
                curveTo(7.0f, 12.8284f, 7.6716f, 13.5f, 8.5f, 13.5f)
                close()
                moveTo(10.0f, 18.5f)
                curveTo(10.0f, 19.3284f, 9.3284f, 20.0f, 8.5f, 20.0f)
                curveTo(7.6716f, 20.0f, 7.0f, 19.3284f, 7.0f, 18.5f)
                curveTo(7.0f, 17.6716f, 7.6716f, 17.0f, 8.5f, 17.0f)
                curveTo(9.3284f, 17.0f, 10.0f, 17.6716f, 10.0f, 18.5f)
                close()
                moveTo(15.5f, 7.0f)
                curveTo(16.3284f, 7.0f, 17.0f, 6.3284f, 17.0f, 5.5f)
                curveTo(17.0f, 4.6716f, 16.3284f, 4.0f, 15.5f, 4.0f)
                curveTo(14.6716f, 4.0f, 14.0f, 4.6716f, 14.0f, 5.5f)
                curveTo(14.0f, 6.3284f, 14.6716f, 7.0f, 15.5f, 7.0f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 12.8284f, 16.3284f, 13.5f, 15.5f, 13.5f)
                curveTo(14.6716f, 13.5f, 14.0f, 12.8284f, 14.0f, 12.0f)
                curveTo(14.0f, 11.1716f, 14.6716f, 10.5f, 15.5f, 10.5f)
                curveTo(16.3284f, 10.5f, 17.0f, 11.1716f, 17.0f, 12.0f)
                close()
                moveTo(15.5f, 20.0f)
                curveTo(16.3284f, 20.0f, 17.0f, 19.3284f, 17.0f, 18.5f)
                curveTo(17.0f, 17.6716f, 16.3284f, 17.0f, 15.5f, 17.0f)
                curveTo(14.6716f, 17.0f, 14.0f, 17.6716f, 14.0f, 18.5f)
                curveTo(14.0f, 19.3284f, 14.6716f, 20.0f, 15.5f, 20.0f)
                close()
            }
        }
        .build()
        return _draggable!!
    }

private var _draggable: ImageVector? = null
