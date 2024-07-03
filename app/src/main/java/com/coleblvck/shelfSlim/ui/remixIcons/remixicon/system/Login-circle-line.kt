package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Login-circle-line`: ImageVector
    get() {
        if (`_login-circle-line` != null) {
            return `_login-circle-line`!!
        }
        `_login-circle-line` = Builder(name = "Login-circle-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 11.0f)
                verticalLineTo(8.0f)
                lineTo(15.0f, 12.0f)
                lineTo(10.0f, 16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                close()
                moveTo(2.4578f, 15.0f)
                horizontalLineTo(4.5815f)
                curveTo(5.7683f, 17.9318f, 8.6426f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(8.6426f, 4.0f, 5.7683f, 6.0682f, 4.5815f, 9.0f)
                horizontalLineTo(2.4578f)
                curveTo(3.7321f, 4.9429f, 7.5224f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(7.5224f, 22.0f, 3.7321f, 19.0571f, 2.4578f, 15.0f)
                close()
            }
        }
        .build()
        return `_login-circle-line`!!
    }

private var `_login-circle-line`: ImageVector? = null
