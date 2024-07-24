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

public val UserGroup.`User-3-fill`: ImageVector
    get() {
        if (`_user-3-fill` != null) {
            return `_user-3-fill`!!
        }
        `_user-3-fill` = Builder(name = "User-3-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 17.2386f, 6.2386f, 15.0f, 9.0f, 15.0f)
                horizontalLineTo(15.0f)
                curveTo(17.7614f, 15.0f, 20.0f, 17.2386f, 20.0f, 20.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.6863f, 13.0f, 6.0f, 10.3137f, 6.0f, 7.0f)
                curveTo(6.0f, 3.6863f, 8.6863f, 1.0f, 12.0f, 1.0f)
                curveTo(15.3137f, 1.0f, 18.0f, 3.6863f, 18.0f, 7.0f)
                curveTo(18.0f, 10.3137f, 15.3137f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_user-3-fill`!!
    }

private var `_user-3-fill`: ImageVector? = null
