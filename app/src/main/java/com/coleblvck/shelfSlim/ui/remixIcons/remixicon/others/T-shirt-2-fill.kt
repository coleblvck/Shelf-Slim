package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`T-shirt-2-fill`: ImageVector
    get() {
        if (`_t-shirt-2-fill` != null) {
            return `_t-shirt-2-fill`!!
        }
        `_t-shirt-2-fill` = Builder(name = "T-shirt-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.998f, 3.0f)
                curveTo(21.5503f, 3.0f, 21.998f, 3.4477f, 21.998f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(21.998f, 11.5523f, 21.5503f, 12.0f, 20.998f, 12.0f)
                horizontalLineTo(18.997f)
                lineTo(18.998f, 20.0f)
                curveTo(18.998f, 20.5523f, 18.5503f, 21.0f, 17.998f, 21.0f)
                horizontalLineTo(5.9981f)
                curveTo(5.4458f, 21.0f, 4.9981f, 20.5523f, 4.9981f, 20.0f)
                lineTo(4.997f, 11.999f)
                lineTo(2.998f, 12.0f)
                curveTo(2.4458f, 12.0f, 1.998f, 11.5523f, 1.998f, 11.0f)
                verticalLineTo(4.0f)
                curveTo(1.998f, 3.4477f, 2.4458f, 3.0f, 2.998f, 3.0f)
                horizontalLineTo(8.998f)
                curveTo(8.998f, 4.6568f, 10.3412f, 6.0f, 11.998f, 6.0f)
                curveTo(13.6549f, 6.0f, 14.998f, 4.6568f, 14.998f, 3.0f)
                horizontalLineTo(20.998f)
                close()
            }
        }
        .build()
        return `_t-shirt-2-fill`!!
    }

private var `_t-shirt-2-fill`: ImageVector? = null
