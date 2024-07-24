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

public val LogosGroup.`Linkedin-fill`: ImageVector
    get() {
        if (`_linkedin-fill` != null) {
            return `_linkedin-fill`!!
        }
        `_linkedin-fill` = Builder(name = "Linkedin-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9405f, 4.9999f)
                curveTo(6.9401f, 5.8142f, 6.4461f, 6.547f, 5.6913f, 6.8527f)
                curveTo(4.9366f, 7.1585f, 4.0719f, 6.976f, 3.5049f, 6.3916f)
                curveTo(2.9379f, 5.807f, 2.7819f, 4.9372f, 3.1105f, 4.1921f)
                curveTo(3.4391f, 3.447f, 4.1865f, 2.9755f, 5.0005f, 2.9999f)
                curveTo(6.0816f, 3.0324f, 6.941f, 3.9184f, 6.9405f, 4.9999f)
                close()
                moveTo(7.0005f, 8.4799f)
                horizontalLineTo(3.0005f)
                verticalLineTo(20.9999f)
                horizontalLineTo(7.0005f)
                verticalLineTo(8.4799f)
                close()
                moveTo(13.3205f, 8.4799f)
                horizontalLineTo(9.3405f)
                verticalLineTo(20.9999f)
                horizontalLineTo(13.2805f)
                verticalLineTo(14.4299f)
                curveTo(13.2805f, 10.7699f, 18.0505f, 10.4299f, 18.0505f, 14.4299f)
                verticalLineTo(20.9999f)
                horizontalLineTo(22.0005f)
                verticalLineTo(13.0699f)
                curveTo(22.0005f, 6.8999f, 14.9405f, 7.1299f, 13.2805f, 10.1599f)
                lineTo(13.3205f, 8.4799f)
                close()
            }
        }
        .build()
        return `_linkedin-fill`!!
    }

private var `_linkedin-fill`: ImageVector? = null
