package com.coleblvck.shelf.ui.remixIcons.remixicon.business

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.BusinessGroup

public val BusinessGroup.`Mail-forbid-line`: ImageVector
    get() {
        if (`_mail-forbid-line` != null) {
            return `_mail-forbid-line`!!
        }
        `_mail-forbid-line` = Builder(name = "Mail-forbid-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.2379f)
                lineTo(12.0718f, 14.338f)
                lineTo(4.0f, 7.2159f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0709f)
                curveTo(11.1719f, 19.7061f, 11.3783f, 20.3783f, 11.6736f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(12.2547f)
                curveTo(21.396f, 11.8334f, 20.7224f, 11.5049f, 20.0f, 11.2899f)
                verticalLineTo(7.2379f)
                close()
                moveTo(19.501f, 5.0f)
                horizontalLineTo(4.5115f)
                lineTo(12.0619f, 11.662f)
                lineTo(19.501f, 5.0f)
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
        return `_mail-forbid-line`!!
    }

private var `_mail-forbid-line`: ImageVector? = null
