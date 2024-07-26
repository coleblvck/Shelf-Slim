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

public val UserGroup.`User-unfollow-line`: ImageVector
    get() {
        if (`_user-unfollow-line` != null) {
            return `_user-unfollow-line`!!
        }
        `_user-unfollow-line` = Builder(name = "User-unfollow-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.252f)
                verticalLineTo(16.3414f)
                curveTo(13.3744f, 16.1203f, 12.7013f, 16.0f, 12.0f, 16.0f)
                curveTo(8.6863f, 16.0f, 6.0f, 18.6863f, 6.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.5817f, 7.5817f, 14.0f, 12.0f, 14.0f)
                curveTo(12.6906f, 14.0f, 13.3608f, 14.0875f, 14.0f, 14.252f)
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
                moveTo(19.0f, 17.5858f)
                lineTo(21.1213f, 15.4645f)
                lineTo(22.5355f, 16.8787f)
                lineTo(20.4142f, 19.0f)
                lineTo(22.5355f, 21.1213f)
                lineTo(21.1213f, 22.5355f)
                lineTo(19.0f, 20.4142f)
                lineTo(16.8787f, 22.5355f)
                lineTo(15.4645f, 21.1213f)
                lineTo(17.5858f, 19.0f)
                lineTo(15.4645f, 16.8787f)
                lineTo(16.8787f, 15.4645f)
                lineTo(19.0f, 17.5858f)
                close()
            }
        }
        .build()
        return `_user-unfollow-line`!!
    }

private var `_user-unfollow-line`: ImageVector? = null