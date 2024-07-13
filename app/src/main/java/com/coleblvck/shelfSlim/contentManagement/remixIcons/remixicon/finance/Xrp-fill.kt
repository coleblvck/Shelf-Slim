package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Xrp-fill`: ImageVector
    get() {
        if (`_xrp-fill` != null) {
            return `_xrp-fill`!!
        }
        `_xrp-fill` = Builder(name = "Xrp-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7782f, 4.0f)
                horizontalLineTo(18.9411f)
                lineTo(14.4519f, 8.371f)
                curveTo(13.7983f, 9.005f, 12.9175f, 9.3604f, 11.9998f, 9.3604f)
                curveTo(11.0822f, 9.3604f, 10.2014f, 9.005f, 9.5478f, 8.371f)
                lineTo(5.0621f, 4.0f)
                horizontalLineTo(2.2227f)
                lineTo(8.1293f, 9.754f)
                curveTo(10.269f, 11.8366f, 13.7357f, 11.8366f, 15.8739f, 9.754f)
                lineTo(21.7782f, 4.0f)
                close()
                moveTo(2.2227f, 20.0f)
                horizontalLineTo(5.051f)
                lineTo(9.5594f, 15.6151f)
                curveTo(10.2105f, 14.9842f, 11.088f, 14.6305f, 12.0021f, 14.6305f)
                curveTo(12.9163f, 14.6305f, 13.7938f, 14.9842f, 14.4449f, 15.6151f)
                lineTo(18.9518f, 20.0f)
                horizontalLineTo(21.7782f)
                lineTo(15.8581f, 14.2388f)
                curveTo(13.7264f, 12.1663f, 10.2729f, 12.1663f, 8.1428f, 14.2388f)
                lineTo(2.2227f, 20.0f)
                close()
            }
        }
        .build()
        return `_xrp-fill`!!
    }

private var `_xrp-fill`: ImageVector? = null
