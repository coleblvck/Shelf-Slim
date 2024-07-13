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

public val MapGroup.`Treasure-map-fill`: ImageVector
    get() {
        if (`_treasure-map-fill` != null) {
            return `_treasure-map-fill`!!
        }
        `_treasure-map-fill` = Builder(name = "Treasure-map-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(6.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(10.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(16.0f, 10.9393f)
                lineTo(14.7626f, 9.7019f)
                lineTo(13.7019f, 10.7626f)
                lineTo(14.9393f, 12.0f)
                lineTo(13.7019f, 13.2374f)
                lineTo(14.7626f, 14.2981f)
                lineTo(16.0f, 13.0607f)
                lineTo(17.2374f, 14.2981f)
                lineTo(18.2981f, 13.2374f)
                lineTo(17.0607f, 12.0f)
                lineTo(18.2981f, 10.7626f)
                lineTo(17.2374f, 9.7019f)
                lineTo(16.0f, 10.9393f)
                close()
            }
        }
        .build()
        return `_treasure-map-fill`!!
    }

private var `_treasure-map-fill`: ImageVector? = null