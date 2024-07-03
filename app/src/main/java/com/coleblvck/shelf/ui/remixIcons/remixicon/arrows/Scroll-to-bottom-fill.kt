package com.coleblvck.shelf.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Scroll-to-bottom-fill`: ImageVector
    get() {
        if (`_scroll-to-bottom-fill` != null) {
            return `_scroll-to-bottom-fill`!!
        }
        `_scroll-to-bottom-fill` = Builder(name = "Scroll-to-bottom-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8589f, 2.0f)
                horizontalLineTo(11.1411f)
                curveTo(9.1272f, 2.0f, 8.0472f, 2.2785f, 7.0695f, 2.8014f)
                curveTo(6.0917f, 3.3243f, 5.3243f, 4.0917f, 4.8014f, 5.0695f)
                curveTo(4.2785f, 6.0472f, 4.0f, 7.1272f, 4.0f, 9.1411f)
                verticalLineTo(14.8589f)
                curveTo(4.0f, 16.8728f, 4.2785f, 17.9528f, 4.8014f, 18.9305f)
                curveTo(5.3243f, 19.9083f, 6.0917f, 20.6757f, 7.0695f, 21.1986f)
                curveTo(8.0472f, 21.7215f, 9.1272f, 22.0f, 11.1411f, 22.0f)
                horizontalLineTo(12.8589f)
                curveTo(14.8728f, 22.0f, 15.9528f, 21.7215f, 16.9305f, 21.1986f)
                curveTo(17.9083f, 20.6757f, 18.6757f, 19.9083f, 19.1986f, 18.9305f)
                curveTo(19.7215f, 17.9528f, 20.0f, 16.8728f, 20.0f, 14.8589f)
                verticalLineTo(9.1411f)
                curveTo(20.0f, 7.1272f, 19.7215f, 6.0472f, 19.1986f, 5.0695f)
                curveTo(18.6757f, 4.0917f, 17.9083f, 3.3243f, 16.9305f, 2.8014f)
                curveTo(15.9528f, 2.2785f, 14.8728f, 2.0f, 12.8589f, 2.0f)
                close()
                moveTo(11.0f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(7.7578f, 13.758f)
                lineTo(9.172f, 12.3438f)
                lineTo(12.0005f, 15.1722f)
                lineTo(14.8289f, 12.3438f)
                lineTo(16.2431f, 13.758f)
                lineTo(12.0005f, 18.0006f)
                lineTo(7.7578f, 13.758f)
                close()
            }
        }
        .build()
        return `_scroll-to-bottom-fill`!!
    }

private var `_scroll-to-bottom-fill`: ImageVector? = null
