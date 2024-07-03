package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Safari-line`: ImageVector
    get() {
        if (`_safari-line` != null) {
            return `_safari-line`!!
        }
        `_safari-line` = Builder(name = "Safari-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8133f, 6.503f)
                lineTo(13.4152f, 13.4142f)
                lineTo(6.5039f, 17.8123f)
                curveTo(7.7093f, 18.9527f, 9.2692f, 19.7222f, 11.001f, 19.9381f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.001f)
                verticalLineTo(19.9381f)
                curveTo(14.4617f, 19.756f, 15.8001f, 19.18f, 16.9066f, 18.3199f)
                lineTo(15.5365f, 16.9497f)
                lineTo(16.9507f, 15.5355f)
                lineTo(18.3208f, 16.9056f)
                curveTo(19.181f, 15.7991f, 19.7569f, 14.4607f, 19.9391f, 13.0f)
                horizontalLineTo(18.001f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.9391f)
                curveTo(19.7231f, 9.2682f, 18.9536f, 7.7083f, 17.8133f, 6.503f)
                close()
                moveTo(17.498f, 6.1877f)
                curveTo(16.2927f, 5.0473f, 14.7328f, 4.2779f, 13.001f, 4.0619f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.001f)
                verticalLineTo(4.0619f)
                curveTo(9.5403f, 4.244f, 8.2019f, 4.82f, 7.0953f, 5.6801f)
                lineTo(8.4654f, 7.0503f)
                lineTo(7.0512f, 8.4645f)
                lineTo(5.6811f, 7.0944f)
                curveTo(4.821f, 8.2009f, 4.245f, 9.5393f, 4.0629f, 11.0f)
                horizontalLineTo(6.001f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0629f)
                curveTo(4.2788f, 14.7318f, 5.0483f, 16.2917f, 6.1887f, 17.4971f)
                lineTo(10.5868f, 10.5858f)
                lineTo(17.498f, 6.1877f)
                close()
                moveTo(12.001f, 22.0f)
                curveTo(6.4781f, 22.0f, 2.001f, 17.5228f, 2.001f, 12.0f)
                curveTo(2.001f, 6.4771f, 6.4781f, 2.0f, 12.001f, 2.0f)
                curveTo(17.5238f, 2.0f, 22.001f, 6.4771f, 22.001f, 12.0f)
                curveTo(22.001f, 17.5228f, 17.5238f, 22.0f, 12.001f, 22.0f)
                close()
            }
        }
        .build()
        return `_safari-line`!!
    }

private var `_safari-line`: ImageVector? = null
