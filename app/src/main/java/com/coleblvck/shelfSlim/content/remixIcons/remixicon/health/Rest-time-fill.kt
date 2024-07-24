package com.coleblvck.shelfSlim.content.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Rest-time-fill`: ImageVector
    get() {
        if (`_rest-time-fill` != null) {
            return `_rest-time-fill`!!
        }
        `_rest-time-fill` = Builder(name = "Rest-time-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                curveTo(19.0f, 18.4183f, 15.4183f, 22.0f, 11.0f, 22.0f)
                curveTo(6.5817f, 22.0f, 3.0f, 18.4183f, 3.0f, 14.0f)
                curveTo(3.0f, 9.6651f, 6.58f, 6.0f, 11.0f, 6.0f)
                close()
                moveTo(21.0f, 2.0f)
                verticalLineTo(4.0f)
                lineTo(15.6726f, 10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.0f)
                lineTo(18.3256f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return `_rest-time-fill`!!
    }

private var `_rest-time-fill`: ImageVector? = null
