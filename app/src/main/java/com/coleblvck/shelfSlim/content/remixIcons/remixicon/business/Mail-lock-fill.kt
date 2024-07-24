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

public val BusinessGroup.`Mail-lock-fill`: ImageVector
    get() {
        if (`_mail-lock-fill` != null) {
            return `_mail-lock-fill`!!
        }
        `_mail-lock-fill` = Builder(name = "Mail-lock-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 11.9996f)
                curveTo(21.1643f, 11.3719f, 20.1256f, 11.0f, 19.0f, 11.0f)
                curveTo(16.581f, 11.0f, 14.5633f, 12.7178f, 14.1f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(11.9996f)
                close()
                moveTo(12.0606f, 11.6829f)
                lineTo(5.6472f, 6.2377f)
                lineTo(4.3528f, 7.7623f)
                lineTo(12.0731f, 14.3171f)
                lineTo(19.6544f, 7.7562f)
                lineTo(18.3456f, 6.2438f)
                lineTo(12.0606f, 11.6829f)
                close()
                moveTo(22.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                curveTo(16.0f, 14.3431f, 17.3431f, 13.0f, 19.0f, 13.0f)
                curveTo(20.6569f, 13.0f, 22.0f, 14.3431f, 22.0f, 16.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(20.0f, 17.0f)
                verticalLineTo(16.0f)
                curveTo(20.0f, 15.4477f, 19.5523f, 15.0f, 19.0f, 15.0f)
                curveTo(18.4477f, 15.0f, 18.0f, 15.4477f, 18.0f, 16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return `_mail-lock-fill`!!
    }

private var `_mail-lock-fill`: ImageVector? = null
