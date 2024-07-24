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

public val LogosGroup.`Pixelfed-fill`: ImageVector
    get() {
        if (`_pixelfed-fill` != null) {
            return `_pixelfed-fill`!!
        }
        `_pixelfed-fill` = Builder(name = "Pixelfed-fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(13.0322f, 8.0986f)
                horizontalLineTo(10.4084f)
                curveTo(9.4204f, 8.0986f, 8.6194f, 8.8749f, 8.6194f, 9.8324f)
                verticalLineTo(16.5804f)
                lineTo(11.2143f, 14.109f)
                horizontalLineTo(13.0322f)
                curveTo(14.7448f, 14.109f, 16.1331f, 12.7635f, 16.1331f, 11.1038f)
                curveTo(16.1331f, 9.4441f, 14.7448f, 8.0986f, 13.0322f, 8.0986f)
                close()
            }
        }
        .build()
        return `_pixelfed-fill`!!
    }

private var `_pixelfed-fill`: ImageVector? = null
