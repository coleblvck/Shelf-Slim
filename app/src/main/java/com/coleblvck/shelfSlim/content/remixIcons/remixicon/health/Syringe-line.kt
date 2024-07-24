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

public val HealthGroup.`Syringe-line`: ImageVector
    get() {
        if (`_syringe-line` != null) {
            return `_syringe-line`!!
        }
        `_syringe-line` = Builder(name = "Syringe-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.6779f, 7.9792f)
                lineTo(20.2637f, 9.3934f)
                lineTo(18.1424f, 7.2721f)
                lineTo(16.021f, 9.3934f)
                lineTo(19.5566f, 12.9289f)
                lineTo(18.1424f, 14.3431f)
                lineTo(17.4353f, 13.636f)
                lineTo(11.0713f, 20.0f)
                horizontalLineTo(5.4144f)
                lineTo(3.2931f, 22.1213f)
                lineTo(1.8789f, 20.7071f)
                lineTo(4.0002f, 18.5858f)
                verticalLineTo(12.9289f)
                lineTo(10.3642f, 6.565f)
                lineTo(9.6571f, 5.8579f)
                lineTo(11.0713f, 4.4436f)
                lineTo(14.6068f, 7.9792f)
                lineTo(16.7281f, 5.8579f)
                lineTo(14.6068f, 3.7365f)
                lineTo(16.021f, 2.3223f)
                lineTo(21.6779f, 7.9792f)
                close()
                moveTo(16.021f, 12.2218f)
                lineTo(11.7784f, 7.9792f)
                lineTo(10.3642f, 9.3934f)
                lineTo(12.4855f, 11.5147f)
                lineTo(11.0713f, 12.9289f)
                lineTo(8.95f, 10.8076f)
                lineTo(7.5358f, 12.2218f)
                lineTo(9.6571f, 14.3431f)
                lineTo(8.2429f, 15.7574f)
                lineTo(6.1216f, 13.636f)
                lineTo(6.0002f, 13.7574f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.2429f)
                lineTo(16.021f, 12.2218f)
                close()
            }
        }
        .build()
        return `_syringe-line`!!
    }

private var `_syringe-line`: ImageVector? = null
