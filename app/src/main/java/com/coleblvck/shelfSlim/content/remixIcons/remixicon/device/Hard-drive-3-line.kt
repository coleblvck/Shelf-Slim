package com.coleblvck.shelfSlim.content.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Hard-drive-3-line`: ImageVector
    get() {
        if (`_hard-drive-3-line` != null) {
            return `_hard-drive-3-line`!!
        }
        `_hard-drive-3-line` = Builder(name = "Hard-drive-3-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5077f, 2.876f)
                curveTo(4.5703f, 2.3755f, 4.9957f, 2.0f, 5.5f, 2.0f)
                horizontalLineTo(18.5f)
                curveTo(19.0043f, 2.0f, 19.4297f, 2.3755f, 19.4923f, 2.876f)
                lineTo(20.9923f, 14.876f)
                curveTo(20.9974f, 14.9171f, 21.0f, 14.9585f, 21.0f, 15.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(3.0f, 14.9585f, 3.0026f, 14.9171f, 3.0077f, 14.876f)
                lineTo(4.5077f, 2.876f)
                close()
                moveTo(6.3828f, 4.0f)
                lineTo(5.1328f, 14.0f)
                horizontalLineTo(18.8672f)
                lineTo(17.6172f, 4.0f)
                horizontalLineTo(6.3828f)
                close()
                moveTo(19.0f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                close()
                moveTo(15.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return `_hard-drive-3-line`!!
    }

private var `_hard-drive-3-line`: ImageVector? = null