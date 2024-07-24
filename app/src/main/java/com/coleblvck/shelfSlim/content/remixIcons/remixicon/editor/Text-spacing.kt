package com.coleblvck.shelfSlim.content.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Text-spacing`: ImageVector
    get() {
        if (`_text-spacing` != null) {
            return `_text-spacing`!!
        }
        `_text-spacing` = Builder(name = "Text-spacing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.5f)
                lineTo(20.5f, 18.0f)
                lineTo(17.0f, 21.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.5f)
                lineTo(3.5f, 18.0f)
                lineTo(7.0f, 14.5f)
                verticalLineTo(17.0f)
                close()
                moveTo(13.0f, 6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_text-spacing`!!
    }

private var `_text-spacing`: ImageVector? = null
