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

public val HealthGroup.`Stethoscope-line`: ImageVector
    get() {
        if (`_stethoscope-line` != null) {
            return `_stethoscope-line`!!
        }
        `_stethoscope-line` = Builder(name = "Stethoscope-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                curveTo(6.0f, 11.2091f, 7.7909f, 13.0f, 10.0f, 13.0f)
                curveTo(12.2091f, 13.0f, 14.0f, 11.2091f, 14.0f, 9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 3.0f, 16.0f, 3.4477f, 16.0f, 4.0f)
                verticalLineTo(9.0f)
                curveTo(16.0f, 11.9727f, 13.8381f, 14.4405f, 11.0008f, 14.9169f)
                lineTo(11.0f, 16.5f)
                curveTo(11.0f, 18.433f, 12.567f, 20.0f, 14.5f, 20.0f)
                curveTo(15.9973f, 20.0f, 17.275f, 19.0598f, 17.7749f, 17.7375f)
                curveTo(16.7283f, 17.27f, 16.0f, 16.2201f, 16.0f, 15.0f)
                curveTo(16.0f, 13.3431f, 17.3431f, 12.0f, 19.0f, 12.0f)
                curveTo(20.6569f, 12.0f, 22.0f, 13.3431f, 22.0f, 15.0f)
                curveTo(22.0f, 16.3711f, 21.0802f, 17.5274f, 19.824f, 17.8854f)
                curveTo(19.2102f, 20.252f, 17.0592f, 22.0f, 14.5f, 22.0f)
                curveTo(11.4624f, 22.0f, 9.0f, 19.5376f, 9.0f, 16.5f)
                lineTo(9.0002f, 14.9171f)
                curveTo(6.1624f, 14.4411f, 4.0f, 11.9731f, 4.0f, 9.0f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 3.4477f, 4.4477f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(19.0f, 14.0f)
                curveTo(18.4477f, 14.0f, 18.0f, 14.4477f, 18.0f, 15.0f)
                curveTo(18.0f, 15.5523f, 18.4477f, 16.0f, 19.0f, 16.0f)
                curveTo(19.5523f, 16.0f, 20.0f, 15.5523f, 20.0f, 15.0f)
                curveTo(20.0f, 14.4477f, 19.5523f, 14.0f, 19.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_stethoscope-line`!!
    }

private var `_stethoscope-line`: ImageVector? = null