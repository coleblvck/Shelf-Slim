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

public val UserGroup.`User-2-line`: ImageVector
    get() {
        if (`_user-2-line` != null) {
            return `_user-2-line`!!
        }
        `_user-2-line` = Builder(name = "User-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 22.0f)
                curveTo(4.0f, 17.5817f, 7.5817f, 14.0f, 12.0f, 14.0f)
                curveTo(16.4183f, 14.0f, 20.0f, 17.5817f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(13.0f, 16.083f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.6586f)
                curveTo(16.9423f, 17.9735f, 15.1684f, 16.4467f, 13.0f, 16.083f)
                close()
                moveTo(11.0f, 20.0f)
                verticalLineTo(16.083f)
                curveTo(8.8316f, 16.4467f, 7.0577f, 17.9735f, 6.3414f, 20.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.685f, 8.685f, 1.0f, 12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.315f, 15.315f, 13.0f, 12.0f, 13.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(14.2104f, 11.0f, 16.0f, 9.2104f, 16.0f, 7.0f)
                curveTo(16.0f, 4.7896f, 14.2104f, 3.0f, 12.0f, 3.0f)
                curveTo(9.7896f, 3.0f, 8.0f, 4.7896f, 8.0f, 7.0f)
                curveTo(8.0f, 9.2104f, 9.7896f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return `_user-2-line`!!
    }

private var `_user-2-line`: ImageVector? = null
