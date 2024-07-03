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

public val LogosGroup.`Vuejs-fill`: ImageVector
    get() {
        if (`_vuejs-fill` != null) {
            return `_vuejs-fill`!!
        }
        `_vuejs-fill` = Builder(name = "Vuejs-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.001f, 3.0f)
                horizontalLineTo(5.001f)
                lineTo(12.001f, 15.0f)
                lineTo(19.001f, 3.0f)
                horizontalLineTo(23.001f)
                lineTo(12.001f, 22.0f)
                lineTo(1.001f, 3.0f)
                close()
                moveTo(9.6676f, 3.0f)
                lineTo(12.001f, 7.0f)
                lineTo(14.3343f, 3.0f)
                horizontalLineTo(18.3694f)
                lineTo(12.001f, 14.0f)
                lineTo(5.6326f, 3.0f)
                horizontalLineTo(9.6676f)
                close()
            }
        }
        .build()
        return `_vuejs-fill`!!
    }

private var `_vuejs-fill`: ImageVector? = null
