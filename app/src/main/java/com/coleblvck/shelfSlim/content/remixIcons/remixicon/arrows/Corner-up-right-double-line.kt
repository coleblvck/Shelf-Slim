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

public val ArrowsGroup.`Corner-up-right-double-line`: ImageVector
    get() {
        if (`_corner-up-right-double-line` != null) {
            return `_corner-up-right-double-line`!!
        }
        `_corner-up-right-double-line` = Builder(name = "Corner-up-right-double-line", defaultWidth
                = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.0003f)
                lineTo(3.9999f, 19.0001f)
                lineTo(5.9999f, 19.0002f)
                lineTo(6.0f, 12.0002f)
                lineTo(12.1718f, 12.0002f)
                lineTo(8.2221f, 15.9499f)
                lineTo(9.6363f, 17.3641f)
                lineTo(16.0003f, 11.0001f)
                lineTo(9.6363f, 4.6362f)
                lineTo(8.2221f, 6.0504f)
                lineTo(12.1719f, 10.0002f)
                lineTo(4.0f, 10.0003f)
                close()
                moveTo(15.2504f, 4.6362f)
                lineTo(13.8362f, 6.0504f)
                lineTo(18.786f, 11.0001f)
                lineTo(13.8362f, 15.9499f)
                lineTo(15.2504f, 17.3641f)
                lineTo(21.6144f, 11.0001f)
                lineTo(15.2504f, 4.6362f)
                close()
            }
        }
        .build()
        return `_corner-up-right-double-line`!!
    }

private var `_corner-up-right-double-line`: ImageVector? = null
