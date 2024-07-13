package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Refresh-fill`: ImageVector
    get() {
        if (`_refresh-fill` != null) {
            return `_refresh-fill`!!
        }
        `_refresh-fill` = Builder(name = "Refresh-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(16.8201f, 17.0761f)
                curveTo(18.1628f, 15.8007f, 19.0f, 13.9981f, 19.0f, 12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                curveTo(10.9391f, 5.0f, 9.9334f, 5.236f, 9.0324f, 5.6583f)
                lineTo(10.0072f, 7.4129f)
                curveTo(10.6177f, 7.1473f, 11.2917f, 7.0f, 12.0f, 7.0f)
                curveTo(14.7614f, 7.0f, 17.0f, 9.2386f, 17.0f, 12.0f)
                horizontalLineTo(14.0f)
                lineTo(16.8201f, 17.0761f)
                close()
                moveTo(14.9676f, 18.3417f)
                lineTo(13.9928f, 16.5871f)
                curveTo(13.3823f, 16.8527f, 12.7083f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2386f, 17.0f, 7.0f, 14.7614f, 7.0f, 12.0f)
                horizontalLineTo(10.0f)
                lineTo(7.1799f, 6.9239f)
                curveTo(5.8372f, 8.1993f, 5.0f, 10.0019f, 5.0f, 12.0f)
                curveTo(5.0f, 15.866f, 8.134f, 19.0f, 12.0f, 19.0f)
                curveTo(13.0609f, 19.0f, 14.0666f, 18.764f, 14.9676f, 18.3417f)
                close()
            }
        }
        .build()
        return `_refresh-fill`!!
    }

private var `_refresh-fill`: ImageVector? = null
