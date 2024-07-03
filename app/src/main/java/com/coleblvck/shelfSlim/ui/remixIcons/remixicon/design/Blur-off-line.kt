package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.DesignGroup

public val DesignGroup.`Blur-off-line`: ImageVector
    get() {
        if (`_blur-off-line` != null) {
            return `_blur-off-line`!!
        }
        `_blur-off-line` = Builder(name = "Blur-off-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1537f, 19.5646f)
                curveTo(14.6255f, 22.8742f, 9.0816f, 22.8062f, 5.6362f, 19.3608f)
                curveTo(2.1908f, 15.9154f, 2.1228f, 10.3715f, 5.4324f, 6.8433f)
                lineTo(1.3936f, 2.8045f)
                lineTo(2.8078f, 1.3902f)
                lineTo(22.6068f, 21.1892f)
                lineTo(21.1925f, 22.6034f)
                lineTo(18.1537f, 19.5646f)
                close()
                moveTo(6.8476f, 8.2585f)
                curveTo(4.3185f, 11.0046f, 4.3861f, 15.2823f, 7.0504f, 17.9466f)
                curveTo(9.7147f, 20.6109f, 13.9924f, 20.6785f, 16.7385f, 18.1494f)
                lineTo(6.8476f, 8.2585f)
                close()
                moveTo(20.4144f, 16.1969f)
                lineTo(18.8156f, 14.598f)
                curveTo(19.3488f, 12.3187f, 18.7269f, 9.8241f, 16.9499f, 8.0471f)
                lineTo(12.0002f, 3.0973f)
                lineTo(9.6575f, 5.44f)
                lineTo(8.2433f, 4.0258f)
                lineTo(12.0002f, 0.2689f)
                lineTo(18.3641f, 6.6329f)
                curveTo(20.9499f, 9.2186f, 21.6333f, 12.9863f, 20.4144f, 16.1969f)
                close()
            }
        }
        .build()
        return `_blur-off-line`!!
    }

private var `_blur-off-line`: ImageVector? = null
