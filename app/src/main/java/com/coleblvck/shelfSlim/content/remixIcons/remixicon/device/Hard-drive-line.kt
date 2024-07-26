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

public val DeviceGroup.`Hard-drive-line`: ImageVector
    get() {
        if (`_hard-drive-line` != null) {
            return `_hard-drive-line`!!
        }
        `_hard-drive-line` = Builder(name = "Hard-drive-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 10.9381f)
                curveTo(8.6187f, 10.4869f, 11.4869f, 7.6187f, 11.9381f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.9381f)
                close()
                moveTo(5.0f, 12.9506f)
                verticalLineTo(20.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.9506f)
                curveTo(13.4816f, 8.7244f, 9.7244f, 12.4816f, 5.0f, 12.9506f)
                close()
                moveTo(4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.4477f, 3.4477f, 2.0f, 4.0f, 2.0f)
                close()
                moveTo(15.0f, 16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return `_hard-drive-line`!!
    }

private var `_hard-drive-line`: ImageVector? = null