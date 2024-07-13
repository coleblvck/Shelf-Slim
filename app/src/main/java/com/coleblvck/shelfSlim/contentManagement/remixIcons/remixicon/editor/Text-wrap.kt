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

public val EditorGroup.`Text-wrap`: ImageVector
    get() {
        if (`_text-wrap` != null) {
            return `_text-wrap`!!
        }
        `_text-wrap` = Builder(name = "Text-wrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                horizontalLineTo(16.5f)
                curveTo(17.8807f, 18.0f, 19.0f, 16.8807f, 19.0f, 15.5f)
                curveTo(19.0f, 14.1193f, 17.8807f, 13.0f, 16.5f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.5f)
                curveTo(18.9853f, 11.0f, 21.0f, 13.0147f, 21.0f, 15.5f)
                curveTo(21.0f, 17.9853f, 18.9853f, 20.0f, 16.5f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                lineTo(11.0f, 19.0f)
                lineTo(15.0f, 16.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(3.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(9.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_text-wrap`!!
    }

private var `_text-wrap`: ImageVector? = null
