package com.coleblvck.shelf.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`China-railway-fill`: ImageVector
    get() {
        if (`_china-railway-fill` != null) {
            return `_china-railway-fill`!!
        }
        `_china-railway-fill` = Builder(name = "China-railway-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.0f)
                verticalLineTo(13.0f)
                lineTo(9.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                lineTo(13.0f, 13.0f)
                verticalLineTo(19.0f)
                lineTo(18.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                lineTo(11.0f, 19.0f)
                close()
                moveTo(10.0f, 2.223f)
                verticalLineTo(1.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.223f)
                curveTo(18.008f, 3.1325f, 21.0f, 6.7168f, 21.0f, 11.0f)
                curveTo(21.0f, 14.1235f, 19.4088f, 16.8754f, 16.9928f, 18.4892f)
                lineTo(15.8833f, 16.825f)
                curveTo(17.7624f, 15.5697f, 19.0f, 13.4294f, 19.0f, 11.0f)
                curveTo(19.0f, 7.134f, 15.866f, 4.0f, 12.0f, 4.0f)
                curveTo(8.134f, 4.0f, 5.0f, 7.134f, 5.0f, 11.0f)
                curveTo(5.0f, 13.4294f, 6.2376f, 15.5697f, 8.1167f, 16.825f)
                lineTo(7.0072f, 18.4892f)
                curveTo(4.5912f, 16.8754f, 3.0f, 14.1235f, 3.0f, 11.0f)
                curveTo(3.0f, 6.7168f, 5.992f, 3.1325f, 10.0f, 2.223f)
                close()
            }
        }
        .build()
        return `_china-railway-fill`!!
    }

private var `_china-railway-fill`: ImageVector? = null
