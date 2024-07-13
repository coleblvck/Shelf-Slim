package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.communication

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.CommunicationGroup

public val CommunicationGroup.`Speak-fill`: ImageVector
    get() {
        if (`_speak-fill` != null) {
            return `_speak-fill`!!
        }
        `_speak-fill` = Builder(name = "Speak-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                curveTo(13.0675f, 2.0f, 16.426f, 5.0356f, 16.9337f, 8.9649f)
                lineTo(19.1842f, 12.5037f)
                curveTo(19.3324f, 12.7367f, 19.3025f, 13.0847f, 18.9593f, 13.2317f)
                lineTo(17.0f, 14.071f)
                verticalLineTo(17.0f)
                curveTo(17.0f, 18.1046f, 16.1046f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(13.001f)
                lineTo(13.0f, 22.0f)
                horizontalLineTo(4.0f)
                lineTo(4.0002f, 18.3061f)
                curveTo(4.0003f, 17.1252f, 3.5635f, 16.0087f, 2.7555f, 15.0011f)
                curveTo(1.6571f, 13.6313f, 1.0f, 11.8924f, 1.0f, 10.0f)
                curveTo(1.0f, 5.5817f, 4.5817f, 2.0f, 9.0f, 2.0f)
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
        return `_speak-fill`!!
    }

private var `_speak-fill`: ImageVector? = null
