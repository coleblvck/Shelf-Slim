package com.coleblvck.shelfSlim.content.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.UserGroup

public val UserGroup.`Open-arm-line`: ImageVector
    get() {
        if (`_open-arm-line` != null) {
            return `_open-arm-line`!!
        }
        `_open-arm-line` = Builder(name = "Open-arm-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0004f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0004f)
                verticalLineTo(17.0f)
                curveTo(16.0004f, 12.5487f, 18.6444f, 8.715f, 22.4475f, 6.9835f)
                lineTo(23.2753f, 8.8047f)
                curveTo(20.1637f, 10.2213f, 18.0004f, 13.3581f, 18.0004f, 17.0f)
                close()
                moveTo(8.0005f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0005f)
                verticalLineTo(17.0f)
                curveTo(6.0005f, 13.3581f, 3.8372f, 10.2213f, 0.7256f, 8.8047f)
                lineTo(1.5534f, 6.9835f)
                curveTo(5.3565f, 8.715f, 8.0005f, 12.5487f, 8.0005f, 17.0f)
                close()
                moveTo(12.0004f, 12.0f)
                curveTo(9.239f, 12.0f, 7.0005f, 9.7614f, 7.0005f, 7.0f)
                curveTo(7.0005f, 4.2386f, 9.239f, 2.0f, 12.0004f, 2.0f)
                curveTo(14.7619f, 2.0f, 17.0004f, 4.2386f, 17.0004f, 7.0f)
                curveTo(17.0004f, 9.7614f, 14.7619f, 12.0f, 12.0004f, 12.0f)
                close()
                moveTo(12.0004f, 10.0f)
                curveTo(13.6573f, 10.0f, 15.0004f, 8.6568f, 15.0004f, 7.0f)
                curveTo(15.0004f, 5.3432f, 13.6573f, 4.0f, 12.0004f, 4.0f)
                curveTo(10.3436f, 4.0f, 9.0005f, 5.3432f, 9.0005f, 7.0f)
                curveTo(9.0005f, 8.6568f, 10.3436f, 10.0f, 12.0004f, 10.0f)
                close()
            }
        }
        .build()
        return `_open-arm-line`!!
    }

private var `_open-arm-line`: ImageVector? = null
