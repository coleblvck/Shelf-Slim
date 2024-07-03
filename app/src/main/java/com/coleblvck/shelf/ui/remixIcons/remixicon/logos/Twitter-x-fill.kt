package com.coleblvck.shelf.ui.remixIcons.remixicon.logos

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelf.ui.remixIcons.remixicon.LogosGroup

public val LogosGroup.`Twitter-x-fill`: ImageVector
    get() {
        if (`_twitter-x-fill` != null) {
            return `_twitter-x-fill`!!
        }
        `_twitter-x-fill` = Builder(name = "Twitter-x-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.2048f, 2.25f)
                horizontalLineTo(21.5128f)
                lineTo(14.2858f, 10.51f)
                lineTo(22.7878f, 21.75f)
                horizontalLineTo(16.1308f)
                lineTo(10.9168f, 14.933f)
                lineTo(4.9508f, 21.75f)
                horizontalLineTo(1.6408f)
                lineTo(9.3708f, 12.915f)
                lineTo(1.2148f, 2.25f)
                horizontalLineTo(8.0408f)
                lineTo(12.7538f, 8.481f)
                lineTo(18.2048f, 2.25f)
                close()
                moveTo(17.0438f, 19.77f)
                horizontalLineTo(18.8768f)
                lineTo(7.0448f, 4.126f)
                horizontalLineTo(5.0778f)
                lineTo(17.0438f, 19.77f)
                close()
            }
        }
        .build()
        return `_twitter-x-fill`!!
    }

private var `_twitter-x-fill`: ImageVector? = null
