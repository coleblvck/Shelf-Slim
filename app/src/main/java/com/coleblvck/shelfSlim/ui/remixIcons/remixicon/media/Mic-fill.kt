package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.media

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.MediaGroup

public val MediaGroup.`Mic-fill`: ImageVector
    get() {
        if (`_mic-fill` != null) {
            return `_mic-fill`!!
        }
        `_mic-fill` = Builder(name = "Mic-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 1.0f)
                curveTo(14.7612f, 1.0f, 16.9998f, 3.2386f, 16.9998f, 6.0f)
                verticalLineTo(10.0f)
                curveTo(16.9998f, 12.7614f, 14.7612f, 15.0f, 11.9998f, 15.0f)
                curveTo(9.2383f, 15.0f, 6.9998f, 12.7614f, 6.9998f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(6.9998f, 3.2386f, 9.2383f, 1.0f, 11.9998f, 1.0f)
                close()
                moveTo(3.0547f, 11.0f)
                horizontalLineTo(5.0707f)
                curveTo(5.5559f, 14.3923f, 8.4733f, 17.0f, 11.9998f, 17.0f)
                curveTo(15.5262f, 17.0f, 18.4436f, 14.3923f, 18.9289f, 11.0f)
                horizontalLineTo(20.9448f)
                curveTo(20.4837f, 15.1716f, 17.1714f, 18.4839f, 12.9998f, 18.9451f)
                verticalLineTo(23.0f)
                horizontalLineTo(10.9998f)
                verticalLineTo(18.9451f)
                curveTo(6.8281f, 18.4839f, 3.5158f, 15.1716f, 3.0547f, 11.0f)
                close()
            }
        }
        .build()
        return `_mic-fill`!!
    }

private var `_mic-fill`: ImageVector? = null
