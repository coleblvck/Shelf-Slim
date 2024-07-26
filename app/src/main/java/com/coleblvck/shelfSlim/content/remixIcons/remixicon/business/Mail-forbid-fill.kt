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

public val BusinessGroup.`Mail-forbid-fill`: ImageVector
    get() {
        if (`_mail-forbid-fill` != null) {
            return `_mail-forbid-fill`!!
        }
        `_mail-forbid-fill` = Builder(name = "Mail-forbid-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.2657f, 11.5541f)
                lineTo(19.6544f, 7.7562f)
                lineTo(18.3456f, 6.2438f)
                lineTo(12.0606f, 11.6829f)
                lineTo(5.6472f, 6.2377f)
                lineTo(4.3528f, 7.7623f)
                lineTo(12.0554f, 14.3021f)
                curveTo(11.3865f, 15.3751f, 11.0f, 16.6424f, 11.0f, 18.0f)
                curveTo(11.0f, 19.0736f, 11.2417f, 20.0907f, 11.6736f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(12.2547f)
                curveTo(20.8662f, 11.4638f, 19.4872f, 11.0f, 18.0f, 11.0f)
                curveTo(17.0298f, 11.0f, 16.1057f, 11.1974f, 15.2657f, 11.5541f)
                close()
                moveTo(16.7066f, 20.7076f)
                curveTo(17.0982f, 20.895f, 17.5369f, 21.0f, 18.0f, 21.0f)
                curveTo(19.6569f, 21.0f, 21.0f, 19.6569f, 21.0f, 18.0f)
                curveTo(21.0f, 17.5369f, 20.895f, 17.0982f, 20.7076f, 16.7066f)
                lineTo(16.7066f, 20.7076f)
                close()
                moveTo(15.2924f, 19.2934f)
                lineTo(19.2934f, 15.2924f)
                curveTo(18.9018f, 15.105f, 18.4631f, 15.0f, 18.0f, 15.0f)
                curveTo(16.3431f, 15.0f, 15.0f, 16.3431f, 15.0f, 18.0f)
                curveTo(15.0f, 18.4631f, 15.105f, 18.9018f, 15.2924f, 19.2934f)
                close()
                moveTo(18.0f, 23.0f)
                curveTo(15.2386f, 23.0f, 13.0f, 20.7614f, 13.0f, 18.0f)
                curveTo(13.0f, 15.2386f, 15.2386f, 13.0f, 18.0f, 13.0f)
                curveTo(20.7614f, 13.0f, 23.0f, 15.2386f, 23.0f, 18.0f)
                curveTo(23.0f, 20.7614f, 20.7614f, 23.0f, 18.0f, 23.0f)
                close()
            }
        }
        .build()
        return `_mail-forbid-fill`!!
    }

private var `_mail-forbid-fill`: ImageVector? = null