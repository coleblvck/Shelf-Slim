package com.coleblvck.shelfSlim.content.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Star-line`: ImageVector
    get() {
        if (`_star-line` != null) {
            return `_star-line`!!
        }
        `_star-line` = Builder(name = "Star-line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0006f, 18.26f)
                lineTo(4.9472f, 22.2082f)
                lineTo(6.5225f, 14.2799f)
                lineTo(0.5879f, 8.7918f)
                lineTo(8.6149f, 7.8401f)
                lineTo(12.0006f, 0.5f)
                lineTo(15.3862f, 7.8401f)
                lineTo(23.4132f, 8.7918f)
                lineTo(17.4787f, 14.2799f)
                lineTo(19.054f, 22.2082f)
                lineTo(12.0006f, 18.26f)
                close()
                moveTo(12.0006f, 15.968f)
                lineTo(16.2473f, 18.3451f)
                lineTo(15.2988f, 13.5717f)
                lineTo(18.8719f, 10.2674f)
                lineTo(14.039f, 9.6943f)
                lineTo(12.0006f, 5.275f)
                lineTo(9.9621f, 9.6943f)
                lineTo(5.1292f, 10.2674f)
                lineTo(8.7023f, 13.5717f)
                lineTo(7.7538f, 18.3451f)
                lineTo(12.0006f, 15.968f)
                close()
            }
        }
        .build()
        return `_star-line`!!
    }

private var `_star-line`: ImageVector? = null
