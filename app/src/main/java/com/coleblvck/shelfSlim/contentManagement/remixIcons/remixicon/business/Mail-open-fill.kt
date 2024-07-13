package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Mail-open-fill`: ImageVector
    get() {
        if (`_mail-open-fill` != null) {
            return `_mail-open-fill`!!
        }
        `_mail-open-fill` = Builder(name = "Mail-open-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.2428f, 6.8544f)
                lineTo(11.4895f, 1.3086f)
                curveTo(11.8062f, 1.1186f, 12.2019f, 1.1187f, 12.5185f, 1.3088f)
                lineTo(21.7573f, 6.8543f)
                curveTo(21.9079f, 6.9447f, 22.0f, 7.1074f, 22.0f, 7.283f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(7.2832f)
                curveTo(2.0f, 7.1075f, 2.0922f, 6.9447f, 2.2428f, 6.8544f)
                close()
                moveTo(18.3456f, 8.2438f)
                lineTo(12.0606f, 13.6829f)
                lineTo(5.6472f, 8.2377f)
                lineTo(4.3528f, 9.7623f)
                lineTo(12.0731f, 16.3171f)
                lineTo(19.6544f, 9.7562f)
                lineTo(18.3456f, 8.2438f)
                close()
            }
        }
        .build()
        return `_mail-open-fill`!!
    }

private var `_mail-open-fill`: ImageVector? = null
