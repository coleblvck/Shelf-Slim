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

public val EditorGroup.`List-check-3`: ImageVector
    get() {
        if (`_list-check-3` != null) {
            return `_list-check-3`!!
        }
        `_list-check-3` = Builder(name = "List-check-3", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0001f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0001f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0001f)
                close()
                moveTo(3.0001f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0001f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0001f)
                close()
                moveTo(13.0001f, 4.0f)
                horizontalLineTo(21.0001f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0001f)
                verticalLineTo(4.0f)
                close()
                moveTo(13.0001f, 11.0f)
                horizontalLineTo(21.0001f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0001f)
                verticalLineTo(11.0f)
                close()
                moveTo(13.0001f, 18.0f)
                horizontalLineTo(21.0001f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0001f)
                verticalLineTo(18.0f)
                close()
                moveTo(10.7072f, 16.2071f)
                lineTo(9.293f, 14.7929f)
                lineTo(6.0001f, 18.0858f)
                lineTo(4.2072f, 16.2929f)
                lineTo(2.793f, 17.7071f)
                lineTo(6.0001f, 20.9142f)
                lineTo(10.7072f, 16.2071f)
                close()
            }
        }
        .build()
        return `_list-check-3`!!
    }

private var `_list-check-3`: ImageVector? = null
