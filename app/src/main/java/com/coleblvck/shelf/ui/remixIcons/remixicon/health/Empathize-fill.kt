package com.coleblvck.shelf.ui.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Empathize-fill`: ImageVector
    get() {
        if (`_empathize-fill` != null) {
            return `_empathize-fill`!!
        }
        `_empathize-fill` = Builder(name = "Empathize-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3643f, 10.9792f)
                curveTo(19.9264f, 12.5413f, 19.9264f, 15.0739f, 18.3643f, 16.636f)
                lineTo(12.7075f, 22.2929f)
                curveTo(12.317f, 22.6834f, 11.6838f, 22.6834f, 11.2933f, 22.2929f)
                lineTo(5.6364f, 16.636f)
                curveTo(4.0743f, 15.0739f, 4.0743f, 12.5413f, 5.6364f, 10.9792f)
                curveTo(7.1985f, 9.4171f, 9.7312f, 9.4171f, 11.2933f, 10.9792f)
                lineTo(11.9997f, 11.6856f)
                lineTo(12.7075f, 10.9792f)
                curveTo(14.2696f, 9.4171f, 16.8022f, 9.4171f, 18.3643f, 10.9792f)
                close()
                moveTo(12.0004f, 1.0f)
                curveTo(14.2095f, 1.0f, 16.0004f, 2.7909f, 16.0004f, 5.0f)
                curveTo(16.0004f, 7.2091f, 14.2095f, 9.0f, 12.0004f, 9.0f)
                curveTo(9.7912f, 9.0f, 8.0004f, 7.2091f, 8.0004f, 5.0f)
                curveTo(8.0004f, 2.7909f, 9.7912f, 1.0f, 12.0004f, 1.0f)
                close()
            }
        }
        .build()
        return `_empathize-fill`!!
    }

private var `_empathize-fill`: ImageVector? = null
