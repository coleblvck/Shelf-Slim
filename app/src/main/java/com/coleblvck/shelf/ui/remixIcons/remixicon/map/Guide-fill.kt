package com.coleblvck.shelf.ui.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.MapGroup

public val MapGroup.`Guide-fill`: ImageVector
    get() {
        if (`_guide-fill` != null) {
            return `_guide-fill`!!
        }
        `_guide-fill` = Builder(name = "Guide-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.0f)
                verticalLineTo(16.0f)
                curveTo(13.0f, 17.6569f, 11.6569f, 19.0f, 10.0f, 19.0f)
                horizontalLineTo(7.8293f)
                curveTo(7.4175f, 20.1652f, 6.3062f, 21.0f, 5.0f, 21.0f)
                curveTo(3.3431f, 21.0f, 2.0f, 19.6569f, 2.0f, 18.0f)
                curveTo(2.0f, 16.3431f, 3.3431f, 15.0f, 5.0f, 15.0f)
                curveTo(6.3062f, 15.0f, 7.4175f, 15.8348f, 7.8293f, 17.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 17.0f, 11.0f, 16.5523f, 11.0f, 16.0f)
                verticalLineTo(8.0f)
                curveTo(11.0f, 6.3432f, 12.3431f, 5.0f, 14.0f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                lineTo(22.0f, 6.0f)
                lineTo(17.0f, 10.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4477f, 7.0f, 13.0f, 7.4477f, 13.0f, 8.0f)
                close()
            }
        }
        .build()
        return `_guide-fill`!!
    }

private var `_guide-fill`: ImageVector? = null
