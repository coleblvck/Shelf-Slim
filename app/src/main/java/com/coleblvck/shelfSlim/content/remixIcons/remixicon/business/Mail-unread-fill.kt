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

public val BusinessGroup.`Mail-unread-fill`: ImageVector
    get() {
        if (`_mail-unread-fill` != null) {
            return `_mail-unread-fill`!!
        }
        `_mail-unread-fill` = Builder(name = "Mail-unread-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.8032f, 8.4928f)
                curveTo(19.4663f, 8.8176f, 20.2118f, 9.0f, 21.0f, 9.0f)
                curveTo(21.3425f, 9.0f, 21.6769f, 8.9656f, 22.0f, 8.9f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(16.1f)
                curveTo(16.0344f, 3.3231f, 16.0f, 3.6575f, 16.0f, 4.0f)
                curveTo(16.0f, 5.2367f, 16.449f, 6.3686f, 17.1929f, 7.2414f)
                lineTo(12.0606f, 11.6829f)
                lineTo(5.6472f, 6.2377f)
                lineTo(4.3528f, 7.7623f)
                lineTo(12.0731f, 14.3171f)
                lineTo(18.8032f, 8.4928f)
                close()
                moveTo(21.0f, 7.0f)
                curveTo(19.3431f, 7.0f, 18.0f, 5.6568f, 18.0f, 4.0f)
                curveTo(18.0f, 2.3431f, 19.3431f, 1.0f, 21.0f, 1.0f)
                curveTo(22.6569f, 1.0f, 24.0f, 2.3431f, 24.0f, 4.0f)
                curveTo(24.0f, 5.6568f, 22.6569f, 7.0f, 21.0f, 7.0f)
                close()
            }
        }
        .build()
        return `_mail-unread-fill`!!
    }

private var `_mail-unread-fill`: ImageVector? = null
