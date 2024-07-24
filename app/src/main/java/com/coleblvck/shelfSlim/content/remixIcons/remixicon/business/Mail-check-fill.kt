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

public val BusinessGroup.`Mail-check-fill`: ImageVector
    get() {
        if (`_mail-check-fill` != null) {
            return `_mail-check-fill`!!
        }
        `_mail-check-fill` = Builder(name = "Mail-check-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 13.3414f)
                curveTo(21.3744f, 13.1203f, 20.7013f, 13.0f, 20.0f, 13.0f)
                curveTo(16.6863f, 13.0f, 14.0f, 15.6863f, 14.0f, 19.0f)
                curveTo(14.0f, 19.7013f, 14.1203f, 20.3744f, 14.3414f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(13.3414f)
                close()
                moveTo(12.0606f, 11.6829f)
                lineTo(5.6472f, 6.2377f)
                lineTo(4.3528f, 7.7623f)
                lineTo(12.0731f, 14.3171f)
                lineTo(19.6544f, 7.7562f)
                lineTo(18.3456f, 6.2438f)
                lineTo(12.0606f, 11.6829f)
                close()
                moveTo(19.0f, 22.0f)
                lineTo(15.4645f, 18.4645f)
                lineTo(16.8787f, 17.0503f)
                lineTo(19.0f, 19.1716f)
                lineTo(22.5355f, 15.636f)
                lineTo(23.9497f, 17.0503f)
                lineTo(19.0f, 22.0f)
                close()
            }
        }
        .build()
        return `_mail-check-fill`!!
    }

private var `_mail-check-fill`: ImageVector? = null
