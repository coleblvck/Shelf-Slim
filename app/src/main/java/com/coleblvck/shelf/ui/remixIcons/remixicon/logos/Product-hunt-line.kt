package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Product-hunt-line`: ImageVector
    get() {
        if (`_product-hunt-line` != null) {
            return `_product-hunt-line`!!
        }
        `_product-hunt-line` = Builder(name = "Product-hunt-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 22.0f)
                curveTo(6.4781f, 22.0f, 2.001f, 17.5228f, 2.001f, 12.0f)
                curveTo(2.001f, 6.4771f, 6.4781f, 2.0f, 12.001f, 2.0f)
                curveTo(17.5238f, 2.0f, 22.001f, 6.4771f, 22.001f, 12.0f)
                curveTo(22.001f, 17.5228f, 17.5238f, 22.0f, 12.001f, 22.0f)
                close()
                moveTo(12.001f, 20.0f)
                curveTo(16.4193f, 20.0f, 20.001f, 16.4183f, 20.001f, 12.0f)
                curveTo(20.001f, 7.5817f, 16.4193f, 4.0f, 12.001f, 4.0f)
                curveTo(7.5827f, 4.0f, 4.001f, 7.5817f, 4.001f, 12.0f)
                curveTo(4.001f, 16.4183f, 7.5827f, 20.0f, 12.001f, 20.0f)
                close()
                moveTo(13.3345f, 12.0f)
                curveTo(14.1629f, 12.0f, 14.8345f, 11.3284f, 14.8345f, 10.5f)
                curveTo(14.8345f, 9.6716f, 14.1629f, 9.0f, 13.3345f, 9.0f)
                horizontalLineTo(10.501f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.3345f)
                close()
                moveTo(13.3345f, 7.0f)
                curveTo(15.2675f, 7.0f, 16.8345f, 8.567f, 16.8345f, 10.5f)
                curveTo(16.8345f, 12.433f, 15.2675f, 14.0f, 13.3345f, 14.0f)
                horizontalLineTo(10.501f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.501f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.3345f)
                close()
            }
        }
        .build()
        return `_product-hunt-line`!!
    }

private var `_product-hunt-line`: ImageVector? = null
