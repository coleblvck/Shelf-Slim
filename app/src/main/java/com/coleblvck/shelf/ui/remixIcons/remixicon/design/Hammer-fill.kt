package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Hammer-fill`: ImageVector
    get() {
        if (`_hammer-fill` != null) {
            return `_hammer-fill`!!
        }
        `_hammer-fill` = Builder(name = "Hammer-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 7.5523f, 20.5523f, 8.0f, 20.0f, 8.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(15.0f, 22.0f)
                curveTo(15.0f, 22.5523f, 14.5523f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 23.0f, 9.0f, 22.5523f, 9.0f, 22.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.5f)
                verticalLineTo(6.0744f)
                curveTo(2.5f, 5.7187f, 2.6889f, 5.3898f, 2.9961f, 5.2106f)
                lineTo(8.5f, 2.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return `_hammer-fill`!!
    }

private var `_hammer-fill`: ImageVector? = null
