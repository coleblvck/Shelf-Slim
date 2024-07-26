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

public val ArrowsGroup.`Arrow-down-line`: ImageVector
    get() {
        if (`_arrow-down-line` != null) {
            return `_arrow-down-line`!!
        }
        `_arrow-down-line` = Builder(name = "Arrow-down-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0001f, 16.1716f)
                lineTo(18.3641f, 10.8076f)
                lineTo(19.7783f, 12.2218f)
                lineTo(12.0001f, 20.0f)
                lineTo(4.2219f, 12.2218f)
                lineTo(5.6361f, 10.8076f)
                lineTo(11.0001f, 16.1716f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0001f)
                verticalLineTo(16.1716f)
                close()
            }
        }
        .build()
        return `_arrow-down-line`!!
    }

private var `_arrow-down-line`: ImageVector? = null