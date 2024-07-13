package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MapGroup

public val MapGroup.`Map-2-line`: ImageVector
    get() {
        if (`_map-2-line` != null) {
            return `_map-2-line`!!
        }
        `_map-2-line` = Builder(name = "Map-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                lineTo(9.0f, 2.0f)
                lineTo(15.0f, 5.0f)
                lineTo(21.303f, 2.2987f)
                curveTo(21.5569f, 2.1899f, 21.8508f, 2.3075f, 21.9596f, 2.5613f)
                curveTo(21.9862f, 2.6235f, 22.0f, 2.6906f, 22.0f, 2.7583f)
                verticalLineTo(19.0f)
                lineTo(15.0f, 22.0f)
                lineTo(9.0f, 19.0f)
                lineTo(2.697f, 21.7013f)
                curveTo(2.4431f, 21.8101f, 2.1492f, 21.6925f, 2.0404f, 21.4387f)
                curveTo(2.0138f, 21.3765f, 2.0f, 21.3094f, 2.0f, 21.2417f)
                verticalLineTo(5.0f)
                close()
                moveTo(16.0f, 19.3955f)
                lineTo(20.0f, 17.6812f)
                verticalLineTo(5.0331f)
                lineTo(16.0f, 6.7474f)
                verticalLineTo(19.3955f)
                close()
                moveTo(14.0f, 19.2639f)
                verticalLineTo(6.7361f)
                lineTo(10.0f, 4.7361f)
                verticalLineTo(17.2639f)
                lineTo(14.0f, 19.2639f)
                close()
                moveTo(8.0f, 17.2526f)
                verticalLineTo(4.6045f)
                lineTo(4.0f, 6.3188f)
                verticalLineTo(18.9669f)
                lineTo(8.0f, 17.2526f)
                close()
            }
        }
        .build()
        return `_map-2-line`!!
    }

private var `_map-2-line`: ImageVector? = null
