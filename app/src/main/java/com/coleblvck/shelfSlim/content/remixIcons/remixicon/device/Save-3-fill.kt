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

public val DeviceGroup.`Save-3-fill`: ImageVector
    get() {
        if (`_save-3-fill` != null) {
            return `_save-3-fill`!!
        }
        `_save-3-fill` = Builder(name = "Save-3-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 3.0f)
                horizontalLineTo(18.0f)
                lineTo(20.7071f, 5.7071f)
                curveTo(20.8946f, 5.8946f, 21.0f, 6.149f, 21.0f, 6.4142f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                close()
                moveTo(7.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(6.0f, 12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(13.0f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return `_save-3-fill`!!
    }

private var `_save-3-fill`: ImageVector? = null
