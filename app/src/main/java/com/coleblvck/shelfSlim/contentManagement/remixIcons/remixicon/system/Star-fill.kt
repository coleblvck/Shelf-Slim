package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.system

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.SystemGroup

public val SystemGroup.`Star-fill`: ImageVector
    get() {
        if (`_star-fill` != null) {
            return `_star-fill`!!
        }
        `_star-fill` = Builder(name = "Star-fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
            }
        }
        .build()
        return `_star-fill`!!
    }

private var `_star-fill`: ImageVector? = null