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

public val SystemGroup.`Function-add-fill`: ImageVector
    get() {
        if (`_function-add-fill` != null) {
            return `_function-add-fill`!!
        }
        `_function-add-fill` = Builder(name = "Function-add-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                curveTo(3.4477f, 3.0f, 3.0f, 3.4477f, 3.0f, 4.0f)
                verticalLineTo(10.0f)
                curveTo(3.0f, 10.5523f, 3.4477f, 11.0f, 4.0f, 11.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 11.0f, 11.0f, 10.5523f, 11.0f, 10.0f)
                verticalLineTo(4.0f)
                curveTo(11.0f, 3.4477f, 10.5523f, 3.0f, 10.0f, 3.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(4.0f, 13.0f)
                curveTo(3.4477f, 13.0f, 3.0f, 13.4477f, 3.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.5523f, 3.4477f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5523f, 21.0f, 11.0f, 20.5523f, 11.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(11.0f, 13.4477f, 10.5523f, 13.0f, 10.0f, 13.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(14.0f, 13.0f)
                curveTo(13.4477f, 13.0f, 13.0f, 13.4477f, 13.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(13.0f, 20.5523f, 13.4477f, 21.0f, 14.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(21.0f, 13.4477f, 20.5523f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(16.0f, 11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_function-add-fill`!!
    }

private var `_function-add-fill`: ImageVector? = null