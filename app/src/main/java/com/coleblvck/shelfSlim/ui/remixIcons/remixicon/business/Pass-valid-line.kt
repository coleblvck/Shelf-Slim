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

public val BusinessGroup.`Pass-valid-line`: ImageVector
    get() {
        if (`_pass-valid-line` != null) {
            return `_pass-valid-line`!!
        }
        `_pass-valid-line` = Builder(name = "Pass-valid-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(1.0f, 5.0f)
                curveTo(1.0f, 4.4477f, 1.4477f, 4.0f, 2.0f, 4.0f)
                horizontalLineTo(22.0f)
                curveTo(22.5523f, 4.0f, 23.0f, 4.4477f, 23.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(23.0f, 19.5523f, 22.5523f, 20.0f, 22.0f, 20.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 20.0f, 1.0f, 19.5523f, 1.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.0f, 10.0f)
                curveTo(9.0f, 9.4477f, 8.5523f, 9.0f, 8.0f, 9.0f)
                curveTo(7.4477f, 9.0f, 7.0f, 9.4477f, 7.0f, 10.0f)
                curveTo(7.0f, 10.5523f, 7.4477f, 11.0f, 8.0f, 11.0f)
                curveTo(8.5523f, 11.0f, 9.0f, 10.5523f, 9.0f, 10.0f)
                close()
                moveTo(11.0f, 10.0f)
                curveTo(11.0f, 11.6569f, 9.6568f, 13.0f, 8.0f, 13.0f)
                curveTo(6.3432f, 13.0f, 5.0f, 11.6569f, 5.0f, 10.0f)
                curveTo(5.0f, 8.3432f, 6.3432f, 7.0f, 8.0f, 7.0f)
                curveTo(9.6568f, 7.0f, 11.0f, 8.3432f, 11.0f, 10.0f)
                close()
                moveTo(8.0018f, 16.0f)
                curveTo(7.035f, 16.0f, 6.1614f, 16.3907f, 5.5269f, 17.0251f)
                lineTo(4.1127f, 15.6109f)
                curveTo(5.1069f, 14.6167f, 6.4833f, 14.0f, 8.0018f, 14.0f)
                curveTo(9.5203f, 14.0f, 10.8967f, 14.6167f, 11.8909f, 15.6109f)
                lineTo(10.4767f, 17.0251f)
                curveTo(9.8422f, 16.3907f, 8.9686f, 16.0f, 8.0018f, 16.0f)
                close()
                moveTo(16.2071f, 14.7071f)
                lineTo(20.2071f, 10.7071f)
                lineTo(18.7929f, 9.2929f)
                lineTo(15.5f, 12.5858f)
                lineTo(13.7071f, 10.7929f)
                lineTo(12.2929f, 12.2071f)
                lineTo(14.7929f, 14.7071f)
                lineTo(15.5f, 15.4142f)
                lineTo(16.2071f, 14.7071f)
                close()
            }
        }
        .build()
        return `_pass-valid-line`!!
    }

private var `_pass-valid-line`: ImageVector? = null
