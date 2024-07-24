package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Honour-line`: ImageVector
    get() {
        if (`_honour-line` != null) {
            return `_honour-line`!!
        }
        `_honour-line` = Builder(name = "Honour-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.0f)
                verticalLineTo(18.7215f)
                curveTo(21.0f, 18.9193f, 20.8833f, 19.0986f, 20.7024f, 19.1787f)
                lineTo(12.0f, 23.0313f)
                lineTo(3.2976f, 19.1787f)
                curveTo(3.1167f, 19.0986f, 3.0f, 18.9193f, 3.0f, 18.7215f)
                verticalLineTo(4.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(5.0f, 4.0f)
                verticalLineTo(17.7451f)
                lineTo(12.0f, 20.8441f)
                lineTo(19.0f, 17.7451f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(8.0f, 8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                close()
                moveTo(8.0f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_honour-line`!!
    }

private var `_honour-line`: ImageVector? = null
