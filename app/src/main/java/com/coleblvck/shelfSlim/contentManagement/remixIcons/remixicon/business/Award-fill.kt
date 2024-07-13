package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Award-fill`: ImageVector
    get() {
        if (`_award-fill` != null) {
            return `_award-fill`!!
        }
        `_award-fill` = Builder(name = "Award-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.2454f)
                verticalLineTo(22.1169f)
                curveTo(17.0f, 22.393f, 16.7761f, 22.617f, 16.5f, 22.617f)
                curveTo(16.4094f, 22.617f, 16.3205f, 22.5923f, 16.2428f, 22.5457f)
                lineTo(12.0f, 20.0f)
                lineTo(7.7572f, 22.5457f)
                curveTo(7.5205f, 22.6877f, 7.2133f, 22.6109f, 7.0712f, 22.3742f)
                curveTo(7.0246f, 22.2964f, 7.0f, 22.2075f, 7.0f, 22.1169f)
                verticalLineTo(15.2454f)
                curveTo(5.1711f, 13.7793f, 4.0f, 11.5264f, 4.0f, 9.0f)
                curveTo(4.0f, 4.5817f, 7.5817f, 1.0f, 12.0f, 1.0f)
                curveTo(16.4183f, 1.0f, 20.0f, 4.5817f, 20.0f, 9.0f)
                curveTo(20.0f, 11.5264f, 18.8289f, 13.7793f, 17.0f, 15.2454f)
                close()
                moveTo(12.0f, 15.0f)
                curveTo(15.3137f, 15.0f, 18.0f, 12.3137f, 18.0f, 9.0f)
                curveTo(18.0f, 5.6863f, 15.3137f, 3.0f, 12.0f, 3.0f)
                curveTo(8.6863f, 3.0f, 6.0f, 5.6863f, 6.0f, 9.0f)
                curveTo(6.0f, 12.3137f, 8.6863f, 15.0f, 12.0f, 15.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(9.7909f, 13.0f, 8.0f, 11.2091f, 8.0f, 9.0f)
                curveTo(8.0f, 6.7909f, 9.7909f, 5.0f, 12.0f, 5.0f)
                curveTo(14.2091f, 5.0f, 16.0f, 6.7909f, 16.0f, 9.0f)
                curveTo(16.0f, 11.2091f, 14.2091f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_award-fill`!!
    }

private var `_award-fill`: ImageVector? = null
