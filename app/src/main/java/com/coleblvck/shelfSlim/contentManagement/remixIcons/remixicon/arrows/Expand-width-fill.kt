package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Expand-width-fill`: ImageVector
    get() {
        if (`_expand-width-fill` != null) {
            return `_expand-width-fill`!!
        }
        `_expand-width-fill` = Builder(name = "Expand-width-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                lineTo(2.0f, 18.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0f, 6.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(9.4497f, 7.0503f)
                lineTo(4.5f, 12.0f)
                lineTo(9.4473f, 16.9473f)
                lineTo(9.4483f, 13.0f)
                horizontalLineTo(14.5501f)
                lineTo(14.55f, 16.9492f)
                lineTo(19.5f, 11.9995f)
                lineTo(14.5503f, 7.0498f)
                lineTo(14.5502f, 11.0f)
                horizontalLineTo(9.4488f)
                lineTo(9.4497f, 7.0503f)
                close()
                moveTo(20.0f, 6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return `_expand-width-fill`!!
    }

private var `_expand-width-fill`: ImageVector? = null
