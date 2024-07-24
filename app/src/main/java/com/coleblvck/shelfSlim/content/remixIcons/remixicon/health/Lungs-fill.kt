package com.coleblvck.shelfSlim.content.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Lungs-fill`: ImageVector
    get() {
        if (`_lungs-fill` != null) {
            return `_lungs-fill`!!
        }
        `_lungs-fill` = Builder(name = "Lungs-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.5f)
                curveTo(9.9116f, 5.9705f, 10.5483f, 7.6588f, 10.8268f, 9.523f)
                lineTo(6.3039f, 12.134f)
                lineTo(7.3039f, 13.866f)
                lineTo(11.014f, 11.7247f)
                curveTo(11.0598f, 13.0789f, 11.0f, 14.3085f, 11.0f, 15.0f)
                curveTo(11.0f, 18.0f, 10.0f, 21.0f, 6.0f, 21.0f)
                curveTo(2.0f, 21.0f, 2.0f, 21.0f, 2.0f, 17.0f)
                curveTo(2.0f, 9.5f, 5.5005f, 4.5002f, 8.5f, 5.5f)
                close()
                moveTo(22.0012f, 17.0f)
                lineTo(22.001f, 17.436f)
                curveTo(21.9956f, 21.0f, 21.8503f, 21.0f, 18.0012f, 21.0f)
                curveTo(14.0012f, 21.0f, 13.0013f, 18.0f, 13.0013f, 15.0f)
                curveTo(13.0013f, 14.3086f, 12.9415f, 13.0795f, 12.9872f, 11.7257f)
                lineTo(16.6962f, 13.866f)
                lineTo(17.6962f, 12.134f)
                lineTo(13.1743f, 9.524f)
                curveTo(13.4527f, 7.6594f, 14.0894f, 5.9706f, 15.5013f, 5.5f)
                curveTo(18.5007f, 4.5002f, 22.0012f, 9.5f, 22.0012f, 17.0f)
                close()
                moveTo(13.0f, 2.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return `_lungs-fill`!!
    }

private var `_lungs-fill`: ImageVector? = null
