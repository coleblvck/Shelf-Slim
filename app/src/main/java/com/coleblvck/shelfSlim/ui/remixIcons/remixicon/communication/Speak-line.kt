package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Speak-line`: ImageVector
    get() {
        if (`_speak-line` != null) {
            return `_speak-line`!!
        }
        `_speak-line` = Builder(name = "Speak-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9337f, 8.9649f)
                curveTo(16.426f, 5.0356f, 13.0675f, 2.0f, 9.0f, 2.0f)
                curveTo(4.5817f, 2.0f, 1.0f, 5.5817f, 1.0f, 10.0f)
                curveTo(1.0f, 11.8924f, 1.6571f, 13.6313f, 2.7555f, 15.0011f)
                curveTo(3.5635f, 16.0087f, 4.0003f, 17.1252f, 4.0002f, 18.3061f)
                lineTo(4.0f, 22.0f)
                horizontalLineTo(13.0f)
                lineTo(13.001f, 19.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1046f, 19.0f, 17.0f, 18.1046f, 17.0f, 17.0f)
                verticalLineTo(14.071f)
                lineTo(18.9593f, 13.2317f)
                curveTo(19.3025f, 13.0847f, 19.3324f, 12.7367f, 19.1842f, 12.5037f)
                lineTo(16.9337f, 8.9649f)
                close()
                moveTo(3.0f, 10.0f)
                curveTo(3.0f, 6.6863f, 5.6863f, 4.0f, 9.0f, 4.0f)
                curveTo(12.0243f, 4.0f, 14.5665f, 6.2514f, 14.9501f, 9.2212f)
                lineTo(15.0072f, 9.6626f)
                lineTo(16.5497f, 12.0881f)
                lineTo(15.0f, 12.7519f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0017f)
                lineTo(11.0007f, 20.0f)
                horizontalLineTo(6.0001f)
                lineTo(6.0002f, 18.3063f)
                curveTo(6.0004f, 16.6672f, 5.4096f, 15.114f, 4.3158f, 13.7499f)
                curveTo(3.4682f, 12.6929f, 3.0f, 11.3849f, 3.0f, 10.0f)
                close()
                moveTo(21.1535f, 18.1024f)
                lineTo(19.4893f, 16.9929f)
                curveTo(20.4436f, 15.5642f, 21.0f, 13.8471f, 21.0f, 12.0001f)
                curveTo(21.0f, 10.153f, 20.4436f, 8.4359f, 19.4893f, 7.0072f)
                lineTo(21.1535f, 5.8977f)
                curveTo(22.32f, 7.6439f, 23.0f, 9.7425f, 23.0f, 12.0001f)
                curveTo(23.0f, 14.2576f, 22.32f, 16.3562f, 21.1535f, 18.1024f)
                close()
            }
        }
        .build()
        return `_speak-line`!!
    }

private var `_speak-line`: ImageVector? = null
