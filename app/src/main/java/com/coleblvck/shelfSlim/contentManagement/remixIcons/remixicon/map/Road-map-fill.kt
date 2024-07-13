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

public val MapGroup.`Road-map-fill`: ImageVector
    get() {
        if (`_road-map-fill` != null) {
            return `_road-map-fill`!!
        }
        `_road-map-fill` = Builder(name = "Road-map-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9497f, 11.9497f)
                curveTo(18.7347f, 10.1648f, 19.3542f, 7.6556f, 18.8081f, 5.368f)
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
                lineTo(5.1289f, 5.659f)
                curveTo(4.7002f, 7.8663f, 5.3407f, 10.2402f, 7.0503f, 11.9497f)
                lineTo(12.0f, 16.8995f)
                lineTo(16.9497f, 11.9497f)
                close()
                moveTo(15.5355f, 10.5355f)
                lineTo(12.0f, 14.0711f)
                lineTo(8.4645f, 10.5355f)
                curveTo(6.5118f, 8.5829f, 6.5118f, 5.4171f, 8.4645f, 3.4645f)
                curveTo(10.4171f, 1.5118f, 13.5829f, 1.5118f, 15.5355f, 3.4645f)
                curveTo(17.4882f, 5.4171f, 17.4882f, 8.5829f, 15.5355f, 10.5355f)
                close()
            }
        }
        .build()
        return `_road-map-fill`!!
    }

private var `_road-map-fill`: ImageVector? = null
