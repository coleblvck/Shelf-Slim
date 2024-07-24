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

public val BusinessGroup.`Mail-volume-line`: ImageVector
    get() {
        if (`_mail-volume-line` != null) {
            return `_mail-volume-line`!!
        }
        `_mail-volume-line` = Builder(name = "Mail-volume-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 14.5f)
                verticalLineTo(23.5f)
                lineTo(16.667f, 21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.667f)
                lineTo(20.0f, 14.5f)
                close()
                moveTo(21.0f, 3.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.237f)
                lineTo(12.0718f, 14.338f)
                lineTo(4.0f, 7.215f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 21.0f, 2.0f, 20.5523f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(21.0f, 17.0f)
                curveTo(22.1046f, 17.0f, 23.0f, 17.8954f, 23.0f, 19.0f)
                curveTo(23.0f, 20.0544f, 22.1841f, 20.9182f, 21.1493f, 20.9945f)
                lineTo(21.0f, 21.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(19.5f, 5.0f)
                horizontalLineTo(4.511f)
                lineTo(12.061f, 11.662f)
                lineTo(19.5f, 5.0f)
                close()
            }
        }
        .build()
        return `_mail-volume-line`!!
    }

private var `_mail-volume-line`: ImageVector? = null
