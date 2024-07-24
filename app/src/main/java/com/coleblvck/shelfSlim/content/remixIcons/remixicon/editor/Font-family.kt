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

public val EditorGroup.`Font-family`: ImageVector
    get() {
        if (`_font-family` != null) {
            return `_font-family`!!
        }
        `_font-family` = Builder(name = "Font-family", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.554f, 22.0f)
                horizontalLineTo(3.3999f)
                lineTo(10.9999f, 3.0f)
                horizontalLineTo(12.9999f)
                lineTo(20.5999f, 22.0f)
                horizontalLineTo(18.4458f)
                lineTo(16.0458f, 16.0f)
                horizontalLineTo(7.954f)
                lineTo(5.554f, 22.0f)
                close()
                moveTo(8.754f, 14.0f)
                horizontalLineTo(15.2458f)
                lineTo(11.9999f, 5.8852f)
                lineTo(8.754f, 14.0f)
                close()
            }
        }
        .build()
        return `_font-family`!!
    }

private var `_font-family`: ImageVector? = null
