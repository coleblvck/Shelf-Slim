package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Corner-up-left-double-line`: ImageVector
    get() {
        if (`_corner-up-left-double-line` != null) {
            return `_corner-up-left-double-line`!!
        }
        `_corner-up-left-double-line` = Builder(name = "Corner-up-left-double-line", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0003f)
                lineTo(20.0001f, 19.0001f)
                lineTo(18.0001f, 19.0002f)
                lineTo(18.0f, 12.0002f)
                lineTo(11.8282f, 12.0002f)
                lineTo(15.7779f, 15.9499f)
                lineTo(14.3637f, 17.3641f)
                lineTo(7.9997f, 11.0001f)
                lineTo(14.3637f, 4.6362f)
                lineTo(15.7779f, 6.0504f)
                lineTo(11.8281f, 10.0002f)
                lineTo(20.0f, 10.0003f)
                close()
                moveTo(8.7495f, 4.6362f)
                lineTo(10.1638f, 6.0504f)
                lineTo(5.214f, 11.0001f)
                lineTo(10.1638f, 15.9499f)
                lineTo(8.7495f, 17.3641f)
                lineTo(2.3856f, 11.0001f)
                lineTo(8.7495f, 4.6362f)
                close()
            }
        }
        .build()
        return `_corner-up-left-double-line`!!
    }

private var `_corner-up-left-double-line`: ImageVector? = null
