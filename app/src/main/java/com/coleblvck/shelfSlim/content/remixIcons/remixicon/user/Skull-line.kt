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

public val UserGroup.`Skull-line`: ImageVector
    get() {
        if (`_skull-line` != null) {
            return `_skull-line`!!
        }
        `_skull-line` = Builder(name = "Skull-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                curveTo(7.5523f, 16.0f, 8.0f, 16.4477f, 8.0f, 17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                curveTo(16.0f, 16.4477f, 16.4477f, 16.0f, 17.0f, 16.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                close()
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
                curveTo(6.6716f, 14.0f, 6.0f, 13.3284f, 6.0f, 12.5f)
                curveTo(6.0f, 11.6716f, 6.6716f, 11.0f, 7.5f, 11.0f)
                curveTo(8.3284f, 11.0f, 9.0f, 11.6716f, 9.0f, 12.5f)
                curveTo(9.0f, 13.3284f, 8.3284f, 14.0f, 7.5f, 14.0f)
                close()
                moveTo(16.5f, 14.0f)
                curveTo(15.6716f, 14.0f, 15.0f, 13.3284f, 15.0f, 12.5f)
                curveTo(15.0f, 11.6716f, 15.6716f, 11.0f, 16.5f, 11.0f)
                curveTo(17.3284f, 11.0f, 18.0f, 11.6716f, 18.0f, 12.5f)
                curveTo(18.0f, 13.3284f, 17.3284f, 14.0f, 16.5f, 14.0f)
                close()
            }
        }
        .build()
        return `_skull-line`!!
    }

private var `_skull-line`: ImageVector? = null
