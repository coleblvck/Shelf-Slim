package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Thumb-up-fill`: ImageVector
    get() {
        if (`_thumb-up-fill` != null) {
            return `_thumb-up-fill`!!
        }
        `_thumb-up-fill` = Builder(name = "Thumb-up-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                curveTo(1.4477f, 21.0f, 1.0f, 20.5523f, 1.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(1.0f, 9.4477f, 1.4477f, 9.0f, 2.0f, 9.0f)
                close()
                moveTo(7.2929f, 7.7071f)
                lineTo(13.6934f, 1.3066f)
                curveTo(13.8693f, 1.1307f, 14.1479f, 1.1109f, 14.3469f, 1.2602f)
                lineTo(15.1995f, 1.8996f)
                curveTo(15.6842f, 2.2631f, 15.9026f, 2.8825f, 15.7531f, 3.4697f)
                lineTo(14.5998f, 8.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1046f, 8.0f, 23.0f, 8.8954f, 23.0f, 10.0f)
                verticalLineTo(12.1043f)
                curveTo(23.0f, 12.3656f, 22.9488f, 12.6243f, 22.8494f, 12.8658f)
                lineTo(19.755f, 20.3807f)
                curveTo(19.6007f, 20.7554f, 19.2355f, 21.0f, 18.8303f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(7.4477f, 21.0f, 7.0f, 20.5523f, 7.0f, 20.0f)
                verticalLineTo(8.4142f)
                curveTo(7.0f, 8.149f, 7.1054f, 7.8946f, 7.2929f, 7.7071f)
                close()
            }
        }
        .build()
        return `_thumb-up-fill`!!
    }

private var `_thumb-up-fill`: ImageVector? = null
