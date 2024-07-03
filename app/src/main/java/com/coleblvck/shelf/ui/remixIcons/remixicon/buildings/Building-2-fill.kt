package com.coleblvck.shelf.ui.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Building-2-fill`: ImageVector
    get() {
        if (`_building-2-fill` != null) {
            return `_building-2-fill`!!
        }
        `_building-2-fill` = Builder(name = "Building-2-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                lineTo(20.3939f, 8.7403f)
                curveTo(20.7616f, 8.8979f, 21.0f, 9.2594f, 21.0f, 9.6594f)
                verticalLineTo(19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.6499f)
                curveTo(3.0f, 5.2547f, 3.2327f, 4.8966f, 3.5939f, 4.7361f)
                lineTo(11.2969f, 1.3125f)
                curveTo(11.5493f, 1.2004f, 11.8448f, 1.314f, 11.9569f, 1.5663f)
                curveTo(11.9853f, 1.6303f, 12.0f, 1.6995f, 12.0f, 1.7694f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return `_building-2-fill`!!
    }

private var `_building-2-fill`: ImageVector? = null
