package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Attachment-fill`: ImageVector
    get() {
        if (`_attachment-fill` != null) {
            return `_attachment-fill`!!
        }
        `_attachment-fill` = Builder(name = "Attachment-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.997f, 2.9918f)
                lineTo(20.9998f, 21.0082f)
                curveTo(20.9998f, 21.5447f, 20.5552f, 22.0f, 20.0066f, 22.0f)
                horizontalLineTo(3.9934f)
                curveTo(3.445f, 22.0f, 3.0f, 21.556f, 3.0f, 21.0082f)
                verticalLineTo(2.9918f)
                curveTo(3.0f, 2.4553f, 3.4447f, 2.0f, 3.9932f, 2.0f)
                horizontalLineTo(20.0036f)
                curveTo(20.5519f, 2.0f, 20.9969f, 2.4441f, 20.997f, 2.9918f)
                close()
                moveTo(9.0f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(9.0f, 8.4477f, 9.4477f, 8.0f, 10.0f, 8.0f)
                curveTo(10.5523f, 8.0f, 11.0f, 8.4477f, 11.0f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(11.0f, 13.5523f, 11.4477f, 14.0f, 12.0f, 14.0f)
                curveTo(12.5523f, 14.0f, 13.0f, 13.5523f, 13.0f, 13.0f)
                verticalLineTo(9.0f)
                curveTo(13.0f, 7.3432f, 11.6569f, 6.0f, 10.0f, 6.0f)
                curveTo(8.3432f, 6.0f, 7.0f, 7.3432f, 7.0f, 9.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 15.7614f, 9.2386f, 18.0f, 12.0f, 18.0f)
                curveTo(14.7614f, 18.0f, 17.0f, 15.7614f, 17.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                curveTo(15.0f, 14.6569f, 13.6569f, 16.0f, 12.0f, 16.0f)
                curveTo(10.3431f, 16.0f, 9.0f, 14.6569f, 9.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_attachment-fill`!!
    }

private var `_attachment-fill`: ImageVector? = null
