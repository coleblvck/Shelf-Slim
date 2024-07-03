package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Vuejs-line`: ImageVector
    get() {
        if (`_vuejs-line` != null) {
            return `_vuejs-line`!!
        }
        `_vuejs-line` = Builder(name = "Vuejs-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.3168f, 3.0f)
                lineTo(12.001f, 18.0f)
                lineTo(20.6852f, 3.0f)
                horizontalLineTo(23.001f)
                lineTo(12.001f, 22.0f)
                lineTo(1.001f, 3.0f)
                horizontalLineTo(3.3168f)
                close()
                moveTo(7.6589f, 3.0f)
                lineTo(12.001f, 10.5f)
                lineTo(16.3431f, 3.0f)
                horizontalLineTo(18.6589f)
                lineTo(12.001f, 14.5f)
                lineTo(5.3431f, 3.0f)
                horizontalLineTo(7.6589f)
                close()
            }
        }
        .build()
        return `_vuejs-line`!!
    }

private var `_vuejs-line`: ImageVector? = null
