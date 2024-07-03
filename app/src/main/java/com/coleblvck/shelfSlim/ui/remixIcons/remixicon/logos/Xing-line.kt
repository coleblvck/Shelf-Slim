package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Xing-line`: ImageVector
    get() {
        if (`_xing-line` != null) {
            return `_xing-line`!!
        }
        `_xing-line` = Builder(name = "Xing-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4443f, 3.5f)
                lineTo(13.8099f, 14.9901f)
                lineTo(17.8573f, 22.0f)
                horizontalLineTo(15.5473f)
                lineTo(11.5021f, 14.9914f)
                lineTo(11.5003f, 14.9904f)
                lineTo(18.1343f, 3.5f)
                horizontalLineTo(20.4443f)
                close()
                moveTo(8.3103f, 7.0f)
                lineTo(10.7324f, 11.1962f)
                lineTo(10.7305f, 11.1973f)
                lineTo(7.6693f, 16.5f)
                horizontalLineTo(5.3613f)
                lineTo(8.4221f, 11.1951f)
                lineTo(6.0013f, 7.0f)
                horizontalLineTo(8.3103f)
                close()
            }
        }
        .build()
        return `_xing-line`!!
    }

private var `_xing-line`: ImageVector? = null
