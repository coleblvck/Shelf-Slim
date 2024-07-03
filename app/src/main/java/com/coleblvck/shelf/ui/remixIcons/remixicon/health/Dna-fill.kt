package com.coleblvck.shelf.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Dna-fill`: ImageVector
    get() {
        if (`_dna-fill` != null) {
            return `_dna-fill`!!
        }
        `_dna-fill` = Builder(name = "Dna-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                curveTo(18.0f, 1.7156f, 17.9359f, 2.3795f, 17.8155f, 3.0f)
                horizontalLineTo(8.2319f)
                curveTo(8.8705f, 5.5522f, 10.7943f, 7.2288f, 13.5829f, 9.4281f)
                curveTo(13.0772f, 9.8647f, 12.5462f, 10.294f, 12.0f, 10.7267f)
                curveTo(8.7291f, 8.1349f, 6.0f, 5.6684f, 6.0f, 1.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 6.4662f, 7.2101f, 9.4635f, 10.3863f, 12.0f)
                curveTo(7.2101f, 14.5365f, 4.0f, 17.5338f, 4.0f, 23.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 18.0404f, 9.0801f, 15.566f, 12.6178f, 12.7863f)
                lineTo(12.7096f, 12.7142f)
                curveTo(16.149f, 10.0123f, 20.0f, 6.9871f, 20.0f, 1.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(17.8155f, 21.0002f)
                horizontalLineTo(8.2319f)
                curveTo(8.891f, 18.3663f, 10.9188f, 16.665f, 13.8535f, 14.3592f)
                curveTo(14.2973f, 14.0106f, 14.7419f, 13.663f, 15.1811f, 13.3086f)
                curveTo(17.7659f, 15.5981f, 20.0f, 18.44f, 20.0f, 23.0002f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 22.2846f, 17.9359f, 21.6207f, 17.8155f, 21.0002f)
                close()
            }
        }
        .build()
        return `_dna-fill`!!
    }

private var `_dna-fill`: ImageVector? = null
