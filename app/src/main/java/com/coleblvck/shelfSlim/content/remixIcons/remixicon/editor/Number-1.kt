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

public val EditorGroup.`Number-1`: ImageVector
    get() {
        if (`_number-1` != null) {
            return `_number-1`!!
        }
        `_number-1` = Builder(name = "Number-1", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 1.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.704f)
                lineTo(7.5f, 4.91f)
                verticalLineTo(2.839f)
                lineTo(12.5f, 1.5f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return `_number-1`!!
    }

private var `_number-1`: ImageVector? = null