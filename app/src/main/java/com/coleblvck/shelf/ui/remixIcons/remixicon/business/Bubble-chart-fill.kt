package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Bubble-chart-fill`: ImageVector
    get() {
        if (`_bubble-chart-fill` != null) {
            return `_bubble-chart-fill`!!
        }
        `_bubble-chart-fill` = Builder(name = "Bubble-chart-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.0f)
                curveTo(17.6569f, 16.0f, 19.0f, 17.3431f, 19.0f, 19.0f)
                curveTo(19.0f, 20.6569f, 17.6569f, 22.0f, 16.0f, 22.0f)
                curveTo(14.3431f, 22.0f, 13.0f, 20.6569f, 13.0f, 19.0f)
                curveTo(13.0f, 17.3431f, 14.3431f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(6.0f, 12.0f)
                curveTo(8.2091f, 12.0f, 10.0f, 13.7909f, 10.0f, 16.0f)
                curveTo(10.0f, 18.2091f, 8.2091f, 20.0f, 6.0f, 20.0f)
                curveTo(3.7909f, 20.0f, 2.0f, 18.2091f, 2.0f, 16.0f)
                curveTo(2.0f, 13.7909f, 3.7909f, 12.0f, 6.0f, 12.0f)
                close()
                moveTo(14.5f, 2.0f)
                curveTo(17.5376f, 2.0f, 20.0f, 4.4624f, 20.0f, 7.5f)
                curveTo(20.0f, 10.5376f, 17.5376f, 13.0f, 14.5f, 13.0f)
                curveTo(11.4624f, 13.0f, 9.0f, 10.5376f, 9.0f, 7.5f)
                curveTo(9.0f, 4.4624f, 11.4624f, 2.0f, 14.5f, 2.0f)
                close()
            }
        }
        .build()
        return `_bubble-chart-fill`!!
    }

private var `_bubble-chart-fill`: ImageVector? = null
