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

public val EditorGroup.`Input-cursor-move`: ImageVector
    get() {
        if (`_input-cursor-move` != null) {
            return `_input-cursor-move`!!
        }
        `_input-cursor-move` = Builder(name = "Input-cursor-move", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(18.0503f, 7.0503f)
                lineTo(23.0f, 12.0f)
                lineTo(18.0503f, 16.9497f)
                lineTo(16.636f, 15.5355f)
                lineTo(20.1716f, 12.0f)
                lineTo(16.636f, 8.4645f)
                lineTo(18.0503f, 7.0503f)
                close()
                moveTo(5.9497f, 7.0503f)
                lineTo(7.364f, 8.4645f)
                lineTo(3.8284f, 12.0f)
                lineTo(7.364f, 15.5355f)
                lineTo(5.9497f, 16.9497f)
                lineTo(1.0f, 12.0f)
                lineTo(5.9497f, 7.0503f)
                close()
            }
        }
        .build()
        return `_input-cursor-move`!!
    }

private var `_input-cursor-move`: ImageVector? = null
