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

public val UserGroup.`Group-line`: ImageVector
    get() {
        if (`_group-line` != null) {
            return `_group-line`!!
        }
        `_group-line` = Builder(name = "Group-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                curveTo(2.0f, 17.5817f, 5.5817f, 14.0f, 10.0f, 14.0f)
                curveTo(14.4183f, 14.0f, 18.0f, 17.5817f, 18.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 18.6863f, 13.3137f, 16.0f, 10.0f, 16.0f)
                curveTo(6.6863f, 16.0f, 4.0f, 18.6863f, 4.0f, 22.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(10.0f, 13.0f)
                curveTo(6.685f, 13.0f, 4.0f, 10.315f, 4.0f, 7.0f)
                curveTo(4.0f, 3.685f, 6.685f, 1.0f, 10.0f, 1.0f)
                curveTo(13.315f, 1.0f, 16.0f, 3.685f, 16.0f, 7.0f)
                curveTo(16.0f, 10.315f, 13.315f, 13.0f, 10.0f, 13.0f)
                close()
                moveTo(10.0f, 11.0f)
                curveTo(12.21f, 11.0f, 14.0f, 9.21f, 14.0f, 7.0f)
                curveTo(14.0f, 4.79f, 12.21f, 3.0f, 10.0f, 3.0f)
                curveTo(7.79f, 3.0f, 6.0f, 4.79f, 6.0f, 7.0f)
                curveTo(6.0f, 9.21f, 7.79f, 11.0f, 10.0f, 11.0f)
                close()
                moveTo(18.2837f, 14.7028f)
                curveTo(21.0644f, 15.9561f, 23.0f, 18.752f, 23.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 19.564f, 19.5483f, 17.4671f, 17.4628f, 16.5271f)
                lineTo(18.2837f, 14.7028f)
                close()
                moveTo(17.5962f, 3.4132f)
                curveTo(19.5944f, 4.237f, 21.0f, 6.2036f, 21.0f, 8.5f)
                curveTo(21.0f, 11.3702f, 18.8042f, 13.7252f, 16.0f, 13.9776f)
                verticalLineTo(11.9646f)
                curveTo(17.6967f, 11.7222f, 19.0f, 10.264f, 19.0f, 8.5f)
                curveTo(19.0f, 7.1193f, 18.2016f, 5.926f, 17.041f, 5.3563f)
                lineTo(17.5962f, 3.4132f)
                close()
            }
        }
        .build()
        return `_group-line`!!
    }

private var `_group-line`: ImageVector? = null
