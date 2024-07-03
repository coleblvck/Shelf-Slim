package com.coleblvck.shelf.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Eraser-line`: ImageVector
    get() {
        if (`_eraser-line` != null) {
            return `_eraser-line`!!
        }
        `_eraser-line` = Builder(name = "Eraser-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5856f, 8.8545f)
                lineTo(3.6359f, 13.8042f)
                lineTo(8.8302f, 18.9985f)
                lineTo(9.9999f, 18.9978f)
                verticalLineTo(18.9966f)
                horizontalLineTo(11.1714f)
                lineTo(14.9496f, 15.2184f)
                lineTo(8.5856f, 8.8545f)
                close()
                moveTo(9.9999f, 7.4403f)
                lineTo(16.3638f, 13.8042f)
                lineTo(19.1922f, 10.9758f)
                lineTo(12.8283f, 4.6118f)
                lineTo(9.9999f, 7.4403f)
                close()
                moveTo(13.9999f, 18.9966f)
                horizontalLineTo(20.9999f)
                verticalLineTo(20.9966f)
                horizontalLineTo(11.9999f)
                lineTo(8.0023f, 20.9991f)
                lineTo(1.5146f, 14.5113f)
                curveTo(1.1241f, 14.1208f, 1.1241f, 13.4877f, 1.5146f, 13.0971f)
                lineTo(12.1212f, 2.4905f)
                curveTo(12.5117f, 2.1f, 13.1449f, 2.1f, 13.5354f, 2.4905f)
                lineTo(21.3136f, 10.2687f)
                curveTo(21.7041f, 10.6592f, 21.7041f, 11.2924f, 21.3136f, 11.6829f)
                lineTo(13.9999f, 18.9966f)
                close()
            }
        }
        .build()
        return `_eraser-line`!!
    }

private var `_eraser-line`: ImageVector? = null
