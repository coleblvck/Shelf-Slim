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

public val BusinessGroup.`Mail-download-line`: ImageVector
    get() {
        if (`_mail-download-line` != null) {
            return `_mail-download-line`!!
        }
        `_mail-download-line` = Builder(name = "Mail-download-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.2379f)
                lineTo(12.0718f, 14.338f)
                lineTo(4.0f, 7.2159f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.2379f)
                close()
                moveTo(19.501f, 5.0f)
                horizontalLineTo(4.5115f)
                lineTo(12.0619f, 11.662f)
                lineTo(19.501f, 5.0f)
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
        return `_mail-download-line`!!
    }

private var `_mail-download-line`: ImageVector? = null