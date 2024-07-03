package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Divide-fill`: ImageVector
    get() {
        if (`_divide-fill` != null) {
            return `_divide-fill`!!
        }
        `_divide-fill` = Builder(name = "Divide-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(11.1716f, 8.0f, 10.5f, 7.3284f, 10.5f, 6.5f)
                curveTo(10.5f, 5.6716f, 11.1716f, 5.0f, 12.0f, 5.0f)
                curveTo(12.8284f, 5.0f, 13.5f, 5.6716f, 13.5f, 6.5f)
                curveTo(13.5f, 7.3284f, 12.8284f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(11.1716f, 19.0f, 10.5f, 18.3284f, 10.5f, 17.5f)
                curveTo(10.5f, 16.6716f, 11.1716f, 16.0f, 12.0f, 16.0f)
                curveTo(12.8284f, 16.0f, 13.5f, 16.6716f, 13.5f, 17.5f)
                curveTo(13.5f, 18.3284f, 12.8284f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return `_divide-fill`!!
    }

private var `_divide-fill`: ImageVector? = null
