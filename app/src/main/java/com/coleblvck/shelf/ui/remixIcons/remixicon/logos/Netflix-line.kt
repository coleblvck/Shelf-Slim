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

public val LogosGroup.`Netflix-line`: ImageVector
    get() {
        if (`_netflix-line` != null) {
            return `_netflix-line`!!
        }
        `_netflix-line` = Builder(name = "Netflix-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9853f, 17.2079f)
                lineTo(16.001f, 2.0f)
                horizontalLineTo(18.001f)
                verticalLineTo(22.0f)
                curveTo(17.3209f, 21.7333f, 16.6476f, 21.5667f, 15.9809f, 21.5f)
                lineTo(8.001f, 6.3022f)
                verticalLineTo(21.5f)
                curveTo(7.3343f, 21.5667f, 6.6676f, 21.7333f, 6.001f, 22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.001f)
                lineTo(15.9853f, 17.2079f)
                close()
            }
        }
        .build()
        return `_netflix-line`!!
    }

private var `_netflix-line`: ImageVector? = null
