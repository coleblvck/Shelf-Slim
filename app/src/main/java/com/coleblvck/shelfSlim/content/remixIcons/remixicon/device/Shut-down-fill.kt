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

public val DeviceGroup.`Shut-down-fill`: ImageVector
    get() {
        if (`_shut-down-fill` != null) {
            return `_shut-down-fill`!!
        }
        `_shut-down-fill` = Builder(name = "Shut-down-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0494f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(2.0494f)
                curveTo(18.0533f, 2.5511f, 22.0f, 6.8147f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5229f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5229f, 2.0f, 12.0f)
                curveTo(2.0f, 6.8147f, 5.9467f, 2.5511f, 11.0f, 2.0494f)
                close()
            }
        }
        .build()
        return `_shut-down-fill`!!
    }

private var `_shut-down-fill`: ImageVector? = null
