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

public val BusinessGroup.`Mail-unread-line`: ImageVector
    get() {
        if (`_mail-unread-line` != null) {
            return `_mail-unread-line`!!
        }
        `_mail-unread-line` = Builder(name = "Mail-unread-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1f, 3.0f)
                curveTo(16.0344f, 3.3231f, 16.0f, 3.6575f, 16.0f, 4.0f)
                curveTo(16.0f, 4.3425f, 16.0344f, 4.6769f, 16.1f, 5.0f)
                horizontalLineTo(4.5115f)
                lineTo(12.0619f, 11.662f)
                lineTo(17.1098f, 7.1414f)
                curveTo(17.5363f, 7.6689f, 18.0679f, 8.1079f, 18.6728f, 8.4265f)
                lineTo(12.0718f, 14.338f)
                lineTo(4.0f, 7.2159f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.9f)
                curveTo(20.3231f, 8.9656f, 20.6575f, 9.0f, 21.0f, 9.0f)
                curveTo(21.3425f, 9.0f, 21.6769f, 8.9656f, 22.0f, 8.9f)
                verticalLineTo(20.0f)
                curveTo(22.0f, 20.5523f, 21.5523f, 21.0f, 21.0f, 21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(16.1f)
                close()
                moveTo(21.0f, 1.0f)
                curveTo(22.6569f, 1.0f, 24.0f, 2.3431f, 24.0f, 4.0f)
                curveTo(24.0f, 5.6568f, 22.6569f, 7.0f, 21.0f, 7.0f)
                curveTo(19.3431f, 7.0f, 18.0f, 5.6568f, 18.0f, 4.0f)
                curveTo(18.0f, 2.3431f, 19.3431f, 1.0f, 21.0f, 1.0f)
                close()
            }
        }
        .build()
        return `_mail-unread-line`!!
    }

private var `_mail-unread-line`: ImageVector? = null
