package com.coleblvck.shelf.ui.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Toggle-fill`: ImageVector
    get() {
        if (`_toggle-fill` != null) {
            return `_toggle-fill`!!
        }
        `_toggle-fill` = Builder(name = "Toggle-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(19.866f, 5.0f, 23.0f, 8.134f, 23.0f, 12.0f)
                curveTo(23.0f, 15.866f, 19.866f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(4.134f, 19.0f, 1.0f, 15.866f, 1.0f, 12.0f)
                curveTo(1.0f, 8.134f, 4.134f, 5.0f, 8.0f, 5.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveTo(17.6569f, 15.0f, 19.0f, 13.6569f, 19.0f, 12.0f)
                curveTo(19.0f, 10.3431f, 17.6569f, 9.0f, 16.0f, 9.0f)
                curveTo(14.3431f, 9.0f, 13.0f, 10.3431f, 13.0f, 12.0f)
                curveTo(13.0f, 13.6569f, 14.3431f, 15.0f, 16.0f, 15.0f)
                close()
            }
        }
        .build()
        return `_toggle-fill`!!
    }

private var `_toggle-fill`: ImageVector? = null
