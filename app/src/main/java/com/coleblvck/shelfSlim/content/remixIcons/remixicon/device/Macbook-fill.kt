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

public val DeviceGroup.`Macbook-fill`: ImageVector
    get() {
        if (`_macbook-fill` != null) {
            return `_macbook-fill`!!
        }
        `_macbook-fill` = Builder(name = "Macbook-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0068f)
                curveTo(2.0f, 3.4508f, 2.4553f, 3.0f, 2.9918f, 3.0f)
                horizontalLineTo(21.0082f)
                curveTo(21.556f, 3.0f, 22.0f, 3.4499f, 22.0f, 4.0068f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0068f)
                close()
                moveTo(1.0f, 19.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return `_macbook-fill`!!
    }

private var `_macbook-fill`: ImageVector? = null
