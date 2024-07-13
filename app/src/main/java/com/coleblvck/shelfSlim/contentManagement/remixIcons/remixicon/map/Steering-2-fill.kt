package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.map

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.MapGroup

public val MapGroup.`Steering-2-fill`: ImageVector
    get() {
        if (`_steering-2-fill` != null) {
            return `_steering-2-fill`!!
        }
        `_steering-2-fill` = Builder(name = "Steering-2-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.0f, 13.0f)
                lineTo(4.062f, 13.001f)
                curveTo(4.5136f, 16.6192f, 7.3816f, 19.4869f, 11.0f, 19.9381f)
                verticalLineTo(16.0f)
                curveTo(9.3432f, 16.0f, 8.0f, 14.6569f, 8.0f, 13.0f)
                close()
                moveTo(19.938f, 13.001f)
                lineTo(16.0f, 13.0f)
                curveTo(16.0f, 14.6569f, 14.6569f, 16.0f, 13.0f, 16.0f)
                lineTo(13.001f, 19.938f)
                curveTo(16.6189f, 19.4864f, 19.4864f, 16.6189f, 19.938f, 13.001f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.9204f, 4.0f, 4.554f, 7.0537f, 4.0619f, 11.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 10.4477f, 8.4477f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 10.0f, 16.0f, 10.4477f, 16.0f, 11.0f)
                horizontalLineTo(19.9381f)
                curveTo(19.446f, 7.0537f, 16.0796f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return `_steering-2-fill`!!
    }

private var `_steering-2-fill`: ImageVector? = null
