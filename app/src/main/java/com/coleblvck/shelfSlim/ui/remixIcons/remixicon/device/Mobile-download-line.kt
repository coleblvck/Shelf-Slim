package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Mobile-download-line`: ImageVector
    get() {
        if (`_mobile-download-line` != null) {
            return `_mobile-download-line`!!
        }
        `_mobile-download-line` = Builder(name = "Mobile-download-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 21.5523f, 18.5523f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 22.0f, 5.0f, 21.5523f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 2.4477f, 5.4477f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(19.0f, 6.0f)
                horizontalLineTo(22.0f)
                lineTo(18.0f, 10.0f)
                lineTo(14.0f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(13.0f, 18.0f)
                curveTo(13.0f, 18.5523f, 12.5523f, 19.0f, 12.0f, 19.0f)
                curveTo(11.4477f, 19.0f, 11.0f, 18.5523f, 11.0f, 18.0f)
                curveTo(11.0f, 17.4477f, 11.4477f, 17.0f, 12.0f, 17.0f)
                curveTo(12.5523f, 17.0f, 13.0f, 17.4477f, 13.0f, 18.0f)
                close()
            }
        }
        .build()
        return `_mobile-download-line`!!
    }

private var `_mobile-download-line`: ImageVector? = null