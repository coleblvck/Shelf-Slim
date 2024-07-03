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

public val ArrowsGroup.`Expand-horizontal-s-fill`: ImageVector
    get() {
        if (`_expand-horizontal-s-fill` != null) {
            return `_expand-horizontal-s-fill`!!
        }
        `_expand-horizontal-s-fill` = Builder(name = "Expand-horizontal-s-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.4497f, 7.0502f)
                lineTo(2.5f, 11.9999f)
                lineTo(7.4473f, 16.9472f)
                lineTo(7.4483f, 12.9999f)
                horizontalLineTo(16.5501f)
                lineTo(16.55f, 16.9491f)
                lineTo(21.5f, 11.9994f)
                lineTo(16.5503f, 7.0497f)
                lineTo(16.5502f, 10.9999f)
                horizontalLineTo(7.4488f)
                lineTo(7.4497f, 7.0502f)
                close()
            }
        }
        .build()
        return `_expand-horizontal-s-fill`!!
    }

private var `_expand-horizontal-s-fill`: ImageVector? = null
