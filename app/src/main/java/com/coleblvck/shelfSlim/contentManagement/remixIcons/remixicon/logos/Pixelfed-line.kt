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

public val LogosGroup.`Pixelfed-line`: ImageVector
    get() {
        if (`_pixelfed-line` != null) {
            return `_pixelfed-line`!!
        }
        `_pixelfed-line` = Builder(name = "Pixelfed-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(17.5238f, 2.0f, 22.001f, 6.4771f, 22.001f, 12.0f)
                curveTo(22.001f, 17.5228f, 17.5238f, 22.0f, 12.001f, 22.0f)
                curveTo(6.4781f, 22.0f, 2.001f, 17.5228f, 2.001f, 12.0f)
                curveTo(2.001f, 6.4771f, 6.4781f, 2.0f, 12.001f, 2.0f)
                close()
                moveTo(12.001f, 4.0f)
                curveTo(7.5827f, 4.0f, 4.001f, 7.5817f, 4.001f, 12.0f)
                curveTo(4.001f, 16.4183f, 7.5827f, 20.0f, 12.001f, 20.0f)
                curveTo(16.4193f, 20.0f, 20.001f, 16.4183f, 20.001f, 12.0f)
                curveTo(20.001f, 7.5817f, 16.4193f, 4.0f, 12.001f, 4.0f)
                close()
                moveTo(13.0322f, 8.0986f)
                curveTo(14.7448f, 8.0986f, 16.1331f, 9.4441f, 16.1331f, 11.1038f)
                curveTo(16.1331f, 12.7635f, 14.7448f, 14.109f, 13.0322f, 14.109f)
                horizontalLineTo(11.2143f)
                lineTo(8.6194f, 16.5804f)
                verticalLineTo(9.8324f)
                curveTo(8.6194f, 8.8749f, 9.4204f, 8.0986f, 10.4084f, 8.0986f)
                horizontalLineTo(13.0322f)
                close()
            }
        }
        .build()
        return `_pixelfed-line`!!
    }

private var `_pixelfed-line`: ImageVector? = null
