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

public val ArrowsGroup.`Expand-vertical-s-fill`: ImageVector
    get() {
        if (`_expand-vertical-s-fill` != null) {
            return `_expand-vertical-s-fill`!!
        }
        `_expand-vertical-s-fill` = Builder(name = "Expand-vertical-s-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9493f, 7.4493f)
                lineTo(11.9995f, 2.4995f)
                lineTo(7.0523f, 7.4468f)
                lineTo(10.9995f, 7.4478f)
                lineTo(10.9995f, 16.5496f)
                lineTo(7.0503f, 16.5496f)
                lineTo(12.0f, 21.4995f)
                lineTo(16.9498f, 16.5498f)
                lineTo(12.9995f, 16.5497f)
                lineTo(12.9995f, 7.4483f)
                lineTo(16.9493f, 7.4493f)
                close()
            }
        }
        .build()
        return `_expand-vertical-s-fill`!!
    }

private var `_expand-vertical-s-fill`: ImageVector? = null
