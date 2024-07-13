package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.UserGroup

public val UserGroup.`User-location-line`: ImageVector
    get() {
        if (`_user-location-line` != null) {
            return `_user-location-line`!!
        }
        `_user-location-line` = Builder(name = "User-location-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(8.6863f, 16.0f, 6.0f, 18.6863f, 6.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.5817f, 7.5817f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.685f, 8.685f, 1.0f, 12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.315f, 15.315f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.21f, 11.0f, 16.0f, 9.21f, 16.0f, 7.0f)
                curveTo(16.0f, 4.79f, 14.21f, 3.0f, 12.0f, 3.0f)
                curveTo(9.79f, 3.0f, 8.0f, 4.79f, 8.0f, 7.0f)
                curveTo(8.0f, 9.21f, 9.79f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(20.8284f, 21.0711f)
                lineTo(18.0f, 24.0f)
                lineTo(15.1716f, 21.0711f)
                curveTo(13.6095f, 19.4535f, 13.6095f, 16.8308f, 15.1716f, 15.2132f)
                curveTo(16.7337f, 13.5956f, 19.2663f, 13.5956f, 20.8284f, 15.2132f)
                curveTo(22.3905f, 16.8308f, 22.3905f, 19.4535f, 20.8284f, 21.0711f)
                close()
                moveTo(19.3897f, 19.6818f)
                curveTo(20.2034f, 18.8392f, 20.2034f, 17.4451f, 19.3897f, 16.6025f)
                curveTo(18.614f, 15.7992f, 17.386f, 15.7992f, 16.6103f, 16.6025f)
                curveTo(15.7966f, 17.4451f, 15.7966f, 18.8392f, 16.6103f, 19.6818f)
                lineTo(18.0f, 21.1209f)
                lineTo(19.3897f, 19.6818f)
                close()
            }
        }
        .build()
        return `_user-location-line`!!
    }

private var `_user-location-line`: ImageVector? = null
