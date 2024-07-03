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

public val BusinessGroup.`Medal-fill`: ImageVector
    get() {
        if (`_medal-fill` != null) {
            return `_medal-fill`!!
        }
        `_medal-fill` = Builder(name = "Medal-fill", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 10.5f)
                lineTo(10.6775f, 13.1797f)
                lineTo(7.7203f, 13.6094f)
                lineTo(9.8601f, 15.6953f)
                lineTo(9.355f, 18.6406f)
                lineTo(12.0f, 17.25f)
                lineTo(14.645f, 18.6406f)
                lineTo(14.1399f, 15.6953f)
                lineTo(16.2798f, 13.6094f)
                lineTo(13.3225f, 13.1797f)
                lineTo(12.0f, 10.5f)
                close()
                moveTo(13.0f, 1.999f)
                lineTo(18.0f, 2.0f)
                verticalLineTo(5.0f)
                lineTo(16.6366f, 6.1376f)
                curveTo(15.5305f, 5.5577f, 14.3025f, 5.1789f, 13.0011f, 5.0495f)
                lineTo(13.0f, 1.999f)
                close()
                moveTo(11.0f, 1.999f)
                lineTo(10.9997f, 5.0494f)
                curveTo(9.6984f, 5.1787f, 8.4705f, 5.5574f, 7.3644f, 6.1371f)
                lineTo(6.0f, 5.0f)
                verticalLineTo(2.0f)
                lineTo(11.0f, 1.999f)
                close()
            }
        }
        .build()
        return `_medal-fill`!!
    }

private var `_medal-fill`: ImageVector? = null
