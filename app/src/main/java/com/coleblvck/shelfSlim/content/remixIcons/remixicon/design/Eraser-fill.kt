package com.coleblvck.shelfSlim.content.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Eraser-fill`: ImageVector
    get() {
        if (`_eraser-fill` != null) {
            return `_eraser-fill`!!
        }
        `_eraser-fill` = Builder(name = "Eraser-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(15.6567f, 14.5113f)
                lineTo(19.1922f, 10.9758f)
                lineTo(12.8283f, 4.6118f)
                lineTo(9.2928f, 8.1474f)
                lineTo(15.6567f, 14.5113f)
                close()
            }
        }
        .build()
        return `_eraser-fill`!!
    }

private var `_eraser-fill`: ImageVector? = null
