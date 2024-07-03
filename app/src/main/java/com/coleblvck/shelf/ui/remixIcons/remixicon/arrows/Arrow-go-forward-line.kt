package com.coleblvck.shelf.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-go-forward-line`: ImageVector
    get() {
        if (`_arrow-go-forward-line` != null) {
            return `_arrow-go-forward-line`!!
        }
        `_arrow-go-forward-line` = Builder(name = "Arrow-go-forward-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1716f, 6.9995f)
                horizontalLineTo(11.0f)
                curveTo(7.6863f, 6.9995f, 5.0f, 9.6858f, 5.0f, 12.9996f)
                curveTo(5.0f, 16.3133f, 7.6863f, 18.9996f, 11.0f, 18.9996f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.9996f)
                horizontalLineTo(11.0f)
                curveTo(6.5817f, 20.9996f, 3.0f, 17.4178f, 3.0f, 12.9996f)
                curveTo(3.0f, 8.5813f, 6.5817f, 4.9995f, 11.0f, 4.9995f)
                horizontalLineTo(18.1716f)
                lineTo(15.636f, 2.464f)
                lineTo(17.0503f, 1.0498f)
                lineTo(22.0f, 5.9995f)
                lineTo(17.0503f, 10.9493f)
                lineTo(15.636f, 9.5351f)
                lineTo(18.1716f, 6.9995f)
                close()
            }
        }
        .build()
        return `_arrow-go-forward-line`!!
    }

private var `_arrow-go-forward-line`: ImageVector? = null
