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

public val HealthGroup.`Pulse-fill`: ImageVector
    get() {
        if (`_pulse-fill` != null) {
            return `_pulse-fill`!!
        }
        `_pulse-fill` = Builder(name = "Pulse-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.5386f)
                lineTo(15.0f, 21.5386f)
                lineTo(18.6594f, 13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.3406f)
                lineTo(15.0f, 16.4614f)
                lineTo(9.0f, 2.4614f)
                lineTo(5.3406f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.6594f)
                lineTo(9.0f, 7.5386f)
                close()
            }
        }
        .build()
        return `_pulse-fill`!!
    }

private var `_pulse-fill`: ImageVector? = null
