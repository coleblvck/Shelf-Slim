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

public val BusinessGroup.`Mail-download-fill`: ImageVector
    get() {
        if (`_mail-download-fill` != null) {
            return `_mail-download-fill`!!
        }
        `_mail-download-fill` = Builder(name = "Mail-download-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.8027f)
                curveTo(21.1175f, 12.2922f, 20.0929f, 12.0f, 19.0f, 12.0f)
                curveTo(15.6863f, 12.0f, 13.0f, 14.6863f, 13.0f, 18.0f)
                curveTo(13.0f, 19.0929f, 13.2922f, 20.1175f, 13.8027f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(12.8027f)
                close()
                moveTo(12.0606f, 11.6829f)
                lineTo(5.6472f, 6.2377f)
                lineTo(4.3528f, 7.7623f)
                lineTo(12.0731f, 14.3171f)
                lineTo(19.6544f, 7.7562f)
                lineTo(18.3456f, 6.2438f)
                lineTo(12.0606f, 11.6829f)
                close()
                moveTo(20.0f, 18.0f)
                horizontalLineTo(23.0f)
                lineTo(19.0f, 22.0f)
                lineTo(15.0f, 18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return `_mail-download-fill`!!
    }

private var `_mail-download-fill`: ImageVector? = null
