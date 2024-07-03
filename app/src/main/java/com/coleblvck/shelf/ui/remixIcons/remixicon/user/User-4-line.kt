package com.coleblvck.shelf.ui.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.UserGroup

public val UserGroup.`User-4-line`: ImageVector
    get() {
        if (`_user-4-line` != null) {
            return `_user-4-line`!!
        }
        `_user-4-line` = Builder(name = "User-4-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(7.5817f, 18.0f, 4.0f, 14.4183f, 4.0f, 10.0f)
                curveTo(4.0f, 5.5817f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.5817f, 20.0f, 10.0f)
                curveTo(20.0f, 14.4183f, 16.4183f, 18.0f, 12.0f, 18.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveTo(15.3137f, 16.0f, 18.0f, 13.3137f, 18.0f, 10.0f)
                curveTo(18.0f, 6.6863f, 15.3137f, 4.0f, 12.0f, 4.0f)
                curveTo(8.6863f, 4.0f, 6.0f, 6.6863f, 6.0f, 10.0f)
                curveTo(6.0f, 13.3137f, 8.6863f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_user-4-line`!!
    }

private var `_user-4-line`: ImageVector? = null
