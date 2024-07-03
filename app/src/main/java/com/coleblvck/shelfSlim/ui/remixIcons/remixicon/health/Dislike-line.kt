package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Dislike-line`: ImageVector
    get() {
        if (`_dislike-line` != null) {
            return `_dislike-line`!!
        }
        `_dislike-line` = Builder(name = "Dislike-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8078f, 1.3934f)
                lineTo(21.1925f, 19.7782f)
                lineTo(19.7783f, 21.1924f)
                lineTo(16.0316f, 17.4454f)
                lineTo(12.0f, 21.485f)
                lineTo(3.5215f, 12.993f)
                curveTo(1.4819f, 10.7094f, 1.4931f, 7.2401f, 3.5552f, 4.9696f)
                lineTo(1.3936f, 2.8076f)
                lineTo(2.8078f, 1.3934f)
                close()
                moveTo(4.9801f, 11.6232f)
                lineTo(12.0f, 18.6543f)
                lineTo(14.6176f, 16.0314f)
                lineTo(4.9721f, 6.3862f)
                curveTo(3.6782f, 7.8826f, 3.6714f, 10.121f, 4.9801f, 11.6232f)
                close()
                moveTo(20.2428f, 4.7574f)
                curveTo(22.5054f, 7.0247f, 22.5831f, 10.637f, 20.4788f, 12.993f)
                lineTo(18.8442f, 14.629f)
                lineTo(17.4302f, 13.215f)
                lineTo(19.0202f, 11.6232f)
                curveTo(20.3937f, 10.0467f, 20.3191f, 7.6652f, 18.8271f, 6.1701f)
                curveTo(17.3281f, 4.6679f, 14.9078f, 4.607f, 13.3371f, 6.0169f)
                lineTo(12.0021f, 7.2152f)
                lineTo(10.6662f, 6.0178f)
                curveTo(10.3163f, 5.7042f, 9.9249f, 5.4633f, 9.5112f, 5.2947f)
                lineTo(7.2604f, 3.0455f)
                curveTo(8.9293f, 2.8393f, 10.6682f, 3.3337f, 12.0011f, 4.5285f)
                curveTo(14.3502f, 2.42f, 17.9802f, 2.49f, 20.2428f, 4.7574f)
                close()
            }
        }
        .build()
        return `_dislike-line`!!
    }

private var `_dislike-line`: ImageVector? = null
