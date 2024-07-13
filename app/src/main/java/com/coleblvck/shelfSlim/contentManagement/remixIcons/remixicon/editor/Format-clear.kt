package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Format-clear`: ImageVector
    get() {
        if (`_format-clear` != null) {
            return `_format-clear`!!
        }
        `_format-clear` = Builder(name = "Format-clear", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.6512f, 14.0654f)
                lineTo(11.6047f, 20.0f)
                horizontalLineTo(9.5739f)
                lineTo(10.9247f, 12.339f)
                lineTo(3.5147f, 4.9289f)
                lineTo(4.9289f, 3.5147f)
                lineTo(20.4852f, 19.0711f)
                lineTo(19.071f, 20.4853f)
                lineTo(12.6512f, 14.0654f)
                close()
                moveTo(11.7727f, 7.5301f)
                lineTo(12.0425f, 6.0f)
                horizontalLineTo(10.2426f)
                lineTo(8.2426f, 4.0f)
                horizontalLineTo(19.9999f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0733f)
                lineTo(13.4991f, 9.2565f)
                lineTo(11.7727f, 7.5301f)
                close()
            }
        }
        .build()
        return `_format-clear`!!
    }

private var `_format-clear`: ImageVector? = null
