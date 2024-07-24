package com.coleblvck.shelfSlim.content.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.MapGroup

public val MapGroup.`Pin-distance-fill`: ImageVector
    get() {
        if (`_pin-distance-fill` != null) {
            return `_pin-distance-fill`!!
        }
        `_pin-distance-fill` = Builder(name = "Pin-distance-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3891f, 10.3891f)
                lineTo(7.5f, 14.2782f)
                lineTo(3.6109f, 10.3891f)
                curveTo(1.463f, 8.2412f, 1.463f, 4.7588f, 3.6109f, 2.6109f)
                curveTo(5.7588f, 0.463f, 9.2412f, 0.463f, 11.3891f, 2.6109f)
                curveTo(13.537f, 4.7588f, 13.537f, 8.2412f, 11.3891f, 10.3891f)
                close()
                moveTo(7.5f, 8.5f)
                curveTo(8.6046f, 8.5f, 9.5f, 7.6046f, 9.5f, 6.5f)
                curveTo(9.5f, 5.3954f, 8.6046f, 4.5f, 7.5f, 4.5f)
                curveTo(6.3954f, 4.5f, 5.5f, 5.3954f, 5.5f, 6.5f)
                curveTo(5.5f, 7.6046f, 6.3954f, 8.5f, 7.5f, 8.5f)
                close()
                moveTo(20.3891f, 19.3891f)
                lineTo(16.5f, 23.2782f)
                lineTo(12.6109f, 19.3891f)
                curveTo(10.463f, 17.2412f, 10.463f, 13.7588f, 12.6109f, 11.6109f)
                curveTo(14.7588f, 9.463f, 18.2412f, 9.463f, 20.3891f, 11.6109f)
                curveTo(22.537f, 13.7588f, 22.537f, 17.2412f, 20.3891f, 19.3891f)
                close()
                moveTo(16.5f, 17.5f)
                curveTo(17.6046f, 17.5f, 18.5f, 16.6046f, 18.5f, 15.5f)
                curveTo(18.5f, 14.3954f, 17.6046f, 13.5f, 16.5f, 13.5f)
                curveTo(15.3954f, 13.5f, 14.5f, 14.3954f, 14.5f, 15.5f)
                curveTo(14.5f, 16.6046f, 15.3954f, 17.5f, 16.5f, 17.5f)
                close()
            }
        }
        .build()
        return `_pin-distance-fill`!!
    }

private var `_pin-distance-fill`: ImageVector? = null
