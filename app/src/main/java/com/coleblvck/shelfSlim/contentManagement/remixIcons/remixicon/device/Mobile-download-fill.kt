package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Mobile-download-fill`: ImageVector
    get() {
        if (`_mobile-download-fill` != null) {
            return `_mobile-download-fill`!!
        }
        `_mobile-download-fill` = Builder(name = "Mobile-download-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(12.0f, 4.4633f, 12.5777f, 3.0615f, 13.5278f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 2.0f, 5.0f, 2.4477f, 5.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 21.5523f, 5.4477f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 22.0f, 19.0f, 21.5523f, 19.0f, 21.0f)
                verticalLineTo(11.917f)
                curveTo(18.6748f, 11.9716f, 18.3407f, 12.0f, 18.0f, 12.0f)
                curveTo(14.6863f, 12.0f, 12.0f, 9.3137f, 12.0f, 6.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 17.4477f, 13.0f, 18.0f)
                curveTo(13.0f, 18.5523f, 12.5523f, 19.0f, 12.0f, 19.0f)
                curveTo(11.4477f, 19.0f, 11.0f, 18.5523f, 11.0f, 18.0f)
                curveTo(11.0f, 17.4477f, 11.4477f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(22.0f, 6.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                lineTo(18.0f, 10.0f)
                lineTo(22.0f, 6.0f)
                close()
            }
        }
        .build()
        return `_mobile-download-fill`!!
    }

private var `_mobile-download-fill`: ImageVector? = null
