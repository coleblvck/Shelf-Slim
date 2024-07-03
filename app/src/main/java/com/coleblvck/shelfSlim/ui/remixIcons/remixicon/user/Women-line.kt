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

public val UserGroup.`Women-line`: ImageVector
    get() {
        if (`_women-line` != null) {
            return `_women-line`!!
        }
        `_women-line` = Builder(name = "Women-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.9339f)
                curveTo(7.3306f, 15.445f, 4.5f, 12.3031f, 4.5f, 8.5f)
                curveTo(4.5f, 4.3579f, 7.8579f, 1.0f, 12.0f, 1.0f)
                curveTo(16.1421f, 1.0f, 19.5f, 4.3579f, 19.5f, 8.5f)
                curveTo(19.5f, 12.3031f, 16.6694f, 15.445f, 13.0f, 15.9339f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(24.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.9339f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(15.0376f, 14.0f, 17.5f, 11.5376f, 17.5f, 8.5f)
                curveTo(17.5f, 5.4624f, 15.0376f, 3.0f, 12.0f, 3.0f)
                curveTo(8.9624f, 3.0f, 6.5f, 5.4624f, 6.5f, 8.5f)
                curveTo(6.5f, 11.5376f, 8.9624f, 14.0f, 12.0f, 14.0f)
                close()
            }
        }
        .build()
        return `_women-line`!!
    }

private var `_women-line`: ImageVector? = null
