package com.coleblvck.shelf.ui.remixIcons.remixicon.finance

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.FinanceGroup

public val FinanceGroup.`Red-packet-fill`: ImageVector
    get() {
        if (`_red-packet-fill` != null) {
            return `_red-packet-fill`!!
        }
        `_red-packet-fill` = Builder(name = "Red-packet-fill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0049f, 5.9403f)
                curveTo(19.2657f, 7.9107f, 16.8895f, 9.3057f, 14.1986f, 9.8028f)
                curveTo(13.7739f, 9.0281f, 12.9507f, 8.5028f, 12.0049f, 8.5028f)
                curveTo(11.0591f, 8.5028f, 10.2359f, 9.0281f, 9.8112f, 9.8028f)
                curveTo(7.1203f, 9.3057f, 4.7441f, 7.9107f, 3.0049f, 5.9403f)
                verticalLineTo(3.0028f)
                curveTo(3.0049f, 2.4505f, 3.4526f, 2.0028f, 4.0049f, 2.0028f)
                horizontalLineTo(20.0049f)
                curveTo(20.5572f, 2.0028f, 21.0049f, 2.4505f, 21.0049f, 3.0028f)
                verticalLineTo(5.9403f)
                close()
                moveTo(21.0049f, 8.727f)
                verticalLineTo(21.0028f)
                curveTo(21.0049f, 21.5551f, 20.5572f, 22.0028f, 20.0049f, 22.0028f)
                horizontalLineTo(4.0049f)
                curveTo(3.4526f, 22.0028f, 3.0049f, 21.5551f, 3.0049f, 21.0028f)
                verticalLineTo(8.727f)
                curveTo(4.865f, 10.2897f, 7.1376f, 11.3774f, 9.6357f, 11.8032f)
                curveTo(9.9695f, 12.7914f, 10.9041f, 13.5028f, 12.0049f, 13.5028f)
                curveTo(13.1057f, 13.5028f, 14.0403f, 12.7914f, 14.374f, 11.8032f)
                curveTo(16.8722f, 11.3774f, 19.1448f, 10.2897f, 21.0049f, 8.727f)
                close()
            }
        }
        .build()
        return `_red-packet-fill`!!
    }

private var `_red-packet-fill`: ImageVector? = null
