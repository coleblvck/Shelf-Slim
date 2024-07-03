package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Door-lock-box-fill`: ImageVector
    get() {
        if (`_door-lock-box-fill` != null) {
            return `_door-lock-box-fill`!!
        }
        `_door-lock-box-fill` = Builder(name = "Door-lock-box-fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(11.0f, 12.792f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.792f)
                curveTo(13.883f, 12.4062f, 14.5f, 11.5252f, 14.5f, 10.5f)
                curveTo(14.5f, 9.1193f, 13.3807f, 8.0f, 12.0f, 8.0f)
                curveTo(10.6193f, 8.0f, 9.5f, 9.1193f, 9.5f, 10.5f)
                curveTo(9.5f, 11.5252f, 10.117f, 12.4062f, 11.0f, 12.792f)
                close()
            }
        }
        .build()
        return `_door-lock-box-fill`!!
    }

private var `_door-lock-box-fill`: ImageVector? = null
