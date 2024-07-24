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

public val UserGroup.`User-heart-fill`: ImageVector
    get() {
        if (`_user-heart-fill` != null) {
            return `_user-heart-fill`!!
        }
        `_user-heart-fill` = Builder(name = "User-heart-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.841f, 15.659f)
                lineTo(18.017f, 15.836f)
                lineTo(18.1945f, 15.659f)
                curveTo(19.0732f, 14.7803f, 20.4978f, 14.7803f, 21.3765f, 15.659f)
                curveTo(22.2552f, 16.5377f, 22.2552f, 17.9623f, 21.3765f, 18.841f)
                lineTo(18.0178f, 22.1997f)
                lineTo(14.659f, 18.841f)
                curveTo(13.7803f, 17.9623f, 13.7803f, 16.5377f, 14.659f, 15.659f)
                curveTo(15.5377f, 14.7803f, 16.9623f, 14.7803f, 17.841f, 15.659f)
                close()
                moveTo(12.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                curveTo(4.0f, 17.6651f, 7.4478f, 14.1355f, 11.7508f, 14.0038f)
                lineTo(12.0f, 14.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(15.315f, 1.0f, 18.0f, 3.685f, 18.0f, 7.0f)
                curveTo(18.0f, 10.315f, 15.315f, 13.0f, 12.0f, 13.0f)
                curveTo(8.685f, 13.0f, 6.0f, 10.315f, 6.0f, 7.0f)
                curveTo(6.0f, 3.685f, 8.685f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return `_user-heart-fill`!!
    }

private var `_user-heart-fill`: ImageVector? = null
