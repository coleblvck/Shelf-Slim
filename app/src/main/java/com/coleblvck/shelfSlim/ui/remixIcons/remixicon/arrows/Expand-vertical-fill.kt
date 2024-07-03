package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-vertical-fill`: ImageVector
    get() {
        if (`_expand-vertical-fill` != null) {
            return `_expand-vertical-fill`!!
        }
        `_expand-vertical-fill` = Builder(name = "Expand-vertical-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9995f, 0.4995f)
                lineTo(16.9493f, 5.4493f)
                lineTo(12.9995f, 5.4483f)
                verticalLineTo(9.9995f)
                horizontalLineTo(10.9995f)
                verticalLineTo(5.4478f)
                lineTo(7.0522f, 5.4468f)
                lineTo(11.9995f, 0.4995f)
                close()
                moveTo(10.9995f, 13.9995f)
                lineTo(10.9995f, 18.5496f)
                lineTo(7.0503f, 18.5496f)
                lineTo(12.0f, 23.4995f)
                lineTo(16.9497f, 18.5498f)
                lineTo(12.9995f, 18.5497f)
                verticalLineTo(13.9995f)
                horizontalLineTo(10.9995f)
                close()
            }
        }
        .build()
        return `_expand-vertical-fill`!!
    }

private var `_expand-vertical-fill`: ImageVector? = null
