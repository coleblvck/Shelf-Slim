package com.coleblvck.shelfSlim.ui.remixIcons.remixicon.arrows

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.coleblvck.shelfSlim.ui.remixIcons.remixicon.ArrowsGroup

public val ArrowsGroup.`Arrow-left-line`: ImageVector
    get() {
        if (`_arrow-left-line` != null) {
            return `_arrow-left-line`!!
        }
        `_arrow-left-line` = Builder(name = "Arrow-left-line", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.8284f, 10.9999f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.9999f)
                horizontalLineTo(7.8284f)
                lineTo(13.1924f, 18.3638f)
                lineTo(11.7782f, 19.778f)
                lineTo(4.0f, 11.9999f)
                lineTo(11.7782f, 4.2217f)
                lineTo(13.1924f, 5.6359f)
                lineTo(7.8284f, 10.9999f)
                close()
            }
        }
        .build()
        return `_arrow-left-line`!!
    }

private var `_arrow-left-line`: ImageVector? = null
