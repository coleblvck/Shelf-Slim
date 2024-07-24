package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-horizontal-fill`: ImageVector
    get() {
        if (`_expand-horizontal-fill` != null) {
            return `_expand-horizontal-fill`!!
        }
        `_expand-horizontal-fill` = Builder(name = "Expand-horizontal-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.5f, 12.0f)
                lineTo(5.4497f, 7.0502f)
                lineTo(5.4488f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.4483f)
                lineTo(5.4473f, 16.9472f)
                lineTo(0.5f, 12.0f)
                close()
                moveTo(14.0f, 13.0f)
                horizontalLineTo(18.5501f)
                lineTo(18.55f, 16.9492f)
                lineTo(23.5f, 11.9995f)
                lineTo(18.5503f, 7.0497f)
                lineTo(18.5502f, 11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_expand-horizontal-fill`!!
    }

private var `_expand-horizontal-fill`: ImageVector? = null
