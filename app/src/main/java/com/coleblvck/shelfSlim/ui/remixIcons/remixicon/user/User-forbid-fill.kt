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

public val UserGroup.`User-forbid-fill`: ImageVector
    get() {
        if (`_user-forbid-fill` != null) {
            return `_user-forbid-fill`!!
        }
        `_user-forbid-fill` = Builder(name = "User-forbid-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 13.0f)
                curveTo(15.3137f, 13.0f, 18.0f, 10.3137f, 18.0f, 7.0f)
                curveTo(18.0f, 3.6863f, 15.3137f, 1.0f, 12.0f, 1.0f)
                curveTo(8.6863f, 1.0f, 6.0f, 3.6863f, 6.0f, 7.0f)
                curveTo(6.0f, 10.3137f, 8.6863f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(15.0f, 18.0f)
                curveTo(15.0f, 16.3431f, 16.3431f, 15.0f, 18.0f, 15.0f)
                curveTo(18.4631f, 15.0f, 18.9018f, 15.105f, 19.2934f, 15.2924f)
                lineTo(15.2924f, 19.2934f)
                curveTo(15.105f, 18.9018f, 15.0f, 18.4631f, 15.0f, 18.0f)
                close()
                moveTo(16.7066f, 20.7076f)
                lineTo(20.7076f, 16.7066f)
                curveTo(20.895f, 17.0982f, 21.0f, 17.5369f, 21.0f, 18.0f)
                curveTo(21.0f, 19.6569f, 19.6569f, 21.0f, 18.0f, 21.0f)
                curveTo(17.5369f, 21.0f, 17.0982f, 20.895f, 16.7066f, 20.7076f)
                close()
                moveTo(18.0f, 13.0f)
                curveTo(15.2386f, 13.0f, 13.0f, 15.2386f, 13.0f, 18.0f)
                curveTo(13.0f, 20.7614f, 15.2386f, 23.0f, 18.0f, 23.0f)
                curveTo(20.7614f, 23.0f, 23.0f, 20.7614f, 23.0f, 18.0f)
                curveTo(23.0f, 15.2386f, 20.7614f, 13.0f, 18.0f, 13.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(12.0843f, 14.0f, 12.1683f, 14.0013f, 12.252f, 14.0039f)
                curveTo(11.4628f, 15.137f, 11.0f, 16.5145f, 11.0f, 18.0f)
                curveTo(11.0f, 19.4872f, 11.4638f, 20.8662f, 12.2547f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.5817f, 7.5817f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_user-forbid-fill`!!
    }

private var `_user-forbid-fill`: ImageVector? = null
