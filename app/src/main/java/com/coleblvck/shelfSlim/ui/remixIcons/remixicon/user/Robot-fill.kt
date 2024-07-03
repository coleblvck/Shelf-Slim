package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`Robot-fill`: ImageVector
    get() {
        if (`_robot-fill` != null) {
            return `_robot-fill`!!
        }
        `_robot-fill` = Builder(name = "Robot-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0549f)
                curveTo(17.5f, 4.5524f, 21.0f, 8.3674f, 21.0f, 13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                curveTo(3.0f, 8.3674f, 6.5001f, 4.5524f, 11.0f, 4.0549f)
                verticalLineTo(1.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0549f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(14.7614f, 18.0f, 17.0f, 15.7614f, 17.0f, 13.0f)
                curveTo(17.0f, 10.2386f, 14.7614f, 8.0f, 12.0f, 8.0f)
                curveTo(9.2386f, 8.0f, 7.0f, 10.2386f, 7.0f, 13.0f)
                curveTo(7.0f, 15.7614f, 9.2386f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(10.3431f, 16.0f, 9.0f, 14.6569f, 9.0f, 13.0f)
                curveTo(9.0f, 11.3431f, 10.3431f, 10.0f, 12.0f, 10.0f)
                curveTo(13.6569f, 10.0f, 15.0f, 11.3431f, 15.0f, 13.0f)
                curveTo(15.0f, 14.6569f, 13.6569f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(12.5523f, 14.0f, 13.0f, 13.5523f, 13.0f, 13.0f)
                curveTo(13.0f, 12.4477f, 12.5523f, 12.0f, 12.0f, 12.0f)
                curveTo(11.4477f, 12.0f, 11.0f, 12.4477f, 11.0f, 13.0f)
                curveTo(11.0f, 13.5523f, 11.4477f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_robot-fill`!!
    }

private var `_robot-fill`: ImageVector? = null
