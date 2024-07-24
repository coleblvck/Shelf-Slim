package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Logout-circle-line`: ImageVector
    get() {
        if (`_logout-circle-line` != null) {
            return `_logout-circle-line`!!
        }
        `_logout-circle-line` = Builder(name = "Logout-circle-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(16.0f)
                lineTo(0.0f, 12.0f)
                lineTo(5.0f, 8.0f)
                verticalLineTo(11.0f)
                close()
                moveTo(3.9993f, 18.0f)
                horizontalLineTo(6.7084f)
                curveTo(8.1186f, 19.2447f, 9.9711f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(9.9711f, 4.0f, 8.1186f, 4.7553f, 6.7084f, 6.0f)
                horizontalLineTo(3.9993f)
                curveTo(5.8237f, 3.5711f, 8.7284f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(8.7284f, 22.0f, 5.8237f, 20.4289f, 3.9993f, 18.0f)
                close()
            }
        }
        .build()
        return `_logout-circle-line`!!
    }

private var `_logout-circle-line`: ImageVector? = null
