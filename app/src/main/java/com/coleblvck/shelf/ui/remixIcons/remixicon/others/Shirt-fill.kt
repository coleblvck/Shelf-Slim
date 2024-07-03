package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Shirt-fill`: ImageVector
    get() {
        if (`_shirt-fill` != null) {
            return `_shirt-fill`!!
        }
        `_shirt-fill` = Builder(name = "Shirt-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9981f, 4.0f)
                verticalLineTo(11.0f)
                lineTo(11.998f, 8.5f)
                lineTo(16.998f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(19.998f)
                curveTo(20.5503f, 4.0f, 20.998f, 4.4477f, 20.998f, 5.0f)
                verticalLineTo(21.0f)
                curveTo(20.998f, 21.5523f, 20.5503f, 22.0f, 19.998f, 22.0f)
                horizontalLineTo(3.998f)
                curveTo(3.4458f, 22.0f, 2.998f, 21.5523f, 2.998f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(2.998f, 4.4477f, 3.4458f, 4.0f, 3.998f, 4.0f)
                horizontalLineTo(6.9981f)
                close()
                moveTo(11.998f, 8.0f)
                lineTo(7.4981f, 3.0f)
                horizontalLineTo(16.498f)
                lineTo(11.998f, 8.0f)
                close()
                moveTo(12.998f, 11.2361f)
                lineTo(11.998f, 10.7361f)
                lineTo(10.998f, 11.2361f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.998f)
                verticalLineTo(11.2361f)
                close()
                moveTo(14.998f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.998f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.998f)
                close()
            }
        }
        .build()
        return `_shirt-fill`!!
    }

private var `_shirt-fill`: ImageVector? = null
