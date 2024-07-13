package com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.development

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.contentManagement.remixIcons.remixicon.DevelopmentGroup

public val DevelopmentGroup.`Cursor-fill`: ImageVector
    get() {
        if (`_cursor-fill` != null) {
            return `_cursor-fill`!!
        }
        `_cursor-fill` = Builder(name = "Cursor-fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.9093f, 12.3603f)
                lineTo(17.0007f, 20.8537f)
                lineTo(14.1816f, 21.8798f)
                lineTo(11.0902f, 13.3864f)
                lineTo(6.918f, 16.5422f)
                lineTo(8.4087f, 1.6332f)
                lineTo(19.134f, 12.0959f)
                lineTo(13.9093f, 12.3603f)
                close()
            }
        }
        .build()
        return `_cursor-fill`!!
    }

private var `_cursor-fill`: ImageVector? = null
