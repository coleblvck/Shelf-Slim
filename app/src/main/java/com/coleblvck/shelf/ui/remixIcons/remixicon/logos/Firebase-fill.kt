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

public val LogosGroup.`Firebase-fill`: ImageVector
    get() {
        if (`_firebase-fill` != null) {
            return `_firebase-fill`!!
        }
        `_firebase-fill` = Builder(name = "Firebase-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7565f, 1.5013f)
                lineTo(4.0f, 18.4998f)
                lineTo(4.0001f, 18.4998f)
                lineTo(9.4734f, 4.8165f)
                lineTo(7.6948f, 1.3529f)
                curveTo(7.4744f, 0.9236f, 6.8338f, 1.0249f, 6.7565f, 1.5013f)
                close()
                moveTo(11.5638f, 4.3179f)
                lineTo(4.0001f, 18.4998f)
                lineTo(4.0001f, 18.4999f)
                lineTo(13.8396f, 6.9491f)
                lineTo(12.4412f, 4.327f)
                curveTo(12.2546f, 3.9771f, 11.7558f, 3.9741f, 11.5638f, 4.3179f)
                close()
                moveTo(10.94f, 22.8373f)
                lineTo(4.0001f, 18.4999f)
                lineTo(17.31f, 5.6653f)
                curveTo(17.6037f, 5.3954f, 18.0834f, 5.5627f, 18.1424f, 5.9608f)
                lineTo(20.0f, 18.4998f)
                lineTo(13.06f, 22.8373f)
                curveTo(12.4115f, 23.2426f, 11.5885f, 23.2426f, 10.94f, 22.8373f)
                close()
            }
        }
        .build()
        return `_firebase-fill`!!
    }

private var `_firebase-fill`: ImageVector? = null
