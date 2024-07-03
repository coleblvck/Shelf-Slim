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

public val BusinessGroup.`Mail-check-line`: ImageVector
    get() {
        if (`_mail-check-line` != null) {
            return `_mail-check-line`!!
        }
        `_mail-check-line` = Builder(name = "Mail-check-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.2379f)
                lineTo(12.0718f, 14.338f)
                lineTo(4.0f, 7.2159f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(4.5115f, 5.0f)
                lineTo(12.0619f, 11.662f)
                lineTo(19.501f, 5.0f)
                horizontalLineTo(4.5115f)
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
        return `_mail-check-line`!!
    }

private var `_mail-check-line`: ImageVector? = null