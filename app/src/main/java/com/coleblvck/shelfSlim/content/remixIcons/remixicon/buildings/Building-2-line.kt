package com.coleblvck.shelfSlim.content.remixIcons.remixicon.buildings

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BuildingsGroup

public val BuildingsGroup.`Building-2-line`: ImageVector
    get() {
        if (`_building-2-line` != null) {
            return `_building-2-line`!!
        }
        `_building-2-line` = Builder(name = "Building-2-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                verticalLineTo(5.7005f)
                curveTo(3.0f, 5.28f, 3.2631f, 4.9044f, 3.6583f, 4.7607f)
                lineTo(13.3291f, 1.244f)
                curveTo(13.5886f, 1.1496f, 13.8755f, 1.2835f, 13.9699f, 1.543f)
                curveTo(13.9898f, 1.5978f, 14.0f, 1.6556f, 14.0f, 1.7139f)
                verticalLineTo(6.6667f)
                lineTo(20.3162f, 8.7721f)
                curveTo(20.7246f, 8.9082f, 21.0f, 9.2904f, 21.0f, 9.7208f)
                verticalLineTo(19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(5.0f, 19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.8554f)
                lineTo(5.0f, 6.4009f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 19.0f)
                verticalLineTo(10.4416f)
                lineTo(14.0f, 8.7749f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return `_building-2-line`!!
    }

private var `_building-2-line`: ImageVector? = null
