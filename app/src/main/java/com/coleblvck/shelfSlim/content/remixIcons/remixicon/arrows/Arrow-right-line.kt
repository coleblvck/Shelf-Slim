package com.coleblvck.shelfSlim.content.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.content.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-right-line`: ImageVector
    get() {
        if (`_arrow-right-line` != null) {
            return `_arrow-right-line`!!
        }
        `_arrow-right-line` = Builder(name = "Arrow-right-line", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.1716f, 10.9999f)
                lineTo(10.8076f, 5.6359f)
                lineTo(12.2218f, 4.2217f)
                lineTo(20.0f, 11.9999f)
                lineTo(12.2218f, 19.778f)
                lineTo(10.8076f, 18.3638f)
                lineTo(16.1716f, 12.9999f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.9999f)
                horizontalLineTo(16.1716f)
                close()
            }
        }
        .build()
        return `_arrow-right-line`!!
    }

private var `_arrow-right-line`: ImageVector? = null
