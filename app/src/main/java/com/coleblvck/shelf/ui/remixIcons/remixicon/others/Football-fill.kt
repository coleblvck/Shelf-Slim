package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Football-fill`: ImageVector
    get() {
        if (`_football-fill` != null) {
            return `_football-fill`!!
        }
        `_football-fill` = Builder(name = "Football-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.6695f, 15.9999f)
                horizontalLineTo(10.3295f)
                lineTo(8.9505f, 17.8969f)
                lineTo(9.5044f, 19.6031f)
                curveTo(10.2897f, 19.8607f, 11.1286f, 20.0f, 12.0f, 20.0f)
                curveTo(12.8714f, 20.0f, 13.7103f, 19.8607f, 14.4956f, 19.6031f)
                lineTo(15.0485f, 17.8969f)
                lineTo(13.6695f, 15.9999f)
                close()
                moveTo(5.2935f, 10.8719f)
                lineTo(4.0022f, 11.8095f)
                lineTo(4.0f, 12.0f)
                curveTo(4.0f, 13.7297f, 4.5489f, 15.3312f, 5.4821f, 16.6397f)
                lineTo(7.3925f, 16.6399f)
                lineTo(8.7145f, 14.8199f)
                lineTo(7.6865f, 11.6499f)
                lineTo(5.2935f, 10.8719f)
                close()
                moveTo(18.7055f, 10.8719f)
                lineTo(16.3125f, 11.6499f)
                lineTo(15.2845f, 14.8199f)
                lineTo(16.6065f, 16.6399f)
                lineTo(18.5179f, 16.6397f)
                curveTo(19.4511f, 15.3312f, 20.0f, 13.7297f, 20.0f, 12.0f)
                lineTo(19.997f, 11.809f)
                lineTo(18.7055f, 10.8719f)
                close()
                moveTo(14.2914f, 4.333f)
                lineTo(12.9995f, 5.2729f)
                verticalLineTo(7.7899f)
                lineTo(15.6935f, 9.7469f)
                lineTo(17.9325f, 9.0199f)
                lineTo(18.4867f, 7.3168f)
                curveTo(17.467f, 5.9068f, 15.9988f, 4.8425f, 14.2914f, 4.333f)
                close()
                moveTo(9.7086f, 4.333f)
                curveTo(8.0008f, 4.8426f, 6.5324f, 5.9074f, 5.5126f, 7.3178f)
                lineTo(6.0665f, 9.0199f)
                lineTo(8.3055f, 9.7469f)
                lineTo(10.9995f, 7.7899f)
                verticalLineTo(5.2729f)
                lineTo(9.7086f, 4.333f)
                close()
            }
        }
        .build()
        return `_football-fill`!!
    }

private var `_football-fill`: ImageVector? = null
