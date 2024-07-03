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

public val EditorGroup.`Font-size`: ImageVector
    get() {
        if (`_font-size` != null) {
            return `_font-size`!!
        }
        `_font-size` = Builder(name = "Font-size", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.246f, 15.0f)
                horizontalLineTo(4.7542f)
                lineTo(2.7542f, 20.0f)
                horizontalLineTo(0.6001f)
                lineTo(7.0001f, 4.0f)
                horizontalLineTo(9.0001f)
                lineTo(15.4001f, 20.0f)
                horizontalLineTo(13.246f)
                lineTo(11.246f, 15.0f)
                close()
                moveTo(10.446f, 13.0f)
                lineTo(8.0001f, 6.8852f)
                lineTo(5.5542f, 13.0f)
                horizontalLineTo(10.446f)
                close()
                moveTo(21.0001f, 12.5351f)
                verticalLineTo(12.0f)
                horizontalLineTo(23.0001f)
                verticalLineTo(20.0f)
                horizontalLineTo(21.0001f)
                verticalLineTo(19.4649f)
                curveTo(20.4118f, 19.8052f, 19.7287f, 20.0f, 19.0001f, 20.0f)
                curveTo(16.791f, 20.0f, 15.0001f, 18.2091f, 15.0001f, 16.0f)
                curveTo(15.0001f, 13.7909f, 16.791f, 12.0f, 19.0001f, 12.0f)
                curveTo(19.7287f, 12.0f, 20.4118f, 12.1948f, 21.0001f, 12.5351f)
                close()
                moveTo(19.0001f, 18.0f)
                curveTo(20.1047f, 18.0f, 21.0001f, 17.1046f, 21.0001f, 16.0f)
                curveTo(21.0001f, 14.8954f, 20.1047f, 14.0f, 19.0001f, 14.0f)
                curveTo(17.8955f, 14.0f, 17.0001f, 14.8954f, 17.0001f, 16.0f)
                curveTo(17.0001f, 17.1046f, 17.8955f, 18.0f, 19.0001f, 18.0f)
                close()
            }
        }
        .build()
        return `_font-size`!!
    }

private var `_font-size`: ImageVector? = null
