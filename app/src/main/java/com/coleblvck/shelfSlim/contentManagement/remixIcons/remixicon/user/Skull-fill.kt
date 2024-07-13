package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.UserGroup

public val UserGroup.`Skull-fill`: ImageVector
    get() {
        if (`_skull-fill` != null) {
            return `_skull-fill`!!
        }
        `_skull-fill` = Builder(name = "Skull-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                verticalLineTo(21.0f)
                curveTo(18.0f, 21.5523f, 17.5523f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 22.0f, 6.0f, 21.5523f, 6.0f, 21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 18.0f, 2.0f, 17.5523f, 2.0f, 17.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 17.5523f, 21.5523f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(7.5f, 14.0f)
                curveTo(8.3284f, 14.0f, 9.0f, 13.3284f, 9.0f, 12.5f)
                curveTo(9.0f, 11.6716f, 8.3284f, 11.0f, 7.5f, 11.0f)
                curveTo(6.6716f, 11.0f, 6.0f, 11.6716f, 6.0f, 12.5f)
                curveTo(6.0f, 13.3284f, 6.6716f, 14.0f, 7.5f, 14.0f)
                close()
                moveTo(16.5f, 14.0f)
                curveTo(17.3284f, 14.0f, 18.0f, 13.3284f, 18.0f, 12.5f)
                curveTo(18.0f, 11.6716f, 17.3284f, 11.0f, 16.5f, 11.0f)
                curveTo(15.6716f, 11.0f, 15.0f, 11.6716f, 15.0f, 12.5f)
                curveTo(15.0f, 13.3284f, 15.6716f, 14.0f, 16.5f, 14.0f)
                close()
            }
        }
        .build()
        return `_skull-fill`!!
    }

private var `_skull-fill`: ImageVector? = null
