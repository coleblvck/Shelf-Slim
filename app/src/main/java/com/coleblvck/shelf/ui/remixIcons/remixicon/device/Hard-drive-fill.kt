package com.coleblvck.shelf.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Hard-drive-fill`: ImageVector
    get() {
        if (`_hard-drive-fill` != null) {
            return `_hard-drive-fill`!!
        }
        `_hard-drive-fill` = Builder(name = "Hard-drive-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9506f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 2.0f, 21.0f, 2.4477f, 21.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(21.0f, 21.5523f, 20.5523f, 22.0f, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 22.0f, 3.0f, 21.5523f, 3.0f, 21.0f)
                verticalLineTo(12.9506f)
                curveTo(3.3289f, 12.9833f, 3.6625f, 13.0f, 4.0f, 13.0f)
                curveTo(9.5229f, 13.0f, 14.0f, 8.5229f, 14.0f, 3.0f)
                curveTo(14.0f, 2.6625f, 13.9833f, 2.3289f, 13.9506f, 2.0f)
                close()
                moveTo(15.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(11.9381f, 2.0f)
                curveTo(11.979f, 2.3276f, 12.0f, 2.6613f, 12.0f, 3.0f)
                curveTo(12.0f, 7.4183f, 8.4183f, 11.0f, 4.0f, 11.0f)
                curveTo(3.6613f, 11.0f, 3.3276f, 10.979f, 3.0f, 10.9381f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 2.4477f, 3.4477f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(11.9381f)
                close()
            }
        }
        .build()
        return `_hard-drive-fill`!!
    }

private var `_hard-drive-fill`: ImageVector? = null
