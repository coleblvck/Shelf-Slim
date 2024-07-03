package com.coleblvck.shelf.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Drag-move-2-line`: ImageVector
    get() {
        if (`_drag-move-2-line` != null) {
            return `_drag-move-2-line`!!
        }
        `_drag-move-2-line` = Builder(name = "Drag-move-2-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 11.0f)
                verticalLineTo(5.8284f)
                lineTo(9.1716f, 7.6568f)
                lineTo(7.7574f, 6.2426f)
                lineTo(12.0f, 2.0f)
                lineTo(16.2426f, 6.2426f)
                lineTo(14.8284f, 7.6568f)
                lineTo(13.0f, 5.8284f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.1716f)
                lineTo(16.3431f, 9.1716f)
                lineTo(17.7574f, 7.7574f)
                lineTo(22.0f, 12.0f)
                lineTo(17.7574f, 16.2426f)
                lineTo(16.3431f, 14.8284f)
                lineTo(18.1716f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.1716f)
                lineTo(14.8284f, 16.3431f)
                lineTo(16.2426f, 17.7574f)
                lineTo(12.0f, 22.0f)
                lineTo(7.7574f, 17.7574f)
                lineTo(9.1716f, 16.3431f)
                lineTo(11.0f, 18.1716f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.8284f)
                lineTo(7.6568f, 14.8284f)
                lineTo(6.2426f, 16.2426f)
                lineTo(2.0f, 12.0f)
                lineTo(6.2426f, 7.7574f)
                lineTo(7.6568f, 9.1716f)
                lineTo(5.8284f, 11.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return `_drag-move-2-line`!!
    }

private var `_drag-move-2-line`: ImageVector? = null
