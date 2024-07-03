package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Star-half-s-fill`: ImageVector
    get() {
        if (`_star-half-s-fill` != null) {
            return `_star-half-s-fill`!!
        }
        `_star-half-s-fill` = Builder(name = "Star-half-s-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 14.6564f)
                lineTo(14.8165f, 16.3769f)
                lineTo(14.0507f, 13.1664f)
                lineTo(16.5574f, 11.0192f)
                lineTo(13.2673f, 10.7554f)
                lineTo(11.9998f, 7.7079f)
                verticalLineTo(14.6564f)
                close()
                moveTo(11.9998f, 17.0f)
                lineTo(6.122f, 20.5902f)
                lineTo(7.7201f, 13.8906f)
                lineTo(2.4893f, 9.4098f)
                lineTo(9.3548f, 8.8594f)
                lineTo(11.9998f, 2.5f)
                lineTo(14.6449f, 8.8594f)
                lineTo(21.5104f, 9.4098f)
                lineTo(16.2796f, 13.8906f)
                lineTo(17.8777f, 20.5902f)
                lineTo(11.9998f, 17.0f)
                close()
            }
        }
        .build()
        return `_star-half-s-fill`!!
    }

private var `_star-half-s-fill`: ImageVector? = null
