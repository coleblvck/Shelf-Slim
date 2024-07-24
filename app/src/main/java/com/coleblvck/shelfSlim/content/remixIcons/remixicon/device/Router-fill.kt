package com.coleblvck.shelfSlim.content.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Router-fill`: ImageVector
    get() {
        if (`_router-fill` != null) {
            return `_router-fill`!!
        }
        `_router-fill` = Builder(name = "Router-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0001f, 14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0001f)
                verticalLineTo(14.0f)
                horizontalLineTo(18.0001f)
                curveTo(18.5524f, 14.0f, 19.0001f, 14.4477f, 19.0001f, 15.0f)
                verticalLineTo(21.0f)
                curveTo(19.0001f, 21.5523f, 18.5524f, 22.0f, 18.0001f, 22.0f)
                horizontalLineTo(6.0002f)
                curveTo(5.4479f, 22.0f, 5.0002f, 21.5523f, 5.0002f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(5.0002f, 14.4477f, 5.4479f, 14.0f, 6.0002f, 14.0f)
                horizontalLineTo(11.0001f)
                close()
                moveTo(2.5107f, 8.8369f)
                curveTo(3.8343f, 4.8642f, 7.5827f, 2.0f, 12.0001f, 2.0f)
                curveTo(16.4176f, 2.0f, 20.166f, 4.8642f, 21.4896f, 8.8369f)
                lineTo(19.5917f, 9.4695f)
                curveTo(18.5328f, 6.2914f, 15.5341f, 4.0f, 12.0001f, 4.0f)
                curveTo(8.4662f, 4.0f, 5.4675f, 6.2914f, 4.4086f, 9.4695f)
                lineTo(2.5107f, 8.8369f)
                close()
                moveTo(6.3065f, 10.1021f)
                curveTo(7.1006f, 7.7185f, 9.3497f, 6.0f, 12.0001f, 6.0f)
                curveTo(14.6506f, 6.0f, 16.8996f, 7.7185f, 17.6938f, 10.1021f)
                lineTo(15.7959f, 10.7347f)
                curveTo(15.2665f, 9.1457f, 13.7671f, 8.0f, 12.0001f, 8.0f)
                curveTo(10.2332f, 8.0f, 8.7338f, 9.1457f, 8.2044f, 10.7347f)
                lineTo(6.3065f, 10.1021f)
                close()
            }
        }
        .build()
        return `_router-fill`!!
    }

private var `_router-fill`: ImageVector? = null
