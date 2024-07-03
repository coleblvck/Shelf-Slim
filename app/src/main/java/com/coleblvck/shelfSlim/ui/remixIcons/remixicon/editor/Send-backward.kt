package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.editor

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.EditorGroup

public val EditorGroup.`Send-backward`: ImageVector
    get() {
        if (`_send-backward` != null) {
            return `_send-backward`!!
        }
        `_send-backward` = Builder(name = "Send-backward", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                curveTo(14.5523f, 3.0f, 15.0f, 3.4477f, 15.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 9.0f, 21.0f, 9.4477f, 21.0f, 10.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 21.0f, 9.0f, 20.5523f, 9.0f, 20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 15.0f, 3.0f, 14.5523f, 3.0f, 14.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                curveTo(9.0f, 9.4477f, 9.4477f, 9.0f, 10.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_send-backward`!!
    }

private var `_send-backward`: ImageVector? = null