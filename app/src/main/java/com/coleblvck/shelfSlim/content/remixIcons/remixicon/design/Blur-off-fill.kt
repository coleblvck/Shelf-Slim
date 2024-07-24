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

public val DesignGroup.`Blur-off-fill`: ImageVector
    get() {
        if (`_blur-off-fill` != null) {
            return `_blur-off-fill`!!
        }
        `_blur-off-fill` = Builder(name = "Blur-off-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4324f, 6.8433f)
                lineTo(1.3936f, 2.8045f)
                lineTo(2.8078f, 1.3902f)
                lineTo(22.6068f, 21.1892f)
                lineTo(21.1925f, 22.6034f)
                lineTo(18.1537f, 19.5646f)
                curveTo(14.6255f, 22.8742f, 9.0816f, 22.8062f, 5.6362f, 19.3608f)
                curveTo(2.1908f, 15.9154f, 2.1228f, 10.3715f, 5.4324f, 6.8433f)
                close()
                moveTo(8.2433f, 4.0258f)
                lineTo(12.0002f, 0.2689f)
                lineTo(18.3641f, 6.6329f)
                curveTo(20.9499f, 9.2186f, 21.6333f, 12.9863f, 20.4144f, 16.1969f)
                lineTo(8.2433f, 4.0258f)
                close()
            }
        }
        .build()
        return `_blur-off-fill`!!
    }

private var `_blur-off-fill`: ImageVector? = null
