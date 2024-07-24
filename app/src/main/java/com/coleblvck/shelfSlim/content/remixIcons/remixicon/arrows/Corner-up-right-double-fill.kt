package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Corner-up-right-double-fill`: ImageVector
    get() {
        if (`_corner-up-right-double-fill` != null) {
            return `_corner-up-right-double-fill`!!
        }
        `_corner-up-right-double-fill` = Builder(name = "Corner-up-right-double-fill", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9997f, 19.0001f)
                lineTo(3.9998f, 10.0002f)
                lineTo(9.5858f, 10.0002f)
                verticalLineTo(4.5859f)
                lineTo(16.0001f, 11.0001f)
                lineTo(9.5858f, 17.4143f)
                verticalLineTo(12.0002f)
                lineTo(5.9998f, 12.0002f)
                lineTo(5.9997f, 19.0001f)
                lineTo(3.9997f, 19.0001f)
                close()
                moveTo(13.8363f, 6.0502f)
                lineTo(15.2505f, 4.636f)
                lineTo(21.6144f, 11.0f)
                lineTo(15.2505f, 17.3639f)
                lineTo(13.8363f, 15.9497f)
                lineTo(18.786f, 11.0f)
                lineTo(13.8363f, 6.0502f)
                close()
            }
        }
        .build()
        return `_corner-up-right-double-fill`!!
    }

private var `_corner-up-right-double-fill`: ImageVector? = null
