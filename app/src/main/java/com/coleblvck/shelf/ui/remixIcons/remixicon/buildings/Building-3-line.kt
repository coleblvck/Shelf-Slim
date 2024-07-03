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

public val BuildingsGroup.`Building-3-line`: ImageVector
    get() {
        if (`_building-3-line` != null) {
            return `_building-3-line`!!
        }
        `_building-3-line` = Builder(name = "Building-3-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.1111f)
                verticalLineTo(1.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                lineTo(10.0f, 10.1111f)
                close()
                moveTo(12.0f, 4.3691f)
                verticalLineTo(13.1886f)
                lineTo(5.0f, 10.0775f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.1873f)
                lineTo(12.0f, 4.3691f)
                close()
            }
        }
        .build()
        return `_building-3-line`!!
    }

private var `_building-3-line`: ImageVector? = null
