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

public val SystemGroup.`Logout-box-r-fill`: ImageVector
    get() {
        if (`_logout-box-r-fill` != null) {
            return `_logout-box-r-fill`!!
        }
        `_logout-box-r-fill` = Builder(name = "Logout-box-r-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 22.0f)
                curveTo(4.4477f, 22.0f, 4.0f, 21.5523f, 4.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(4.0f, 2.4477f, 4.4477f, 2.0f, 5.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 2.0f, 20.0f, 2.4477f, 20.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.5523f, 19.5523f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(15.0f, 16.0f)
                lineTo(20.0f, 12.0f)
                lineTo(15.0f, 8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_logout-box-r-fill`!!
    }

private var `_logout-box-r-fill`: ImageVector? = null
