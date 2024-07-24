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

public val DesignGroup.`Brush-2-line`: ImageVector
    get() {
        if (`_brush-2-line` != null) {
            return `_brush-2-line`!!
        }
        `_brush-2-line` = Builder(name = "Brush-2-line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5357f, 15.9465f)
                lineTo(18.657f, 13.8252f)
                lineTo(15.475f, 10.6432f)
                lineTo(19.0106f, 7.1077f)
                lineTo(16.8892f, 4.9864f)
                lineTo(13.3537f, 8.5219f)
                lineTo(10.1717f, 5.3399f)
                lineTo(8.0504f, 7.4612f)
                lineTo(16.5357f, 15.9465f)
                close()
                moveTo(15.1215f, 17.3607f)
                lineTo(6.6362f, 8.8754f)
                lineTo(3.8078f, 11.7039f)
                lineTo(12.293f, 20.1892f)
                lineTo(15.1215f, 17.3607f)
                close()
                moveTo(13.3537f, 5.6935f)
                lineTo(16.1821f, 2.865f)
                curveTo(16.5727f, 2.4745f, 17.2058f, 2.4745f, 17.5963f, 2.865f)
                lineTo(21.1319f, 6.4006f)
                curveTo(21.5224f, 6.7911f, 21.5224f, 7.4243f, 21.1319f, 7.8148f)
                lineTo(18.3035f, 10.6432f)
                lineTo(20.7783f, 13.1181f)
                curveTo(21.1689f, 13.5086f, 21.1689f, 14.1418f, 20.7783f, 14.5323f)
                lineTo(13.0002f, 22.3105f)
                curveTo(12.6096f, 22.701f, 11.9765f, 22.701f, 11.5859f, 22.3105f)
                lineTo(1.6865f, 12.411f)
                curveTo(1.2959f, 12.0205f, 1.2959f, 11.3873f, 1.6865f, 10.9968f)
                lineTo(9.4646f, 3.2186f)
                curveTo(9.8552f, 2.8281f, 10.4883f, 2.8281f, 10.8788f, 3.2186f)
                lineTo(13.3537f, 5.6935f)
                close()
            }
        }
        .build()
        return `_brush-2-line`!!
    }

private var `_brush-2-line`: ImageVector? = null
