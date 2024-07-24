package com.coleblvck.shelfSlim.content.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Mail-star-fill`: ImageVector
    get() {
        if (`_mail-star-fill` != null) {
            return `_mail-star-fill`!!
        }
        `_mail-star-fill` = Builder(name = "Mail-star-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.044f)
                curveTo(21.2389f, 13.6947f, 20.3922f, 13.5f, 19.5f, 13.5f)
                curveTo(16.1863f, 13.5f, 13.5f, 16.1863f, 13.5f, 19.5f)
                curveTo(13.5f, 20.018f, 13.5656f, 20.5206f, 13.689f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(14.044f)
                close()
                moveTo(12.0606f, 11.6829f)
                lineTo(5.6472f, 6.2377f)
                lineTo(4.3528f, 7.7623f)
                lineTo(12.0731f, 14.3171f)
                lineTo(19.6544f, 7.7562f)
                lineTo(18.3456f, 6.2438f)
                lineTo(12.0606f, 11.6829f)
                close()
                moveTo(19.5f, 21.75f)
                lineTo(16.855f, 23.1406f)
                lineTo(17.3601f, 20.1953f)
                lineTo(15.2202f, 18.1094f)
                lineTo(18.1775f, 17.6797f)
                lineTo(19.5f, 15.0f)
                lineTo(20.8225f, 17.6797f)
                lineTo(23.7798f, 18.1094f)
                lineTo(21.6399f, 20.1953f)
                lineTo(22.145f, 23.1406f)
                lineTo(19.5f, 21.75f)
                close()
            }
        }
        .build()
        return `_mail-star-fill`!!
    }

private var `_mail-star-fill`: ImageVector? = null
