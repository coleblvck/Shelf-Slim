package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Facebook-circle-line`: ImageVector
    get() {
        if (`_facebook-circle-line` != null) {
            return `_facebook-circle-line`!!
        }
        `_facebook-circle-line` = Builder(name = "Facebook-circle-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.001f, 19.9381f)
                curveTo(16.9473f, 19.446f, 20.001f, 16.0796f, 20.001f, 12.0f)
                curveTo(20.001f, 7.5817f, 16.4193f, 4.0f, 12.001f, 4.0f)
                curveTo(7.5827f, 4.0f, 4.001f, 7.5817f, 4.001f, 12.0f)
                curveTo(4.001f, 16.0796f, 7.0547f, 19.446f, 11.001f, 19.9381f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.001f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.001f)
                verticalLineTo(10.3458f)
                curveTo(11.001f, 9.0085f, 11.1402f, 8.5236f, 11.4017f, 8.0347f)
                curveTo(11.6631f, 7.5458f, 12.0468f, 7.1622f, 12.5357f, 6.9007f)
                curveTo(12.9184f, 6.696f, 13.3931f, 6.5725f, 14.2227f, 6.5195f)
                curveTo(14.5519f, 6.4985f, 14.9781f, 6.5253f, 15.501f, 6.6f)
                verticalLineTo(8.5f)
                horizontalLineTo(15.001f)
                curveTo(14.0837f, 8.5f, 13.7052f, 8.5433f, 13.4789f, 8.6643f)
                curveTo(13.3386f, 8.7394f, 13.2404f, 8.8376f, 13.1653f, 8.9779f)
                curveTo(13.0443f, 9.2042f, 13.001f, 9.4285f, 13.001f, 10.3458f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.501f)
                lineTo(15.001f, 14.0f)
                horizontalLineTo(13.001f)
                verticalLineTo(19.9381f)
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
        return `_facebook-circle-line`!!
    }

private var `_facebook-circle-line`: ImageVector? = null
