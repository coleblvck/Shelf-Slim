package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Translate-2`: ImageVector
    get() {
        if (`_translate-2` != null) {
            return `_translate-2`!!
        }
        `_translate-2` = Builder(name = "Translate-2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 10.0f)
                lineTo(22.9f, 21.0f)
                horizontalLineTo(20.745f)
                lineTo(19.544f, 18.0f)
                horizontalLineTo(15.454f)
                lineTo(14.255f, 21.0f)
                horizontalLineTo(12.101f)
                lineTo(16.5f, 10.0f)
                horizontalLineTo(18.5f)
                close()
                moveTo(10.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                lineTo(14.0322f, 6.0006f)
                curveTo(13.2425f, 8.3662f, 11.9988f, 10.5057f, 10.4115f, 12.301f)
                curveTo(11.1344f, 12.9457f, 11.917f, 13.5176f, 12.7475f, 14.0079f)
                lineTo(11.9969f, 15.8855f)
                curveTo(10.9237f, 15.2781f, 9.9194f, 14.5524f, 8.9996f, 13.7249f)
                curveTo(7.214f, 15.332f, 5.1091f, 16.5553f, 2.7989f, 17.2734f)
                lineTo(2.2626f, 15.3442f)
                curveTo(4.2385f, 14.7203f, 6.0454f, 13.6737f, 7.5904f, 12.3021f)
                curveTo(6.4628f, 11.0281f, 5.5087f, 9.5799f, 4.7674f, 8.0003f)
                lineTo(7.0068f, 8.0004f)
                curveTo(7.5702f, 9.0388f, 8.2398f, 10.0033f, 8.9997f, 10.877f)
                curveTo(10.2283f, 9.4651f, 11.2205f, 7.8162f, 11.9095f, 6.001f)
                lineTo(2.0f, 6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(17.5f, 12.8852f)
                lineTo(16.253f, 16.0f)
                horizontalLineTo(18.745f)
                lineTo(17.5f, 12.8852f)
                close()
            }
        }
        .build()
        return `_translate-2`!!
    }

private var `_translate-2`: ImageVector? = null
