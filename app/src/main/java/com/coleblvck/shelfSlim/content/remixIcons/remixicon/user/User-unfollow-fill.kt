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

public val UserGroup.`User-unfollow-fill`: ImageVector
    get() {
        if (`_user-unfollow-fill` != null) {
            return `_user-unfollow-fill`!!
        }
        `_user-unfollow-fill` = Builder(name = "User-unfollow-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.252f)
                verticalLineTo(22.0f)
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
                moveTo(19.0f, 16.5858f)
                lineTo(21.1213f, 14.4645f)
                lineTo(22.5355f, 15.8787f)
                lineTo(20.4142f, 18.0f)
                lineTo(22.5355f, 20.1213f)
                lineTo(21.1213f, 21.5355f)
                lineTo(19.0f, 19.4142f)
                lineTo(16.8787f, 21.5355f)
                lineTo(15.4645f, 20.1213f)
                lineTo(17.5858f, 18.0f)
                lineTo(15.4645f, 15.8787f)
                lineTo(16.8787f, 14.4645f)
                lineTo(19.0f, 16.5858f)
                close()
            }
        }
        .build()
        return `_user-unfollow-fill`!!
    }

private var `_user-unfollow-fill`: ImageVector? = null
