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

public val EditorGroup.`Number-4`: ImageVector
    get() {
        if (`_number-4` != null) {
            return `_number-4`!!
        }
        `_number-4` = Builder(name = "Number-4", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0001f, 1.5f)
                lineTo(16.0f, 16.0f)
                horizontalLineTo(19.0001f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                lineTo(16.0001f, 22.0f)
                horizontalLineTo(14.0001f)
                lineTo(14.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.898f)
                lineTo(14.0001f, 1.5f)
                horizontalLineTo(16.0001f)
                close()
                moveTo(14.0f, 16.0f)
                verticalLineTo(5.171f)
                lineTo(6.968f, 16.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return `_number-4`!!
    }

private var `_number-4`: ImageVector? = null