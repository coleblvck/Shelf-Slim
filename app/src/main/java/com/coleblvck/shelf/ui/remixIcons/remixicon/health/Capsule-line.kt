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

public val HealthGroup.`Capsule-line`: ImageVector
    get() {
        if (`_capsule-line` != null) {
            return `_capsule-line`!!
        }
        `_capsule-line` = Builder(name = "Capsule-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7786f, 4.2218f)
                curveTo(22.1217f, 6.565f, 22.1217f, 10.364f, 19.7786f, 12.7071f)
                lineTo(12.7075f, 19.7782f)
                curveTo(10.3643f, 22.1213f, 6.5654f, 22.1213f, 4.2222f, 19.7782f)
                curveTo(1.8791f, 17.435f, 1.8791f, 13.6361f, 4.2222f, 11.2929f)
                lineTo(11.2933f, 4.2218f)
                curveTo(13.6364f, 1.8787f, 17.4354f, 1.8787f, 19.7786f, 4.2218f)
                close()
                moveTo(14.1224f, 15.5348f)
                lineTo(8.4656f, 9.878f)
                lineTo(5.6364f, 12.7071f)
                curveTo(4.0743f, 14.2692f, 4.0743f, 16.8019f, 5.6364f, 18.364f)
                curveTo(7.1985f, 19.9261f, 9.7312f, 19.9261f, 11.2933f, 18.364f)
                lineTo(14.1224f, 15.5348f)
                close()
                moveTo(18.3643f, 5.6361f)
                curveTo(16.8022f, 4.0739f, 14.2696f, 4.0739f, 12.7075f, 5.6361f)
                lineTo(9.8798f, 8.4638f)
                lineTo(15.5366f, 14.1206f)
                lineTo(18.3643f, 11.2929f)
                curveTo(19.9264f, 9.7308f, 19.9264f, 7.1982f, 18.3643f, 5.6361f)
                close()
            }
        }
        .build()
        return `_capsule-line`!!
    }

private var `_capsule-line`: ImageVector? = null
