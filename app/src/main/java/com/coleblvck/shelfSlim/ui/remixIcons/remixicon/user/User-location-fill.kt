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

public val UserGroup.`User-location-fill`: ImageVector
    get() {
        if (`_user-location-fill` != null) {
            return `_user-location-fill`!!
        }
        `_user-location-fill` = Builder(name = "User-location-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.5817f, 7.5817f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.685f, 8.685f, 1.0f, 12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.315f, 15.315f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(20.8284f, 20.8284f)
                lineTo(18.0f, 23.6569f)
                lineTo(15.1716f, 20.8284f)
                curveTo(13.6095f, 19.2663f, 13.6095f, 16.7337f, 15.1716f, 15.1716f)
                curveTo(16.7337f, 13.6095f, 19.2663f, 13.6095f, 20.8284f, 15.1716f)
                curveTo(22.3905f, 16.7337f, 22.3905f, 19.2663f, 20.8284f, 20.8284f)
                close()
                moveTo(18.0f, 17.0f)
                curveTo(17.4477f, 17.0f, 17.0f, 17.4477f, 17.0f, 18.0f)
                curveTo(17.0f, 18.5523f, 17.4477f, 19.0f, 18.0f, 19.0f)
                curveTo(18.5523f, 19.0f, 19.0f, 18.5523f, 19.0f, 18.0f)
                curveTo(19.0f, 17.4477f, 18.5523f, 17.0f, 18.0f, 17.0f)
                close()
            }
        }
        .build()
        return `_user-location-fill`!!
    }

private var `_user-location-fill`: ImageVector? = null
