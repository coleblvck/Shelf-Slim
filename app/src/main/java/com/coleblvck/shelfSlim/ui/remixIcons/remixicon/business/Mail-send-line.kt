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

public val BusinessGroup.`Mail-send-line`: ImageVector
    get() {
        if (`_mail-send-line` != null) {
            return `_mail-send-line`!!
        }
        `_mail-send-line` = Builder(name = "Mail-send-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                curveTo(21.5523f, 3.0f, 22.0f, 3.4477f, 22.0f, 4.0f)
                verticalLineTo(20.0066f)
                curveTo(22.0f, 20.5552f, 21.5447f, 21.0f, 21.0082f, 21.0f)
                horizontalLineTo(2.9918f)
                curveTo(2.4441f, 21.0f, 2.0f, 20.5551f, 2.0f, 20.0066f)
                verticalLineTo(19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.3f)
                lineTo(12.0f, 14.5f)
                lineTo(2.0f, 5.5f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 3.4477f, 2.4477f, 3.0f, 3.0f, 3.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(8.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(5.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.5659f, 5.0f)
                horizontalLineTo(4.4341f)
                lineTo(12.0f, 11.8093f)
                lineTo(19.5659f, 5.0f)
                close()
            }
        }
        .build()
        return `_mail-send-line`!!
    }

private var `_mail-send-line`: ImageVector? = null