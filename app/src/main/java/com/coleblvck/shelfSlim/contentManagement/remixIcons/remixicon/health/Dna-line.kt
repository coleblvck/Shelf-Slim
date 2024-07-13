package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Dna-line`: ImageVector
    get() {
        if (`_dna-line` != null) {
            return `_dna-line`!!
        }
        `_dna-line` = Builder(name = "Dna-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 1.0f)
                curveTo(18.0f, 1.7156f, 17.9359f, 2.3795f, 17.8155f, 3.0f)
                horizontalLineTo(8.2319f)
                curveTo(8.4138f, 3.7269f, 8.7f, 4.3828f, 9.0807f, 5.0f)
                horizontalLineTo(17.1807f)
                curveTo(16.132f, 7.3167f, 14.1871f, 8.9937f, 12.0f, 10.7267f)
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
                curveTo(8.4138f, 20.2733f, 8.7f, 19.6174f, 9.0807f, 19.0002f)
                horizontalLineTo(17.1807f)
                curveTo(16.3939f, 17.262f, 15.1026f, 15.8839f, 13.583f, 14.5721f)
                curveTo(14.1162f, 14.1516f, 14.6526f, 13.7351f, 15.1811f, 13.3086f)
                curveTo(17.7659f, 15.5981f, 20.0f, 18.44f, 20.0f, 23.0002f)
                horizontalLineTo(18.0f)
                curveTo(18.0f, 22.2846f, 17.9359f, 21.6207f, 17.8155f, 21.0002f)
                close()
            }
        }
        .build()
        return `_dna-line`!!
    }

private var `_dna-line`: ImageVector? = null
