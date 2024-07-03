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

public val BusinessGroup.`Mail-open-line`: ImageVector
    get() {
        if (`_mail-open-line` != null) {
            return `_mail-open-line`!!
        }
        `_mail-open-line` = Builder(name = "Mail-open-line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(4.0f, 8.1326f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.1321f)
                lineTo(12.0037f, 3.3324f)
                lineTo(4.0f, 8.1326f)
                close()
                moveTo(12.0597f, 13.6983f)
                lineTo(17.3556f, 9.2353f)
                lineTo(18.6444f, 10.7647f)
                lineTo(12.074f, 16.3017f)
                lineTo(5.364f, 10.7717f)
                lineTo(6.636f, 9.2283f)
                lineTo(12.0597f, 13.6983f)
                close()
            }
        }
        .build()
        return `_mail-open-line`!!
    }

private var `_mail-open-line`: ImageVector? = null
