package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Corner-up-left-double-fill`: ImageVector
    get() {
        if (`_corner-up-left-double-fill` != null) {
            return `_corner-up-left-double-fill`!!
        }
        `_corner-up-left-double-fill` = Builder(name = "Corner-up-left-double-fill", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0003f, 19.0001f)
                lineTo(20.0002f, 10.0002f)
                lineTo(14.4141f, 10.0002f)
                verticalLineTo(4.5859f)
                lineTo(7.9999f, 11.0001f)
                lineTo(14.4141f, 17.4143f)
                verticalLineTo(12.0002f)
                lineTo(18.0002f, 12.0002f)
                lineTo(18.0003f, 19.0001f)
                lineTo(20.0003f, 19.0001f)
                close()
                moveTo(10.1637f, 6.0502f)
                lineTo(8.7495f, 4.636f)
                lineTo(2.3855f, 11.0f)
                lineTo(8.7495f, 17.3639f)
                lineTo(10.1637f, 15.9497f)
                lineTo(5.214f, 11.0f)
                lineTo(10.1637f, 6.0502f)
                close()
            }
        }
        .build()
        return `_corner-up-left-double-fill`!!
    }

private var `_corner-up-left-double-fill`: ImageVector? = null
