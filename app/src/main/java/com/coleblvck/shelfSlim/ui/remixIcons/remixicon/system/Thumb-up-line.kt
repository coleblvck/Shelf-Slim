package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Thumb-up-line`: ImageVector
    get() {
        if (`_thumb-up-line` != null) {
            return `_thumb-up-line`!!
        }
        `_thumb-up-line` = Builder(name = "Thumb-up-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5998f, 8.0003f)
                horizontalLineTo(21.0f)
                curveTo(22.1046f, 8.0003f, 23.0f, 8.8958f, 23.0f, 10.0003f)
                verticalLineTo(12.1047f)
                curveTo(23.0f, 12.3659f, 22.9488f, 12.6246f, 22.8494f, 12.8662f)
                lineTo(19.755f, 20.3811f)
                curveTo(19.6007f, 20.7558f, 19.2355f, 21.0003f, 18.8303f, 21.0003f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 21.0003f, 1.0f, 20.5526f, 1.0f, 20.0003f)
                verticalLineTo(10.0003f)
                curveTo(1.0f, 9.448f, 1.4477f, 9.0003f, 2.0f, 9.0003f)
                horizontalLineTo(5.4818f)
                curveTo(5.8068f, 9.0003f, 6.1114f, 8.8425f, 6.2988f, 8.577f)
                lineTo(11.7522f, 0.8514f)
                curveTo(11.8947f, 0.6495f, 12.1633f, 0.582f, 12.3843f, 0.6925f)
                lineTo(14.1984f, 1.5995f)
                curveTo(15.25f, 2.1253f, 15.7931f, 3.3129f, 15.5031f, 4.4524f)
                lineTo(14.5998f, 8.0003f)
                close()
                moveTo(7.0f, 10.5878f)
                verticalLineTo(19.0003f)
                horizontalLineTo(18.1606f)
                lineTo(21.0f, 12.1047f)
                verticalLineTo(10.0003f)
                horizontalLineTo(14.5998f)
                curveTo(13.2951f, 10.0003f, 12.3398f, 8.7713f, 12.6616f, 7.5069f)
                lineTo(13.5649f, 3.9589f)
                curveTo(13.6229f, 3.7311f, 13.5143f, 3.4935f, 13.3039f, 3.3884f)
                lineTo(12.6428f, 3.0578f)
                lineTo(7.9328f, 9.7304f)
                curveTo(7.6828f, 10.0844f, 7.3634f, 10.3746f, 7.0f, 10.5878f)
                close()
                moveTo(5.0f, 11.0003f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0003f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0003f)
                close()
            }
        }
        .build()
        return `_thumb-up-line`!!
    }

private var `_thumb-up-line`: ImageVector? = null
