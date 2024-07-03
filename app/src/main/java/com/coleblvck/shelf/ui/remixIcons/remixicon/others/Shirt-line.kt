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

public val OthersGroup.`Shirt-line`: ImageVector
    get() {
        if (`_shirt-line` != null) {
            return `_shirt-line`!!
        }
        `_shirt-line` = Builder(name = "Shirt-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.998f, 20.0f)
                horizontalLineTo(18.998f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.998f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.998f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.998f)
                verticalLineTo(11.0f)
                lineTo(12.998f, 9.4f)
                verticalLineTo(20.0f)
                close()
                moveTo(10.998f, 20.0f)
                verticalLineTo(9.4f)
                lineTo(6.9981f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.9981f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.998f)
                close()
                moveTo(6.9981f, 4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.998f)
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
                lineTo(15.498f, 5.0f)
                horizontalLineTo(8.498f)
                lineTo(11.998f, 8.0f)
                close()
            }
        }
        .build()
        return `_shirt-line`!!
    }

private var `_shirt-line`: ImageVector? = null
