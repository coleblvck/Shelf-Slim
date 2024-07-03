package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Medal-line`: ImageVector
    get() {
        if (`_medal-line` != null) {
            return `_medal-line`!!
        }
        `_medal-line` = Builder(name = "Medal-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveTo(16.4183f, 7.0f, 20.0f, 10.5817f, 20.0f, 15.0f)
                curveTo(20.0f, 19.4183f, 16.4183f, 23.0f, 12.0f, 23.0f)
                curveTo(7.5817f, 23.0f, 4.0f, 19.4183f, 4.0f, 15.0f)
                curveTo(4.0f, 10.5817f, 7.5817f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(8.6863f, 9.0f, 6.0f, 11.6863f, 6.0f, 15.0f)
                curveTo(6.0f, 18.3137f, 8.6863f, 21.0f, 12.0f, 21.0f)
                curveTo(15.3137f, 21.0f, 18.0f, 18.3137f, 18.0f, 15.0f)
                curveTo(18.0f, 11.6863f, 15.3137f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 10.5f)
                lineTo(13.3225f, 13.1797f)
                lineTo(16.2798f, 13.6094f)
                lineTo(14.1399f, 15.6953f)
                lineTo(14.645f, 18.6406f)
                lineTo(12.0f, 17.25f)
                lineTo(9.355f, 18.6406f)
                lineTo(9.8601f, 15.6953f)
                lineTo(7.7203f, 13.6094f)
                lineTo(10.6775f, 13.1797f)
                lineTo(12.0f, 10.5f)
                close()
                moveTo(18.0f, 2.0f)
                verticalLineTo(5.0f)
                lineTo(16.6366f, 6.1375f)
                curveTo(15.5305f, 5.5577f, 14.3025f, 5.1788f, 13.0011f, 5.0495f)
                lineTo(13.0f, 1.999f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(11.0f, 1.999f)
                lineTo(10.9997f, 5.0494f)
                curveTo(9.6984f, 5.1786f, 8.4705f, 5.5574f, 7.3644f, 6.137f)
                lineTo(6.0f, 5.0f)
                verticalLineTo(2.0f)
                lineTo(11.0f, 1.999f)
                close()
            }
        }
        .build()
        return `_medal-line`!!
    }

private var `_medal-line`: ImageVector? = null
