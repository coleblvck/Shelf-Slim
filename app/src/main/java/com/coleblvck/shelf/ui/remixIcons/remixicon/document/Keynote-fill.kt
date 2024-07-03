package com.coleblvck.shelf.ui.remixIcons.remixicon.document

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DocumentGroup

public val DocumentGroup.`Keynote-fill`: ImageVector
    get() {
        if (`_keynote-fill` != null) {
            return `_keynote-fill`!!
        }
        `_keynote-fill` = Builder(name = "Keynote-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9992f, 2.0f)
                curveTo(19.552f, 2.0f, 20.086f, 2.4297f, 20.1955f, 2.9771f)
                lineTo(21.8047f, 11.023f)
                curveTo(21.9126f, 11.5626f, 21.5448f, 12.0f, 21.0083f, 12.0f)
                horizontalLineTo(12.9998f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0001f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0001f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.9998f)
                verticalLineTo(12.0f)
                horizontalLineTo(2.9919f)
                curveTo(2.4441f, 12.0f, 2.086f, 11.5703f, 2.1955f, 11.023f)
                lineTo(3.8047f, 2.9771f)
                curveTo(3.9126f, 2.4374f, 4.4447f, 2.0f, 5.0009f, 2.0f)
                horizontalLineTo(18.9992f)
                close()
            }
        }
        .build()
        return `_keynote-fill`!!
    }

private var `_keynote-fill`: ImageVector? = null
