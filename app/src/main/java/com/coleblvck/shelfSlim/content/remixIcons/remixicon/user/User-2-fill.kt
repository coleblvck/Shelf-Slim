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

public val UserGroup.`User-2-fill`: ImageVector
    get() {
        if (`_user-2-fill` != null) {
            return `_user-2-fill`!!
        }
        `_user-2-fill` = Builder(name = "User-2-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.0619f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0619f)
                curveTo(16.9463f, 14.554f, 20.0f, 17.9204f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.9204f, 7.0537f, 14.554f, 11.0f, 14.0619f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.685f, 8.685f, 1.0f, 12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.315f, 15.315f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return `_user-2-fill`!!
    }

private var `_user-2-fill`: ImageVector? = null
