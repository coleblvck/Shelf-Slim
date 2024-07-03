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

public val BusinessGroup.`Mail-volume-fill`: ImageVector
    get() {
        if (`_mail-volume-fill` != null) {
            return `_mail-volume-fill`!!
        }
        `_mail-volume-fill` = Builder(name = "Mail-volume-fill", defaultWidth = 24.0.dp,
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
                lineTo(22.0009f, 14.5286f)
                curveTo(20.9393f, 13.578f, 19.5371f, 13.0f, 18.0f, 13.0f)
                curveTo(14.6863f, 13.0f, 12.0f, 15.6863f, 12.0f, 19.0f)
                curveTo(12.0f, 19.7015f, 12.1204f, 20.3749f, 12.3417f, 21.0007f)
                lineTo(3.0f, 21.0f)
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
                moveTo(5.6472f, 6.2377f)
                lineTo(4.3528f, 7.7623f)
                lineTo(12.0731f, 14.3171f)
                lineTo(19.6544f, 7.7562f)
                lineTo(18.3456f, 6.2438f)
                lineTo(12.06f, 11.682f)
                lineTo(5.6472f, 6.2377f)
                close()
            }
        }
        .build()
        return `_mail-volume-fill`!!
    }

private var `_mail-volume-fill`: ImageVector? = null
