package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Copyright-fill`: ImageVector
    get() {
        if (`_copyright-fill` != null) {
            return `_copyright-fill`!!
        }
        `_copyright-fill` = Builder(name = "Copyright-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.52f, 2.0f, 22.0f, 6.48f, 22.0f, 12.0f)
                curveTo(22.0f, 17.52f, 17.52f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 7.0f)
                curveTo(9.24f, 7.0f, 7.0f, 9.24f, 7.0f, 12.0f)
                curveTo(7.0f, 14.76f, 9.24f, 17.0f, 12.0f, 17.0f)
                curveTo(13.8195f, 17.0f, 15.413f, 16.0265f, 16.2878f, 14.5723f)
                lineTo(14.5729f, 13.5442f)
                curveTo(14.0484f, 14.4166f, 13.0926f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3425f, 15.0f, 9.0f, 13.6575f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3425f, 10.3425f, 9.0f, 12.0f, 9.0f)
                curveTo(13.0931f, 9.0f, 14.0491f, 9.5838f, 14.5735f, 10.4568f)
                lineTo(16.2878f, 9.4277f)
                curveTo(15.413f, 7.9735f, 13.8195f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_copyright-fill`!!
    }

private var `_copyright-fill`: ImageVector? = null
