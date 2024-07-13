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

public val MapGroup.`Caravan-fill`: ImageVector
    get() {
        if (`_caravan-fill` != null) {
            return `_caravan-fill`!!
        }
        `_caravan-fill` = Builder(name = "Caravan-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1716f, 3.0f)
                curveTo(14.702f, 3.0f, 15.2107f, 3.2107f, 15.5858f, 3.5858f)
                lineTo(20.4142f, 8.4142f)
                curveTo(20.7893f, 8.7893f, 21.0f, 9.298f, 21.0f, 9.8284f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                lineTo(14.8738f, 19.0008f)
                curveTo(14.4295f, 20.7256f, 12.8636f, 22.0f, 11.0f, 22.0f)
                curveTo(9.1364f, 22.0f, 7.5705f, 20.7256f, 7.1262f, 19.0008f)
                lineTo(3.0f, 19.0f)
                curveTo(2.4477f, 19.0f, 2.0f, 18.5523f, 2.0f, 18.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.8954f, 2.8954f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(14.1716f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(9.8954f, 16.0f, 9.0f, 16.8954f, 9.0f, 18.0f)
                curveTo(9.0f, 19.1046f, 9.8954f, 20.0f, 11.0f, 20.0f)
                curveTo(12.1046f, 20.0f, 13.0f, 19.1046f, 13.0f, 18.0f)
                curveTo(13.0f, 16.8954f, 12.1046f, 16.0f, 11.0f, 16.0f)
                close()
                moveTo(14.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(12.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                close()
            }
        }
        .build()
        return `_caravan-fill`!!
    }

private var `_caravan-fill`: ImageVector? = null
