package com.coleblvck.shelf.ui.remixIcons.remixicon.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.OthersGroup

public val OthersGroup.`Door-lock-box-line`: ImageVector
    get() {
        if (`_door-lock-box-line` != null) {
            return `_door-lock-box-line`!!
        }
        `_door-lock-box-line` = Builder(name = "Door-lock-box-line", defaultWidth = 24.0.dp,
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
                moveTo(5.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(11.0f, 12.792f)
                curveTo(10.117f, 12.4062f, 9.5f, 11.5252f, 9.5f, 10.5f)
                curveTo(9.5f, 9.1193f, 10.6193f, 8.0f, 12.0f, 8.0f)
                curveTo(13.3807f, 8.0f, 14.5f, 9.1193f, 14.5f, 10.5f)
                curveTo(14.5f, 11.5252f, 13.883f, 12.4062f, 13.0f, 12.792f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.792f)
                close()
            }
        }
        .build()
        return `_door-lock-box-line`!!
    }

private var `_door-lock-box-line`: ImageVector? = null
