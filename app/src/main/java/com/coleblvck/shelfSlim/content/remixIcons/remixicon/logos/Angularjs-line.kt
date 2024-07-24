package com.coleblvck.shelfSlim.content.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Angularjs-line`: ImageVector
    get() {
        if (`_angularjs-line` != null) {
            return `_angularjs-line`!!
        }
        `_angularjs-line` = Builder(name = "Angularjs-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5235f, 16.6507f)
                lineTo(18.0126f, 16.3795f)
                lineTo(19.1315f, 6.6694f)
                lineTo(12.0002f, 4.1236f)
                lineTo(4.8689f, 6.6694f)
                lineTo(5.9878f, 16.3795f)
                lineTo(6.4617f, 16.6422f)
                lineTo(12.0002f, 4.21f)
                lineTo(17.5235f, 16.6507f)
                close()
                moveTo(16.4246f, 17.26f)
                horizontalLineTo(15.6263f)
                lineTo(14.4576f, 14.34f)
                horizontalLineTo(9.5229f)
                lineTo(8.3541f, 17.26f)
                horizontalLineTo(7.5758f)
                lineTo(12.0002f, 19.7131f)
                lineTo(16.4246f, 17.26f)
                close()
                moveTo(12.0002f, 2.0f)
                lineTo(21.3002f, 5.32f)
                lineTo(19.8817f, 17.63f)
                lineTo(12.0002f, 22.0f)
                lineTo(4.1187f, 17.63f)
                lineTo(2.7002f, 5.32f)
                lineTo(12.0002f, 2.0f)
                close()
                moveTo(13.6984f, 12.54f)
                lineTo(12.0002f, 8.45f)
                lineTo(10.302f, 12.54f)
                horizontalLineTo(13.6984f)
                close()
            }
        }
        .build()
        return `_angularjs-line`!!
    }

private var `_angularjs-line`: ImageVector? = null
