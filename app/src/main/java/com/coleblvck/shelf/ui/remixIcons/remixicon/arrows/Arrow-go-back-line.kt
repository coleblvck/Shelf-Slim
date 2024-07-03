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

public val ArrowsGroup.`Arrow-go-back-line`: ImageVector
    get() {
        if (`_arrow-go-back-line` != null) {
            return `_arrow-go-back-line`!!
        }
        `_arrow-go-back-line` = Builder(name = "Arrow-go-back-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.8284f, 6.9995f)
                lineTo(8.364f, 9.5351f)
                lineTo(6.9497f, 10.9493f)
                lineTo(2.0f, 5.9995f)
                lineTo(6.9497f, 1.0498f)
                lineTo(8.364f, 2.464f)
                lineTo(5.8284f, 4.9995f)
                horizontalLineTo(13.0f)
                curveTo(17.4183f, 4.9995f, 21.0f, 8.5813f, 21.0f, 12.9996f)
                curveTo(21.0f, 17.4178f, 17.4183f, 20.9996f, 13.0f, 20.9996f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.9996f)
                horizontalLineTo(13.0f)
                curveTo(16.3137f, 18.9996f, 19.0f, 16.3133f, 19.0f, 12.9996f)
                curveTo(19.0f, 9.6858f, 16.3137f, 6.9995f, 13.0f, 6.9995f)
                horizontalLineTo(5.8284f)
                close()
            }
        }
        .build()
        return `_arrow-go-back-line`!!
    }

private var `_arrow-go-back-line`: ImageVector? = null
