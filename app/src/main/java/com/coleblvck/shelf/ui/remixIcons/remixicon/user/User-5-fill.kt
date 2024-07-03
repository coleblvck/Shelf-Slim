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

public val UserGroup.`User-5-fill`: ImageVector
    get() {
        if (`_user-5-fill` != null) {
            return `_user-5-fill`!!
        }
        `_user-5-fill` = Builder(name = "User-5-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.3894f, 16.5386f)
                curveTo(5.3389f, 15.0901f, 4.0f, 12.7014f, 4.0f, 10.0f)
                curveTo(4.0f, 5.5817f, 7.5817f, 2.0f, 12.0f, 2.0f)
                curveTo(16.4183f, 2.0f, 20.0f, 5.5817f, 20.0f, 10.0f)
                curveTo(20.0f, 12.7014f, 18.6611f, 15.0901f, 16.6106f, 16.5386f)
                lineTo(18.6936f, 21.2996f)
                curveTo(18.8043f, 21.5526f, 18.6889f, 21.8474f, 18.4359f, 21.9581f)
                curveTo(18.3727f, 21.9857f, 18.3045f, 22.0f, 18.2355f, 22.0f)
                horizontalLineTo(5.7645f)
                curveTo(5.4884f, 22.0f, 5.2645f, 21.7761f, 5.2645f, 21.5f)
                curveTo(5.2645f, 21.431f, 5.2788f, 21.3628f, 5.3064f, 21.2996f)
                lineTo(7.3894f, 16.5386f)
                close()
                moveTo(8.1185f, 10.9704f)
                curveTo(8.5522f, 12.7106f, 10.1255f, 14.0f, 12.0f, 14.0f)
                curveTo(13.8745f, 14.0f, 15.4478f, 12.7106f, 15.8815f, 10.9704f)
                lineTo(13.9407f, 10.4852f)
                curveTo(13.7239f, 11.3553f, 12.9372f, 12.0f, 12.0f, 12.0f)
                curveTo(11.0628f, 12.0f, 10.2761f, 11.3553f, 10.0593f, 10.4852f)
                lineTo(8.1185f, 10.9704f)
                close()
            }
        }
        .build()
        return `_user-5-fill`!!
    }

private var `_user-5-fill`: ImageVector? = null
