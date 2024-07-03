package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.device

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DeviceGroup

public val DeviceGroup.`Gradienter-line`: ImageVector
    get() {
        if (`_gradienter-line` != null) {
            return `_gradienter-line`!!
        }
        `_gradienter-line` = Builder(name = "Gradienter-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0493f, 13.0f)
                horizontalLineTo(4.0618f)
                curveTo(4.5539f, 16.9463f, 7.9203f, 20.0f, 11.9999f, 20.0f)
                curveTo(16.0796f, 20.0f, 19.4459f, 16.9463f, 19.938f, 13.0f)
                horizontalLineTo(21.9506f)
                curveTo(21.4488f, 18.0533f, 17.1853f, 22.0f, 11.9999f, 22.0f)
                curveTo(6.8146f, 22.0f, 2.551f, 18.0533f, 2.0493f, 13.0f)
                close()
                moveTo(2.0493f, 11.0f)
                curveTo(2.551f, 5.9467f, 6.8146f, 2.0f, 11.9999f, 2.0f)
                curveTo(17.1853f, 2.0f, 21.4488f, 5.9467f, 21.9506f, 11.0f)
                horizontalLineTo(19.938f)
                curveTo(19.4459f, 7.0537f, 16.0796f, 4.0f, 11.9999f, 4.0f)
                curveTo(7.9203f, 4.0f, 4.5539f, 7.0537f, 4.0618f, 11.0f)
                horizontalLineTo(2.0493f)
                close()
                moveTo(11.9999f, 14.0f)
                curveTo(10.8954f, 14.0f, 9.9999f, 13.1046f, 9.9999f, 12.0f)
                curveTo(9.9999f, 10.8954f, 10.8954f, 10.0f, 11.9999f, 10.0f)
                curveTo(13.1045f, 10.0f, 13.9999f, 10.8954f, 13.9999f, 12.0f)
                curveTo(13.9999f, 13.1046f, 13.1045f, 14.0f, 11.9999f, 14.0f)
                close()
            }
        }
        .build()
        return `_gradienter-line`!!
    }

private var `_gradienter-line`: ImageVector? = null
