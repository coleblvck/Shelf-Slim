package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Google-fill`: ImageVector
    get() {
        if (`_google-fill` != null) {
            return `_google-fill`!!
        }
        `_google-fill` = Builder(name = "Google-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0636f, 7.5091f)
                curveTo(4.7091f, 4.2409f, 8.0908f, 2.0f, 12.0f, 2.0f)
                curveTo(14.6954f, 2.0f, 16.959f, 2.991f, 18.6909f, 4.6045f)
                lineTo(15.8227f, 7.4727f)
                curveTo(14.7864f, 6.4819f, 13.4681f, 5.9773f, 12.0f, 5.9773f)
                curveTo(9.3954f, 5.9773f, 7.1908f, 7.7364f, 6.4046f, 10.1f)
                curveTo(6.2045f, 10.7f, 6.0909f, 11.3409f, 6.0909f, 12.0f)
                curveTo(6.0909f, 12.6591f, 6.2045f, 13.3f, 6.4046f, 13.9f)
                curveTo(7.1908f, 16.2636f, 9.3954f, 18.0227f, 12.0f, 18.0227f)
                curveTo(13.3454f, 18.0227f, 14.4909f, 17.6682f, 15.3864f, 17.0682f)
                curveTo(16.4454f, 16.3591f, 17.15f, 15.3f, 17.3818f, 14.05f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.1818f)
                horizontalLineTo(21.4181f)
                curveTo(21.5364f, 10.8363f, 21.6f, 11.5182f, 21.6f, 12.2273f)
                curveTo(21.6f, 15.2727f, 20.5091f, 17.8363f, 18.6181f, 19.5773f)
                curveTo(16.9636f, 21.1046f, 14.7f, 22.0f, 12.0f, 22.0f)
                curveTo(8.0908f, 22.0f, 4.7091f, 19.7591f, 3.0636f, 16.4909f)
                curveTo(2.3864f, 15.1409f, 2.0f, 13.6136f, 2.0f, 12.0f)
                curveTo(2.0f, 10.3864f, 2.3864f, 8.8591f, 3.0636f, 7.5091f)
                close()
            }
        }
        .build()
        return `_google-fill`!!
    }

private var `_google-fill`: ImageVector? = null
