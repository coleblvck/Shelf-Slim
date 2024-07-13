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

public val MapGroup.`Road-map-line`: ImageVector
    get() {
        if (`_road-map-line` != null) {
            return `_road-map-line`!!
        }
        `_road-map-line` = Builder(name = "Road-map-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.1429f)
                verticalLineTo(18.9669f)
                lineTo(9.0648f, 16.7963f)
                lineTo(15.0648f, 19.7963f)
                lineTo(20.0f, 17.6812f)
                verticalLineTo(4.8571f)
                lineTo(21.303f, 4.2987f)
                curveTo(21.5569f, 4.1899f, 21.8508f, 4.3075f, 21.9596f, 4.5613f)
                curveTo(21.9862f, 4.6235f, 22.0f, 4.6906f, 22.0f, 4.7583f)
                verticalLineTo(19.0f)
                lineTo(15.0f, 22.0f)
                lineTo(9.0f, 19.0f)
                lineTo(2.697f, 21.7013f)
                curveTo(2.4431f, 21.8101f, 2.1492f, 21.6925f, 2.0404f, 21.4387f)
                curveTo(2.0138f, 21.3765f, 2.0f, 21.3094f, 2.0f, 21.2417f)
                verticalLineTo(7.0f)
                lineTo(4.0f, 6.1429f)
                close()
                moveTo(16.2426f, 11.2426f)
                lineTo(12.0f, 15.4853f)
                lineTo(7.7574f, 11.2426f)
                curveTo(5.4142f, 8.8995f, 5.4142f, 5.1005f, 7.7574f, 2.7574f)
                curveTo(10.1005f, 0.4142f, 13.8995f, 0.4142f, 16.2426f, 2.7574f)
                curveTo(18.5858f, 5.1005f, 18.5858f, 8.8995f, 16.2426f, 11.2426f)
                close()
                moveTo(12.0f, 12.6569f)
                lineTo(14.8284f, 9.8284f)
                curveTo(16.3905f, 8.2663f, 16.3905f, 5.7337f, 14.8284f, 4.1716f)
                curveTo(13.2663f, 2.6095f, 10.7337f, 2.6095f, 9.1716f, 4.1716f)
                curveTo(7.6095f, 5.7337f, 7.6095f, 8.2663f, 9.1716f, 9.8284f)
                lineTo(12.0f, 12.6569f)
                close()
            }
        }
        .build()
        return `_road-map-line`!!
    }

private var `_road-map-line`: ImageVector? = null
