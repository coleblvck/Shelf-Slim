package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Navigation-fill`: ImageVector
    get() {
        if (`_navigation-fill` != null) {
            return `_navigation-fill`!!
        }
        `_navigation-fill` = Builder(name = "Navigation-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8995f, 2.2998f)
                lineTo(21.7052f, 8.5684f)
                curveTo(21.9672f, 8.6557f, 22.1088f, 8.9389f, 22.0215f, 9.2009f)
                curveTo(21.975f, 9.3404f, 21.8694f, 9.4524f, 21.7328f, 9.507f)
                lineTo(13.0002f, 13.0001f)
                lineTo(8.575f, 21.8504f)
                curveTo(8.4515f, 22.0974f, 8.1512f, 22.1975f, 7.9042f, 22.074f)
                curveTo(7.7788f, 22.0113f, 7.6855f, 21.8989f, 7.647f, 21.7641f)
                lineTo(2.2606f, 2.9115f)
                curveTo(2.1847f, 2.646f, 2.3385f, 2.3693f, 2.604f, 2.2934f)
                curveTo(2.7009f, 2.2657f, 2.8039f, 2.268f, 2.8995f, 2.2998f)
                close()
            }
        }
        .build()
        return `_navigation-fill`!!
    }

private var `_navigation-fill`: ImageVector? = null
