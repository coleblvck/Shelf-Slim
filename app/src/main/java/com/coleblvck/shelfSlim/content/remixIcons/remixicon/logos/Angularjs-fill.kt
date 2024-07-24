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

public val LogosGroup.`Angularjs-fill`: ImageVector
    get() {
        if (`_angularjs-fill` != null) {
            return `_angularjs-fill`!!
        }
        `_angularjs-fill` = Builder(name = "Angularjs-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0002f, 2.0f)
                lineTo(21.3002f, 5.32f)
                lineTo(19.8817f, 17.63f)
                lineTo(12.0002f, 22.0f)
                lineTo(4.1187f, 17.63f)
                lineTo(2.7002f, 5.32f)
                lineTo(12.0002f, 2.0f)
                close()
                moveTo(12.0002f, 4.21f)
                lineTo(6.1865f, 17.26f)
                horizontalLineTo(8.3541f)
                lineTo(9.5229f, 14.34f)
                horizontalLineTo(14.4576f)
                lineTo(15.6263f, 17.26f)
                horizontalLineTo(17.794f)
                lineTo(12.0002f, 4.21f)
                close()
                moveTo(13.6984f, 12.54f)
                horizontalLineTo(10.302f)
                lineTo(12.0002f, 8.45f)
                lineTo(13.6984f, 12.54f)
                close()
            }
        }
        .build()
        return `_angularjs-fill`!!
    }

private var `_angularjs-fill`: ImageVector? = null
