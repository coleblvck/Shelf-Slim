package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.HealthGroup

public val HealthGroup.`Surgical-mask-fill`: ImageVector
    get() {
        if (`_surgical-mask-fill` != null) {
            return `_surgical-mask-fill`!!
        }
        `_surgical-mask-fill` = Builder(name = "Surgical-mask-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4851f, 3.1212f)
                lineTo(20.2425f, 5.0606f)
                curveTo(20.6877f, 5.1719f, 21.0f, 5.5719f, 21.0f, 6.0307f)
                verticalLineTo(6.9995f)
                lineTo(22.0f, 7.0f)
                curveTo(23.1f, 7.0f, 24.0f, 7.9f, 24.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(24.0f, 13.6568f, 22.6569f, 15.0f, 21.0f, 15.0f)
                lineTo(20.5789f, 15.0003f)
                curveTo(20.0443f, 16.3501f, 19.0275f, 17.4862f, 17.6833f, 18.1583f)
                lineTo(12.8944f, 20.5528f)
                curveTo(12.3314f, 20.8343f, 11.6686f, 20.8343f, 11.1056f, 20.5528f)
                lineTo(6.3167f, 18.1583f)
                curveTo(4.9725f, 17.4862f, 3.9557f, 16.3501f, 3.4211f, 15.0003f)
                lineTo(3.0f, 15.0f)
                curveTo(1.3432f, 15.0f, 0.0f, 13.6568f, 0.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(0.0f, 7.8954f, 0.8954f, 7.0f, 2.0f, 7.0f)
                lineTo(3.0f, 6.9995f)
                verticalLineTo(6.0307f)
                curveTo(3.0f, 5.5719f, 3.3123f, 5.1719f, 3.7575f, 5.0606f)
                lineTo(11.5149f, 3.1212f)
                curveTo(11.8334f, 3.0416f, 12.1666f, 3.0416f, 12.4851f, 3.1212f)
                close()
                moveTo(3.0f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 12.5523f, 2.4477f, 13.0f, 3.0f, 13.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(22.0f, 9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                curveTo(21.5523f, 13.0f, 22.0f, 12.5523f, 22.0f, 12.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return `_surgical-mask-fill`!!
    }

private var `_surgical-mask-fill`: ImageVector? = null
