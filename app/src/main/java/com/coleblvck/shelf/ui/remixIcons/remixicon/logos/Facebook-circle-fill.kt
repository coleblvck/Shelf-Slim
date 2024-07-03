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

public val LogosGroup.`Facebook-circle-fill`: ImageVector
    get() {
        if (`_facebook-circle-fill` != null) {
            return `_facebook-circle-fill`!!
        }
        `_facebook-circle-fill` = Builder(name = "Facebook-circle-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 2.0f)
                curveTo(6.4781f, 2.0f, 2.001f, 6.4771f, 2.001f, 12.0f)
                curveTo(2.001f, 16.9913f, 5.6578f, 21.1283f, 10.4385f, 21.8785f)
                verticalLineTo(14.8906f)
                horizontalLineTo(7.8994f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.4385f)
                verticalLineTo(9.7969f)
                curveTo(10.4385f, 7.2906f, 11.9314f, 5.9063f, 14.2156f, 5.9063f)
                curveTo(15.3097f, 5.9063f, 16.4541f, 6.1016f, 16.4541f, 6.1016f)
                verticalLineTo(8.5625f)
                horizontalLineTo(15.1931f)
                curveTo(13.9509f, 8.5625f, 13.5635f, 9.3333f, 13.5635f, 10.1242f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.3369f)
                lineTo(15.8936f, 14.8906f)
                horizontalLineTo(13.5635f)
                verticalLineTo(21.8785f)
                curveTo(18.3441f, 21.1283f, 22.001f, 16.9913f, 22.001f, 12.0f)
                curveTo(22.001f, 6.4771f, 17.5238f, 2.0f, 12.001f, 2.0f)
                close()
            }
        }
        .build()
        return `_facebook-circle-fill`!!
    }

private var `_facebook-circle-fill`: ImageVector? = null
