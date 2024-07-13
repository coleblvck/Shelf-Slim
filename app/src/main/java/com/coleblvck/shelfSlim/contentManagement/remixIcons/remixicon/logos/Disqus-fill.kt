package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Disqus-fill`: ImageVector
    get() {
        if (`_disqus-fill` != null) {
            return `_disqus-fill`!!
        }
        `_disqus-fill` = Builder(name = "Disqus-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(9.4702f, 22.0f, 7.1597f, 21.0606f, 5.3986f, 19.5116f)
                lineTo(1.5f, 20.0f)
                lineTo(2.9235f, 16.2031f)
                curveTo(2.3308f, 14.9253f, 2.0f, 13.5013f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 7.0003f)
                verticalLineTo(17.0003f)
                horizontalLineTo(11.7335f)
                lineTo(11.9959f, 16.9963f)
                curveTo(15.3714f, 16.8928f, 17.3333f, 14.7848f, 17.3333f, 11.9714f)
                verticalLineTo(11.9436f)
                lineTo(17.3295f, 11.7287f)
                curveTo(17.2307f, 8.9563f, 15.2107f, 7.0003f, 11.7896f, 7.0003f)
                horizontalLineTo(8.0f)
                close()
                moveTo(11.8314f, 9.4579f)
                curveTo(13.4594f, 9.4579f, 14.54f, 10.3861f, 14.54f, 11.9868f)
                verticalLineTo(12.0147f)
                lineTo(14.5352f, 12.1978f)
                curveTo(14.4561f, 13.6979f, 13.3968f, 14.5434f, 11.8314f, 14.5434f)
                horizontalLineTo(10.723f)
                verticalLineTo(9.4579f)
                horizontalLineTo(11.8314f)
                close()
            }
        }
        .build()
        return `_disqus-fill`!!
    }

private var `_disqus-fill`: ImageVector? = null
