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

public val EditorGroup.`H-3`: ImageVector
    get() {
        if (`_h-3` != null) {
            return `_h-3`!!
        }
        `_h-3` = Builder(name = "H-3", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.0f)
                lineTo(21.9984f, 10.0f)
                lineTo(19.4934f, 12.883f)
                curveTo(21.0823f, 13.3184f, 22.25f, 14.7728f, 22.25f, 16.5f)
                curveTo(22.25f, 18.5711f, 20.5711f, 20.25f, 18.5f, 20.25f)
                curveTo(16.674f, 20.25f, 15.1528f, 18.9449f, 14.8184f, 17.2166f)
                lineTo(16.7821f, 16.8352f)
                curveTo(16.9384f, 17.6413f, 17.6481f, 18.25f, 18.5f, 18.25f)
                curveTo(19.4665f, 18.25f, 20.25f, 17.4665f, 20.25f, 16.5f)
                curveTo(20.25f, 15.5335f, 19.4665f, 14.75f, 18.5f, 14.75f)
                curveTo(18.214f, 14.75f, 17.944f, 14.8186f, 17.7056f, 14.9403f)
                lineTo(16.3992f, 13.3932f)
                lineTo(19.3484f, 10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(4.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return `_h-3`!!
    }

private var `_h-3`: ImageVector? = null
