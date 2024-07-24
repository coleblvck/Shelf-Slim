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

public val UserGroup.`User-shared-fill`: ImageVector
    get() {
        if (`_user-shared-fill` != null) {
            return `_user-shared-fill`!!
        }
        `_user-shared-fill` = Builder(name = "User-shared-fill", defaultWidth = 24.0.dp,
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
                moveTo(18.5858f, 17.0f)
                lineTo(16.7574f, 15.1716f)
                lineTo(18.1716f, 13.7574f)
                lineTo(22.4142f, 18.0f)
                lineTo(18.1716f, 22.2426f)
                lineTo(16.7574f, 20.8284f)
                lineTo(18.5858f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.5858f)
                close()
            }
        }
        .build()
        return `_user-shared-fill`!!
    }

private var `_user-shared-fill`: ImageVector? = null
